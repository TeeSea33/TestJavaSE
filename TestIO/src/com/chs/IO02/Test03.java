package com.chs.IO02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-27 - 04 - 27 - 20:39
 * @Description: com.chs.IO02
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        //1.有一个源文件
        File f = new File("D:\\FUTURE\\Java\\IDEA_workspace\\TestJavaSE\\TestIO\\src\\com\\chs\\IO02\\gun.jpg");
        //2.将字节流对到源文件上
        FileInputStream fis = new FileInputStream(f);
        //3.开始读取
        //利用缓冲数组
        byte[] b = new byte[1024*6];
        int len = fis.read(b);
        while (len!= -1){
            for (int i = 0; i < len; i++) {
                System.out.println(b[i]);

            }
            len = fis.read();
        }
        //4.关闭流
        fis.close();

    }
}
