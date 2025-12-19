package com.davih.tst.test.spring.busi.service;

import com.davih.tst.test.spring.spring.BeanPostProcessor;
import com.davih.tst.test.spring.spring.annotation.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Component
public class TestBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessorAfterInitialization(Object bean, String beanName) {
        System.out.println("TestBeanPostProcessor after initialize, beanName: " + beanName);

        if ("userService".equals(beanName)) {
            Object proxyInstance = Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    // 切面逻辑
                    System.out.println("TestBeanPostProcessor aspect ... ");
                    return method.invoke(bean, args);
                }
            });

            return proxyInstance;
        }

        return bean;
    }
}
