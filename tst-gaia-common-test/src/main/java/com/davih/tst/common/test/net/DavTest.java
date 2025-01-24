package com.davih.tst.common.test.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class DavTest {

    public static void main(String[] args) {
        try {
            System.out.println(InetAddress.getLocalHost().getHostAddress());
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
