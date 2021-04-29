package com.chs.IO06;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-29 - 04 - 29 - 21:14
 * @Description: com.chs.IO06
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        //输出对象流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("D:\\FUTURE\\Java\\IDEA_workspace\\TestJavaSE\\TestIO\\src\\com\\chs\\IO06\\test.txt")));
        //将内存中的字符串写出到文件中：
        oos.writeObject("年后");

        //关闭流
        oos.close();

    }
}
