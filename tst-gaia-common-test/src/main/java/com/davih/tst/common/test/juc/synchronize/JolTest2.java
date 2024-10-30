package com.davih.tst.common.test.juc.synchronize;

import org.openjdk.jol.info.ClassLayout;

public class JolTest2 {

    public static void main(String[] args) {

        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Object obj = new Object();
        String objStr = ClassLayout.parseInstance(obj).toPrintable();
        System.out.println(objStr);

        synchronized (JolTest2.class) {
            objStr = ClassLayout.parseInstance(JolTest2.class).toPrintable();
            System.out.println(objStr);
        }
    }
}
