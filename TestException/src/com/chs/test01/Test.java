package com.chs.test01;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-02 - 04 - 02 - 11:08
 * @Description: com.chs.test01
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //实现一个功能就是键盘录入两个数，然后求这两个数的上
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("请录入第一个数");
            int num1 = sc.nextInt();
            System.out.println("请录入第二个数");
            int num2 = sc.nextInt();
            System.out.println("商:"+ num1/num2);
        }catch (Exception ex){
            //第一种处理：什么都不写

            //第二种处理：
            System.out.println("你的程序出现了异常！");
            //第三种处理:打印异常
            /*1.调用toString方法，显示异常的类名（全限定路径）*/
            /*System.out.println(ex);
            System.out.println(ex.toString());*/
            /*2.显示异常描述信息对应的字符串，如果没有就显示null*/
            /*System.out.println(ex.getMessage());*/
            /*3.显示异常的堆栈信息：就是将异常信息捕获以后展示出来方便查看*/
            ex.printStackTrace();
            //第四种处理方式：
            //第四种处理方式：抛出异常
            throw ex;

        }
    }
}
