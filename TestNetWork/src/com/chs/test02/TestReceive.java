package com.chs.test02;
import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-05-19 - 05 - 19 - 10:27
 * @Description: com.chs.test02
 * @version: 1.0
 */
public class TestReceive {//接收方

    public static void main(String[] args)  {
        System.out.println("老师上线。。。");
        //创建套接字，指定接收方的端口号
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket(9999);
            while (true){
                //定义一个空数组和空数据包
                byte[] bytes = new byte[1024];
                DatagramPacket dp = new DatagramPacket(bytes,bytes.length);

                //接受数据包
                ds.receive(dp);

                //取出数据
                byte[] data = dp.getData();
                String s = new String(data,0,dp.getLength());
                System.out.println("学生："+s);
                if (s.equals("byebye")){
                    System.out.println("学生下线，老师下线。。。");
                    break;
                }


                //老师进行回复
                //准备数据包
                //加入键盘录入信息
                System.out.print("老师：");
                Scanner sc = new Scanner(System.in);
                String str = sc.next();
                byte[] b2 = str.getBytes();
                DatagramPacket dp2 = new DatagramPacket(b2,b2.length,
                        InetAddress.getByName("localhost"),8080);//端口号是发送方的
                //老师发送给学生
                ds.send(dp2);
            }


        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            ds.close();
        }




    }
}
