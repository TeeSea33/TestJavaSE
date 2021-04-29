package com.chs.IO02;

import com.sun.media.sound.SoftTuning;

import java.io.*;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-28 - 04 - 28 - 11:06
 * @Description: com.chs.IO02
 * @version: 1.0
 */
public class Test06 {
    public static void main(String[] args) throws IOException {
        //文件一
        File f1 = new File("D:\\FUTURE\\Java\\IDEA_workspace\\TestJavaSE\\TestIO\\src\\com\\chs\\IO02\\gun.jpg");
        //文件二
        File f2 = new File("D:\\FUTURE\\Java\\IDEA_workspace\\TestJavaSE\\TestIO\\src\\com\\chs\\IO02\\gun3.jpg");
        //输入流
        FileInputStream fis = new FileInputStream(f1);
        //输出流
        FileOutputStream fos = new FileOutputStream(f2);
        //功能加强输入
        BufferedInputStream bis = new BufferedInputStream(fis);
        //功能加强输出
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        long startTime = System.currentTimeMillis();
        //开始动作:
        //这是一个一个读取
        /*int len = bis.read();
        while (len != -1){
            bos.write(len);
            len = bis.read();
        }*/
        byte[] b = new byte[1024];
        int len = bis.read(b);
        while (len != -1){
            bos.write(b,0,len);
             /*bos.flush();
            底层已经帮我们做了刷新缓冲区的操作，
            不用我们手动完成：底层调用flushBuffer()*/

            len = bis.read(b);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("复制的时间是："+(endTime-startTime));
        //倒着关闭
        bos.close();
        bis.close();
        fos.close();
        fis.close();


    }
}
