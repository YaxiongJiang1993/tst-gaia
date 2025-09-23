package com.davih.tst.jedis.connection;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Connection {

    private String host;

    private int port;

    private Socket socket;

    private InputStream inputStream;

    private OutputStream outputStream;

    public Connection(String host, int port) {
        this.host = host;
        this.port = port;
    }

    private void connect() {
        try {
            if (!isConnected()) {
                socket = new Socket(host, port);
                inputStream = socket.getInputStream();
                outputStream = socket.getOutputStream();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean isConnected() {
        return socket != null && socket.isBound() && !socket.isClosed() && socket.isConnected();
    }

    public void close() {
        try {
            if (isConnected()) {
                socket.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendCommand(byte[]... bytes) {

    }

    public String replyCode() {
        byte[] bytes = new byte[1024];
        try {
            this.inputStream.read(bytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new String(bytes);
    }
}
