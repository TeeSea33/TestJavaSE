package com.chs.IO04;

import javax.xml.transform.Source;
import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-29 - 04 - 29 - 11:00
 * @Description: com.chs.IO04
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        //得到的是标准的输入流--》从键盘输入
        /*InputStream in = System.in;
        //调用方法
        int n = in.read();//read方法等待键盘的录入，所以这个方法是一个阻塞方法
        System.out.println(n);*/

        //案例：从键盘录入一个int类型的数据：
        //从上面的代码证明。键盘录入实际上是system.in
        //形象理解：就是一个管，怼到键盘上面去了，所以你从键盘录入的话，就从这个管到程序中了
        //Scanner的作用:扫描器，起扫描作用的。
        /*Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i);*/

        File f = new File("D:\\FUTURE\\Java\\IDEA_workspace\\TestJavaSE\\TestIO\\src\\com\\chs\\IO04\\Test.txt");

        //既然这个Scanner是扫描器，可以接其他的管
        Scanner sc = new Scanner(new FileInputStream(new File("Test.txt")));
        while (sc.hasNext()){
            System.out.println(sc.next());
        }
    }
}















































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































