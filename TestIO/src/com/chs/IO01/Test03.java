package com.chs.IO01;

import sun.font.FontRunIterator;
import sun.security.util.Length;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-27 - 04 - 27 - 9:19
 * @Description: com.chs.IO01
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        //1.有一个目标文件
        File f = new File("D:\\FUTURE\\Java\\IDEA_workspace\\TestJavaSE\\TestIO\\src\\com\\chs\\IO01\\demo.txt");
        //2.FileWriter
        FileWriter fw = new FileWriter(f);
        //FileWriter fw = new FileWriter(f,false);
        //默认是false是对原来文件进行覆盖；改为true以后就是在后面追加
        //3.开始动作
        //一个字符一个字符
        String str ="hello你好";
        char[] ch = str.toCharArray();//缓冲数组
        fw.write(ch);
       /* for (int i = 0; i < str.length(); i++) {
            fw.write(str.charAt(i));
        }*/
        //4.关闭流
        fw.close();
    }
}
