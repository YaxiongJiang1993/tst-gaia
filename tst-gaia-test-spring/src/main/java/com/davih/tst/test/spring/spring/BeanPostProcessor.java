package com.davih.tst.test.spring.spring;

public interface BeanPostProcessor {

    default Object postProcessorBeforeInitialization(Object bean, String beanName) {
        return bean;
    }

    default Object postProcessorAfterInitialization(Object bean, String beanName) {
        return bean;
    }
}
