package com.nemo.sj.netty;

/**
 * create by Nemo
 * 2018/9/18  17:53
 */
public class ServerBoot {
    public static final int PORT=8080;

    public static void main(String[] args) {
        Server server = new Server(PORT);
        server.start();
    }
}
