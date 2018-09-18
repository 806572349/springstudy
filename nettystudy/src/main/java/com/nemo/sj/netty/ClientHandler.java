package com.nemo.sj.netty;


import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * create by Nemo
 * 2018/9/18  17:40
 */
public class ClientHandler {
    public static final int MAX_DATA_LEN=1024;

    private final Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }
    public void  start(){
        System.out.println("新客户端接入");
        new Thread(new Runnable() {
            @Override
            public void run() {
                doStart();
            }
        }).start();
    }

    private void doStart() {
        try {
            InputStream inputStream = socket.getInputStream();
            while (true){
                byte[] data = new byte[MAX_DATA_LEN];
                int len;
                while ((len=inputStream.read(data))!=-1){
                    String msg = new String(data, 0, len);
                    System.out.println("从客户端传来的消息："+msg);
                    socket.getOutputStream().write(data);
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
