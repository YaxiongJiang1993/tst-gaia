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
import org.springframework.http.MediaType;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;
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
    public Object rateLimit(ProceedingJoinPoint pjp, GaiaRateLimiter gaiaRateLimiter) throws Throwable {

        String key = parseSpel(pjp, gaiaRateLimiter.key(), String.class);
        long windowRight = System.currentTimeMillis();
        long windowLeft = windowRight - gaiaRateLimiter.windowSize() * 1000L;
        Object[] limitParams = new Object[]{windowLeft, windowRight, gaiaRateLimiter.total()};
        boolean accquire = rateLimitService.accquire(key, limitParams);
        if (!accquire) {
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            HttpServletResponse response = attributes.getResponse();
            response.setCharacterEncoding("UTF-8");
            // 在这里处理异常并直接写入响应
            response.setStatus(HttpServletResponse.SC_BAD_GATEWAY); // 设置HTTP状态码
            response.setContentType(MediaType.APPLICATION_JSON_VALUE); // 设置响应类型为JSON
            String errsMsg = "{\"code\":1002, \"data\":null, \"msg\":\"server busy, try again later\"}";
            //这里传提示语可以改成自己项目的返回数据封装的类
            response.getWriter().write(errsMsg);
            response.getWriter().flush();
            return null;
        }

        // 执行目标方法
        return pjp.proceed();
    }

    private <T> T parseSpel(ProceedingJoinPoint pjp, String expression, Class<T> clazz) {

        // 获取方法参数
        Object[] args = pjp.getArgs();
        String[] paramNames = ((org.aspectj.lang.reflect.MethodSignature) pjp.getSignature()).getParameterNames();

        // 解析SpEL表达式
        ExpressionParser parser = new SpelExpressionParser();

        // 创建SpEL上下文并将方法参数传入
        StandardEvaluationContext context = new StandardEvaluationContext();
        for (int i = 0; i < args.length; i++) {
            context.setVariable(paramNames[i], args[i]);
        }

        // 解析表达式
        try {
            Expression express = parser.parseExpression(expression);
            return express.getValue(context, clazz);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
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
