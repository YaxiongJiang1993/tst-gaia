package com.davih.tst.test.spring.busi.service;

import com.davih.tst.test.spring.spring.InitializingBean;
import com.davih.tst.test.spring.spring.annotation.Component;

@Component("orderService")
public class OrderService implements InitializingBean {

    public void test(){
        System.out.println(" test ...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("UserService afterPropertiesSet ...");
    }

}
