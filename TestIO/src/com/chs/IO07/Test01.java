package com.chs.IO07;

import java.io.*;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-30 - 04 - 30 - 8:07
 * @Description: com.chs.IO07
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        //序列化：将内存对象----》文件中
        //有一个对象
        Person p = new Person(18,"丽丽");
        //有对象流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("D:\\FUTURE\\Java\\IDEA_workspace\\TestJavaSE\\TestIO\\src\\com\\chs\\IO07\\test.txt")));
        //向外写
        oos.writeObject(p);
        //关闭流
        oos.close();


    }
}
