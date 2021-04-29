package com.chs.IO06;

import java.io.*;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-29 - 04 - 29 - 21:19
 * @Description: com.chs.IO06
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //输入对象流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("D:\\FUTURE\\Java\\IDEA_workspace\\TestJavaSE\\TestIO\\src\\com\\chs\\IO06\\test.txt")));
        //读取
        System.out.println((String)(ois.readObject()));
        //关闭流
        ois.close();
    }
}
