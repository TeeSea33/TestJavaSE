package com.chs.IO03;

import sun.plugin2.ipc.InProcEvent;

import java.io.*;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-29 - 04 - 29 - 9:57
 * @Description: com.chs.IO03
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        //源文件
        File f1 = new File("D:\\FUTURE\\Java\\IDEA_workspace\\TestJavaSE\\TestIO\\src\\com\\chs\\IO03\\Test.txt");
        //目标文件
        File f2 = new File("D:\\FUTURE\\Java\\IDEA_workspace\\TestJavaSE\\TestIO\\src\\com\\chs\\IO03\\Test2.txt");

        //字节输入流
        FileInputStream fis = new FileInputStream(f1);
        //处理为字符输出流:如果编码格式和源文件不一样就会出现乱码
        InputStreamReader isr = new InputStreamReader(fis,"utf-8");

        //字符输出流
        FileOutputStream fos = new FileOutputStream(f2);
        //处理为字节输出流：
        OutputStreamWriter osw = new OutputStreamWriter(fos,"gbk");
        //开始动作 将文件内容显示在控制台
        char[] chars = new char[20];
        int len = isr.read(chars);
        while (len != -1){
            osw.write(chars,0,len);
            len = isr.read(chars);
        }

        //关闭流
        osw.close();
        isr.close();

    }
}
