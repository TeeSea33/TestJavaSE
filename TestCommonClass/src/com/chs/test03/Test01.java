package com.chs.test03;
//静态导入
import static java.lang.Math.*;
/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-11 - 04 - 11 - 14:33
 * @Description: com.chs.test03
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        //常用属性：
        System.out.println(Math.PI);
        //常用方法：(使用静态导入以后直接省略了类名）
        System.out.println("随机数"+/*Math.*/random());//[0.0,1.0]
        System.out.println("绝对值"+abs(-80));
        System.out.println("向上取整"+ceil(9.1));
        System.out.println("向下取整"+floor(9.9));
        System.out.println("四舍五入"+round(3.4));
        System.out.println("取大的那个值"+max(3, 6));
        System.out.println("取小的那个值"+min(3, 6));





    }

    //如果和math方法重复了就会走本类方法
    public static int random(){
        return 10;

    }

}
