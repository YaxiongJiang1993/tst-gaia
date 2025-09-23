package com.davih.tst.jedis.client;

import com.davih.tst.jedis.connection.Connection;

public class Client {

    private Connection connection;

    public Client(String host, int port) {
        connection = new Connection(host, port);
    }

    public String set(String key, String value) {
        return null;
    }

    public String get(String key) {
        return null;
    }
}
