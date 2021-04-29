package com.chs.IO01;

import javax.xml.transform.Source;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-26 - 04 - 26 - 20:39
 * @Description: com.chs.IO01
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        //文件---》程序
        //有一个文件-----》创建一个file类的对象
        File f = new File("D:\\FUTURE\\Java\\IDEA_workspace\\TestJavaSE\\TestIO\\src\\com\\chs\\IO01\\test.txt");
        //利用FileReader这个流，这个管怼到源文件上去----》创建一个fileRader的流的对象
        FileReader fr = new FileReader(f);
        //进行操作“吸”动作---》读取动作
        //
        //有以下代码可以看出文件读到最后的时候是-1
        /*int n = fr.read();
        int n1 = fr.read();
        int n2= fr.read();
        int n3 = fr.read();
        int n4 = fr.read();
        int n5 = fr.read();
        int n6 = fr.read();
        System.out.println((char)n);
        System.out.println((char)n1);
        System.out.println((char)n2);
        System.out.println((char)n3);
        System.out.println((char)n4);
        System.out.println((char)n5);
        System.out.println(n6);*/
        //方式1：
        int n = fr.read();
        while (n != -1){
            System.out.println(n);
            n = fr.read();
        }
       /* int n = fr.read();
        while(n!=-1){
            System.out.println(n);
            n = fr.read();
        }*/
        //方式2：
       /* int n;
        while((n = fr.read())!=-1){
            System.out.println((char)n);
        }*/
        //关闭流
        //"管"不用了
        fr.close();


    }
}
