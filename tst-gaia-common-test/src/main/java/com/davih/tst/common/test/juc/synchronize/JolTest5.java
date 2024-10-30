package com.davih.tst.common.test.juc.synchronize;

import org.openjdk.jol.info.ClassLayout;

public class JolTest5 {

    public static void main(String[] args) {

        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Object obj = new Object();
        String objStr = ClassLayout.parseInstance(obj).toPrintable();
        System.out.println(objStr);

        synchronized (obj) {
            obj.notify();
            /*try {
                obj.wait(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/

            objStr = ClassLayout.parseInstance(obj).toPrintable();
            System.out.println(objStr);
        }
    }
}
