package com.davih.tst.common.test.juc.synchronize;

import org.openjdk.jol.info.ClassLayout;

public class JolTest3 {

    public static void main(String[] args) {

        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Object obj = new Object();
        String objStr = ClassLayout.parseInstance(obj).toPrintable();
        System.out.println(objStr);
        obj.hashCode();
        objStr = ClassLayout.parseInstance(obj).toPrintable();
        System.out.println(objStr);

        synchronized (obj) {
            objStr = ClassLayout.parseInstance(obj).toPrintable();
            System.out.println(objStr);
        }
    }
}
