package com.davih.tst.test.spring.busi;

import com.davih.tst.test.spring.busi.service.IUser;
import com.davih.tst.test.spring.spring.DavihApplicationContext;

public class Test {

    public static void main(String[] args) {

        DavihApplicationContext applicationContext = new DavihApplicationContext(AppConfig.class);

        IUser userService = (IUser) applicationContext.getBean("userService");
        userService.test();

//        System.out.println( applicationContext.getBean("userService"));
//        System.out.println( applicationContext.getBean("userService"));
//        System.out.println( applicationContext.getBean("userService"));
    }
}
