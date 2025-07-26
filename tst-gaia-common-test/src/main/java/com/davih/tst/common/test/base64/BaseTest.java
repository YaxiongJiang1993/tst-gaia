package com.davih.tst.common.test.base64;

public class BaseTest {

    public static void main(String[] args) {
        String tableName = "ads_bh_element_click_stat_mi";
        String tableSuffix = tableName.substring(tableName.lastIndexOf("_") + 1);
        System.out.println(tableSuffix);
    }
}
