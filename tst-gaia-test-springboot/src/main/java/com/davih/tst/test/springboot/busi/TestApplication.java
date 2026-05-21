package com.davih.tst.test.springboot.busi;

import com.davih.tst.test.springboot.boot.anno.TestSpringBootApplication;
import com.davih.tst.test.springboot.boot.context.TestSpringApplication;

@TestSpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        TestSpringApplication.run(TestApplication.class);
    }
}
