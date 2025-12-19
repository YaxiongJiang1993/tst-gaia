package com.davih.tst.test.spring.busi.service;

import com.davih.tst.test.spring.busi.annotation.TestValue;
import com.davih.tst.test.spring.spring.BeanNameAware;
import com.davih.tst.test.spring.spring.annotation.Autowired;
import com.davih.tst.test.spring.spring.annotation.Component;

@Component("userService")
//@Scope("prototype")
public class UserService implements IUser, BeanNameAware {

    @Autowired
    private OrderService orderService;

    @TestValue("xxx")
    private String test;

    private String beanName;

    @Override
    public void test() {
        System.out.println("test value: " + test);
    }


    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }
}
