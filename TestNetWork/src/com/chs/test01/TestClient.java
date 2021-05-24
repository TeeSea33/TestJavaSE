package com.chs.test01;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-05-18 - 05 - 18 - 10:13
 * @Description: com.chs.test01
 * @version: 1.0
 */
public class TestClient {
    public static void main(String[] args) /*throws IOException*/ {
        System.out.println("客户端启动");

        //5.添加录入用户账号密码的功能：
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账号名称：");
        String name = sc.next();
        System.out.println("请输入密码：");
        String pwd = sc.next();
        User user = new User(name,pwd);
        //1.创建套接字;指定服务器的ip 和 端口号
        Socket s = null;
        OutputStream os = null;
        ObjectOutputStream oos = null;
        InputStream is = null;
        DataInputStream dis = null;
        try {
            s = new Socket("192.168.23.1",8080);
            //2.利用输出流,因为没有直接发送字符串的方法就在外面套了一个处理流
             os = s.getOutputStream();
             oos = new ObjectOutputStream(os);
            oos.writeObject(user);

            //4.接收服务器端已收到信息的回话：操作流——》输入流
             is = s.getInputStream();
             dis = new DataInputStream(is);
            Boolean flag = dis.readBoolean();
            if(flag){
                System.out.println("账号密码正确，登录成功");
            }else {
                System.out.println("账号密码错误，登录失败");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //3.关闭套接字和流
            try {
                if(dis!=null){
                    dis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (is!= null){
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(oos!=null){
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(os!=null){
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(s!=null){
                    s.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
}
