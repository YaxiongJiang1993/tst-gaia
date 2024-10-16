package com.davih.tst.common.test.base64;

import java.util.Base64;

public class Base64Test {

    public static void main(String[] args) {
        String factor = "0icr1j7XyoM1D2AxIv/akg==";
        byte[] res = Base64.getDecoder().decode(factor);
        System.out.println("=============================================");
        for (byte b : res) {
            System.out.println(b);
        }
        System.out.println("=============================================");
    }
}
