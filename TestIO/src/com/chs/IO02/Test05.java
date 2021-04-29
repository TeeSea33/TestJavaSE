package com.chs.IO02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-27 - 04 - 27 - 21:11
 * @Description: com.chs.IO02
 * @version: 1.0
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        //图片一
        File f1 = new File("D:\\FUTURE\\Java\\IDEA_workspace\\TestJavaSE\\TestIO\\src\\com\\chs\\IO02\\gun.jpg");
        //图片二
        File f2 = new File("D:\\FUTURE\\Java\\IDEA_workspace\\TestJavaSE\\TestIO\\src\\com\\chs\\IO02\\gun2.jpg");
        //读取文件的流
        FileInputStream fis = new FileInputStream(f1);
        //写文件的流
        FileOutputStream fos = new FileOutputStream(f2);

        long startTime = System.currentTimeMillis();
        //缓冲数组
        byte[] b = new byte[1024];
        int len = fis.read(b);
        while (len!=-1){
            fos.write(b,0,len);//必须要有一范围，不然就会写多
            len = fis.read(b);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("复制的时间是："+(endTime-startTime));
        //关闭两个流
        fos.close();
        fis.close();
    }
}
