package com.chs.test01;

import javax.xml.transform.Source;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-05-18 - 05 - 18 - 10:18
 * @Description: com.chs.test01
 * @version: 1.0
 */
public class TestServer {
    public static void main(String[] args) /*throws IOException, ClassNotFoundException*/ {
        System.out.println("服务器启动");
        //1.创建一个套接字，指定服务器的端口号
        ServerSocket ss = null;
        Socket s = null;
        //添加计数器
        int count = 0;
        try {
            ss = new ServerSocket(8080);
            //2.等待客户端发来的信息
            while (true){
                s = ss.accept();//阻塞方法，再接收到信息以后才会执行以后的代码
                new ServerThread(s).start();//启动线程
                count++;//计时器加一
                System.out.println("接收到第"+count+"个客户端的信息，" +
                        "ip地址是"+s.getInetAddress());
            }
        } catch (IOException  e) {
            e.printStackTrace();
        }
    }
}
