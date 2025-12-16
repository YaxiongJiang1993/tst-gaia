package com.davih.tst.test.spring.busi.service;

import com.davih.tst.test.spring.spring.annotation.Component;
import com.davih.tst.test.spring.spring.annotation.Scope;

@Component("userService")
@Scope("prototype")
public class UserService {

    public void test(){
        System.out.println(" test ...");
    }
}
