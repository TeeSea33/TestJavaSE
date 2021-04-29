package com.chs.test01;

import java.util.Scanner;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-03 - 04 - 03 - 16:10
 * @Description: com.chs.test01
 * @version: 1.0
 */
public class Test5 {
    public static void main(String[] args) {
        //实现一个功能：两个数相除，当除数为0，程序出现异常

    }
    public static void devide(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入第一个数");
        int num1 = sc.nextInt();
        System.out.println("请录入第二个数");
        int num2 = sc.nextInt();
        if(num2 == 0){
            //制造运行时异常；
            throw new RuntimeException();
        }else{
            System.out.println("商："+num1/num2);
            
        }
    }

}
