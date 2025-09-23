package com.davih.tst.jedis;

import redis.clients.jedis.Jedis;

public class RespTest {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost", 6380);
        jedis.set("1234", "yangguo");
//        jedis.set("1234", "yangguo", "NX");
    }
}


