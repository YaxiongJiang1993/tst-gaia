package com.davih.tst.common.test.juc.synchronize;

import org.openjdk.jol.info.ClassLayout;

public class JolTest1 {

    public static void main(String[] args) {

        Object obj = new Object();
        String objStr = ClassLayout.parseInstance(obj).toPrintable();
        System.out.println(objStr);

        synchronized (obj) {
            objStr = ClassLayout.parseInstance(obj).toPrintable();
            System.out.println(objStr);
        }
    }
}
