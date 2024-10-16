package com.davih.tst.common.test.thread;

public class ThreadPoolTest {

    public static void main(String[] args) {
        ThreadLocal threadLocal = new ThreadLocal();
        threadLocal.set("1");
        System.out.println(threadLocal.get());
        String input = "1000126";
       /* String token=Hashing.md5().hashBytes(input.getBytes()).toString();
        // 计算MD5
        System.out.println(token);*/

    }
}
