package com.chs.IO02;

import java.io.*;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-29 - 04 - 29 - 9:21
 * @Description: com.chs.IO02
 * @version: 1.0
 */
public class Test07 {
    public static void main(String[] args) throws IOException {
        //有一个源文件
        File f1 = new File("D:\\FUTURE\\Java\\IDEA_workspace\\TestJavaSE\\TestIO\\src\\com\\chs\\IO02\\Test.txt");
        //有一个目标文件
        File f2 = new File("D:\\FUTURE\\Java\\IDEA_workspace\\TestJavaSE\\TestIO\\src\\com\\chs\\IO02\\Test3.txt");
        //输入流
        FileReader fr = new FileReader(f1);
        //输出流
        FileWriter fw = new FileWriter(f2);
        //加强输入
        BufferedReader br = new BufferedReader(fr);
        //加强输出
        BufferedWriter bw = new BufferedWriter(fw);

        //开始读取动作
        //1.一个一个读
        /*int n = br.read();
        while (n != -1){
            bw.write(n);
            n = br.read();
        }*/
        //2.使用缓冲数组读
        /*char[] chars = new char[1024];
        int len = br.read(chars);
        while (len != -1){
            bw.write(chars);
            len = br.read(chars);
        }*/
        //3.读取string
        String str = br.readLine();
        while (str != null){
            bw.write(str/*+"\n"*/);//在文本文件中应该再写一个换行
            bw.newLine();
            str = br.readLine();
        }
        //倒着关闭
        bw.close();
        br.close();
        bw.close();
        br.close();

    }
}
