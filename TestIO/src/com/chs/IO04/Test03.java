package com.chs.IO04;

import java.io.*;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-29 - 04 - 29 - 16:06
 * @Description: com.chs.IO04
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        //1.先准备输入方向
        //键盘录入：
        InputStream in = System.in;//属于字节流
        //字节流--》字符流：
        InputStreamReader isr = new InputStreamReader(in);
        //在isr外面再套一个缓冲流
        BufferedReader  br = new BufferedReader(isr);

        //2.再准备输出方向
        //目标文件：文本文档
        //字符流--》字节流
        File f = new File("D:\\FUTURE\\Java\\IDEA_workspace\\TestJavaSE\\TestIO\\src\\com\\chs\\IO04\\Test2.txt");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);

        //3.开始动作
        //准备目标文件课在准备输方向
        String s = br.readLine();
        while (!s.equals("exit")){
            bw.write(s);
            bw.newLine();
            s = br.readLine();
        }

        //4.关闭流
        bw.close();
        br.close();


    }


}
