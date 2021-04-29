package com.chs.IO02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-27 - 04 - 27 - 20:25
 * @Description: com.chs.IO02
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        //1.有一个源文件
        File f = new File("D:\\FUTURE\\Java\\IDEA_workspace\\TestJavaSE\\TestIO\\src\\com\\chs\\IO02\\dd.jpg");
        //2.将字节流对到源文件上
        FileInputStream fis = new FileInputStream(f);
        //3.开始读取
        int count = 0;
        int n = fis.read();
        while (n != -1){
            count++;
            System.out.println(n);
            n = fis.read();
        }
        System.out.println(count);
        //4.关闭流
        fis.close();

    }
}
