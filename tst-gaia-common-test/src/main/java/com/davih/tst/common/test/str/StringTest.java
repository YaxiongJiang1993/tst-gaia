package com.davih.tst.common.test.str;

public class StringTest {

    public static void main(String[] args) {
        //String uid1=202903294⁣;
        String uid = "202903294\u2063";

        String uidNew = sanitizeString(uid);

        System.out.println(Long.parseLong(uidNew));
        //System.out.println(Long.parseLong(uid));
    }

    private static String sanitizeString(String str) {
        // 去除不可见字符和控制字符
        return str.replaceAll("[\\p{C}]", "");
    }


    public static void main1(String[] args) {
        String fileName = "tag-group/50ad2258bbd24514b5c76ed974552037_1709888098796.txt";
        System.out.println(fileName.substring("tag-group/".length()));
    }


}
