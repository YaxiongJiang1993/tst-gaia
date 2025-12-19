package com.davih.tst.test.spring.busi.service;

import com.davih.tst.test.spring.busi.annotation.TestValue;
import com.davih.tst.test.spring.spring.BeanPostProcessor;
import com.davih.tst.test.spring.spring.annotation.Component;

import java.lang.reflect.Field;

@Component
public class TestValueBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessorBeforeInitialization(Object bean, String beanName) {

        Field[] declaredFields = bean.getClass().getDeclaredFields();

        for (Field field: declaredFields){
            if(field.isAnnotationPresent(TestValue.class)){
                TestValue testValue=field.getAnnotation(TestValue.class);
                field.setAccessible(true);
                try {
                    field.set(bean, testValue.value());
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        return bean;
    }
}
