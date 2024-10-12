package com.davih.tst.gaia.ratelimitor.aspect;

import com.davih.tst.gaia.ratelimitor.anno.GaiaRateLimiter;
import com.davih.tst.gaia.ratelimitor.service.RateLimitService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.LocalVariableTableParameterNameDiscoverer;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Objects;

@Aspect
public class RateLimiterAspect {

    private final ExpressionParser parser = new SpelExpressionParser();

    private final LocalVariableTableParameterNameDiscoverer discoverer = new LocalVariableTableParameterNameDiscoverer();

    private final RateLimitService rateLimitService;

    public RateLimiterAspect(RateLimitService rateLimitService) {
        this.rateLimitService = rateLimitService;
    }

    // 切入点，切入指定的注解
    @Pointcut("@annotation(gaiaRateLimiter)")
    public void pointCut(GaiaRateLimiter gaiaRateLimiter) {
    }

    @Around("pointCut(gaiaRateLimiter)") // 拦截带有@LogExecution注解的方法
    public Object logExecution(ProceedingJoinPoint pjp, GaiaRateLimiter gaiaRateLimiter) throws Throwable {
        // 获取方法参数
        Object[] args = pjp.getArgs();
        String[] paramNames = ((org.aspectj.lang.reflect.MethodSignature) pjp.getSignature()).getParameterNames();

        // 解析SpEL表达式
        String expression = gaiaRateLimiter.key();
        ExpressionParser parser = new SpelExpressionParser();

        // 创建SpEL上下文并将方法参数传入
        StandardEvaluationContext context = new StandardEvaluationContext();
        for (int i = 0; i < args.length; i++) {
            context.setVariable(paramNames[i], args[i]);
        }

        // 解析表达式并生成日志消息
        String logMessage = parser.parseExpression(expression).getValue(context, String.class);
        System.out.println("Before Execution - Log Message: " + logMessage);

        // 执行目标方法
        Object returnValue = pjp.proceed();

        // 方法执行后，可以记录日志或处理返回值
        System.out.println("After Execution - Method returned: " + returnValue);

        // 也可以修改返回值（如有需要）
        return returnValue;
    }

    private Method getMethod(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        if (method.getDeclaringClass().isInterface()) {
            try {
                method = joinPoint
                        .getTarget()
                        .getClass()
                        .getDeclaredMethod(joinPoint.getSignature().getName(),
                                method.getParameterTypes());
            } catch (SecurityException | NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }
        return method;
    }

    /**
     * 解析 spel 表达式
     *
     * @param method        方法
     * @param arguments     参数
     * @param spel          表达式
     * @param clazz         返回结果的类型
     * @param defaultResult 默认结果
     * @return 执行spel表达式后的结果
     */
    private <T> T parseSpel(Method method, Object[] arguments, String spel, Class<T> clazz, T defaultResult) {

        String[] params = discoverer.getParameterNames(method);
        EvaluationContext context = new StandardEvaluationContext();
        for (int len = 0; len < Objects.requireNonNull(params).length; len++) {
            context.setVariable(params[len], arguments[len]);
        }
        try {
            Expression expression = parser.parseExpression(spel);
            return expression.getValue(context, clazz);
        } catch (Exception e) {
            return defaultResult;
        }
    }

}
