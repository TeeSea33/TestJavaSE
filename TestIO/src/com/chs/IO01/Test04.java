package com.chs.IO01;

import javax.annotation.processing.Filer;
import java.io.*;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-27 - 04 - 27 - 10:16
 * @Description: com.chs.IO01
 * @version: 1.0
 */
public class Test04 {
    public static void main(String[] args) throws IOException {
        //1.有一个源文件
        File f1 = new File("D:\\FUTURE\\Java\\IDEA_workspace\\TestJavaSE\\TestIO\\src\\com\\chs\\IO01\\test.txt");
        //2.有一个目标文件
        File f2 = new File("D:\\FUTURE\\Java\\IDEA_workspace\\TestJavaSE\\TestIO\\src\\com\\chs\\IO01\\demo.txt");
        //3.输入
        FileReader fr = new FileReader(f1);
        //4.输出
        FileWriter fw = new FileWriter(f2);
        //5.开始动作
        //一、一个一个的读
        /*int n = fr.read();
        while (n!=-1){
            fw.write(n);
            n = fr.read();
        }*/
        //二、缓冲数组
        char[] ch = new char[5];
        int n = fr.read(ch);

        //6.关闭流:倒着关闭
        fw.close();
        fr.close();




    }
}
