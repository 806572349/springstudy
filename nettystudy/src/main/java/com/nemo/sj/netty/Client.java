package com.nemo.sj.netty;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.IOException;
import java.net.Socket;

/**
 * create by Nemo
 * 2018/9/18  17:48
 */
public class Client {
public static final int PORT=8080;
public static final int SLEEP_TIME=5000;
public static final String HOST="127.0.0.1";


    public static void main(String[] args) throws IOException {
            Socket socket = new Socket(HOST, PORT);
        System.out.println("客户端启动成功");
        while (true){
            String msg="hello world";
            System.out.println("客户端发送数据："+msg);
            try {
                socket.getOutputStream().write(msg.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("写数据错");
            }
            sleep();
        }



    }

    private static void sleep() {
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
