package com.davih.tst.test.spring.busi;

import com.davih.tst.test.spring.busi.service.UserService;
import com.davih.tst.test.spring.spring.DavihApplicationContext;

public class Test {

    public static void main(String[] args) {

        DavihApplicationContext applicationContext = new DavihApplicationContext(AppConfig.class);

        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.test();
    }
}
