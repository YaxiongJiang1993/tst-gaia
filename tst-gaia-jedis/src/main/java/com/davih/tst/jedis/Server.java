package com.davih.tst.jedis;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Objects;

public class Server {
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(6380);
            while (true) {
                Socket socket = serverSocket.accept();
                if (Objects.nonNull(socket) && socket.isConnected()) {
                    new Thread(new Listener(socket)).start();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class Listener implements Runnable {

        private Socket socket;

        private Listener(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            byte[] buf = new byte[1024];
            try {
                this.socket.getInputStream().read(buf);
                System.out.println("receive a resp content: ----->");
                System.out.println(new String(buf));
                close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        protected void close() throws IOException {
            if (Objects.nonNull(socket) && socket.isConnected()) {
                socket.close();
            }
        }
    }
}
