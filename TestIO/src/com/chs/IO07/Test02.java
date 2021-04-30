package com.chs.IO07;

import java.io.*;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-30 - 04 - 30 - 8:22
 * @Description: com.chs.IO07
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("D:\\FUTURE\\Java\\IDEA_workspace\\TestJavaSE\\TestIO\\src\\com\\chs\\IO07\\test.txt")));
        //读入内存：
        Person p = (Person) (ois.readObject());
        System.out.println(p);
        //关闭流
        ois.close();
    }
}
