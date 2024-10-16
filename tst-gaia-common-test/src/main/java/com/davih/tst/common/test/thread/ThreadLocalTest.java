package com.davih.tst.common.test.thread;

public class ThreadLocalTest {

    public static void main(String[] args) {
        ThreadLocal threadLocal=new ThreadLocal();
        threadLocal.set("1");
        //Thread
        System.out.println(threadLocal.get());
    }
}
