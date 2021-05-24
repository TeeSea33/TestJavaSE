package com.chs.test01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-05-19 - 05 - 19 - 9:27
 * @Description: com.chs.test01
 * @version: 1.0
 */
public class ServerThread extends Thread {
    InputStream is = null;
    ObjectInputStream ois = null;
    OutputStream os = null;
    DataOutputStream dos = null;
    Socket s = null;

    public ServerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        InputStream is = null;
        ObjectInputStream ois = null;
        OutputStream os = null;
        DataOutputStream dos = null;
        try {
            is= s.getInputStream();
            ois = new ObjectInputStream(is);

            //4.读取对象
        /*String str = dis.readUTF();
        System.out.println(str);*/
            User user = (User)(ois.readObject());

            //7.判断客户端的账号密码是否正确
            boolean flag = false;
            if(user.getName().equals("lili")&&user.getPwd().equals("111111")){
                flag = true;
            }else{
                flag = false;
            }

            //6.将验证结果传输到客户端：操作流--》输出流
            os= s.getOutputStream();
            dos = new DataOutputStream(os);
            dos.writeBoolean(flag);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            //5.关闭流
            try {
                if (dos!=null){
                    dos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (os!=null){
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (ois!=null){
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (is!=null){
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
