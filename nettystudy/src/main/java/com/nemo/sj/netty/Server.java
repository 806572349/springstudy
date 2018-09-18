package com.nemo.sj.netty;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * create by Nemo
 * 2018/9/18  17:31
 */
public class Server {
    private ServerSocket serverSocket;

    public Server(int port) {
        try {
            this.serverSocket=new ServerSocket(port);
            System.out.println("服务端启动了,端口是:"+port);
        } catch (IOException e) {
            System.out.println("服务端启动异常");
        }
    }

    public void start(){
        new Thread(this::doStart).start();

    }

    private void doStart() {
        while (true){
            try {
                Socket client = serverSocket.accept();
                new ClientHandler(client).start();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("服务端异常");

            }

        }
    }
}
