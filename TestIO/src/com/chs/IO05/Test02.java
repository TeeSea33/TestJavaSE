package com.chs.IO05;

import java.io.*;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-29 - 04 - 29 - 20:58
 * @Description: com.chs.IO05
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        //DataInputStream:将文件中存储的基本数据类型和字符串 写入到内存的变量中
        DataInputStream dis = new DataInputStream(new FileInputStream(new File("D:\\FUTURE\\Java\\IDEA_workspace\\TestJavaSE\\TestIO\\src\\com\\chs\\IO05\\Test.txt")));
        //将文件中的内容读取到程序中来：
        System.out.println(dis.readUTF());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());

        //关闭流
        dis.close();
    }
}
