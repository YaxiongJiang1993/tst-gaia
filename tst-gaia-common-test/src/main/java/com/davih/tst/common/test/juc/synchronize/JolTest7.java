package com.davih.tst.common.test.juc.synchronize;

import org.openjdk.jol.info.ClassLayout;

public class JolTest7 {

    public static void main(String[] args) {

        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Object obj = new Object();
        String objStr = ClassLayout.parseInstance(obj).toPrintable();
        System.out.println(objStr);

        new Thread(()->{
            synchronized (obj) {
                String objStr2 = ClassLayout.parseInstance(obj).toPrintable();
                System.out.println(objStr2);
            }
        }).start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            synchronized (obj) {
                String objStr2 = ClassLayout.parseInstance(obj).toPrintable();
                System.out.println(objStr2);
            }
        }).start();
    }
}