package com.chs.test02;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-05-19 - 05 - 19 - 10:15
 * @Description: com.chs.test02
 * @version: 1.0
 */
public class TestSend {//发送方

    public static void main(String[] args) {
        System.out.println("学生上线。。。");
        //使用套接字DatagramSocket(UDP) 指定发送方的端口号
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket(8080);
            while(true){
                //准备数据包
                //添加键盘输入信息的功能
                System.out.print("学生说：");
                Scanner sc = new Scanner(System.in);
                String str = sc.next();
                byte[] bytes = str.getBytes();
        /*
        	§ 1.指的是传送数据转为字节数组
			§ 2.字节数组的长度
			§ 3.封装接收方的ip
			§ 4.指定接收方的端口号

         */
                DatagramPacket dp = new DatagramPacket(bytes,bytes.length,
                        InetAddress.getByName("localhost"),9999);

                //发送
                ds.send(dp);
                if (str.equals("byebye")){
                    System.out.println("学生下线");
                    break;
                }

                //接受老师那边的回复
                //定义一个空数组和空数据包
                byte[] b2 = new byte[1024];
                DatagramPacket dp2 = new DatagramPacket(b2,b2.length);
                //接收数据包
                ds.receive(dp2);
                //取出数据
                byte[] data = dp2.getData();
                String s = new String(data,0,dp2.getLength());
                System.out.println("老师："+s);
            }




    } catch (SocketException | UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            ds.close();
        }





    }
}
