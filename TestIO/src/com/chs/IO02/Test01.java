package com.chs.IO02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-27 - 04 - 27 - 17:58
 * @Description: com.chs.IO02
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        //功能：利用字节流将文件中内容读到程序中
        //1.有一个源文件
        File f = new File("D:\\FUTURE\\Java\\IDEA_workspace\\TestJavaSE\\TestIO\\src\\com\\chs\\IO02\\Test.txt");
        //2.将字节流对到源文件上
        FileInputStream fis = new FileInputStream(f);
        //3.开始读取
        /*
        细节一：
        文件是utf-8进行存储的，所以英文字读底层实际占用1个字节
        但是中文字符，底层实际占用3个字节字节

        细节二：
        如果文件是文本文件，那么就不要使用字节流读取了

        细节三：
        read()读取一个字节，但是返回的是int类型
        read方法底层做了处理，让返回的数据都是正数
        就是为了避免字节返回的是-1的话无法辨别结尾还是字节
         */
        int n = fis.read();
        while(n!=-1){
            System.out.println(n);
            n = fis.read();
        }
        /*“ab你好” 每个中文都占了三个字节
        结果
        97
        98
        228
        189
        160
        229
        165
        189
         */
        //4.关闭流
        fis.close();




    }
}
