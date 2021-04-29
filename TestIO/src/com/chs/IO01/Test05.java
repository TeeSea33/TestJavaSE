package com.chs.IO01;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import java.io.*;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-27 - 04 - 27 - 17:33
 * @Description: com.chs.IO01
 * @version: 1.0
 */
public class Test05 {
    public static void main(String[] args) {
        //1.有一个源文件
        File f1 = new File("D:\\FUTURE\\Java\\IDEA_workspace\\TestJavaSE\\TestIO\\src\\com\\chs\\IO01\\test.txt");
        //2.有一个目标文件
        File f2 = new File("D:\\FUTURE\\Java\\IDEA_workspace\\TestJavaSE\\TestIO\\src\\com\\chs\\IO01\\demo.txt");

        FileReader fr = null;
        FileWriter fw = null;
        try {
            //3.输入
            fr = new FileReader(f1);
            //4.输出
            fw = new FileWriter(f2);
            //5.开始动作
            char[] ch = new char[5];
            int n = fr.read(ch);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            //6.关闭流:倒着关闭
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }








    }
}
