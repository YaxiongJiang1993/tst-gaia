package com.davih.tst.test.spring.spring;

import lombok.Data;

@Data
public class BeanDefinition {

    private Class<?> clazz;

    private String type;

    private boolean lazy;

}
