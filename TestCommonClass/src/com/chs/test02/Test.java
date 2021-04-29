package com.chs.test02;

import java.sql.SQLOutput;
import java.util.Date;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-05 - 04 - 05 - 10:07
 * @Description: com.chs.test02
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //java.util.Date:
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.toString());
        System.out.println(d.toGMTString());//过期方法
        System.out.println(d.toLocaleString());

        System.out.println(d.getYear());//120+1900=2020
        System.out.println(d.getMonth());//5  返回值在0和11之间，值0表示一月
        //返回自1970年1月1日00:00:00 GMT以此Date对象表示的毫
        System.out.println(d.getTime());
        System.out.println(System.currentTimeMillis());
        /*
        (1)疑问：以后或缺时间差用：getTime()还是currentTimeMillis()
        答案：currentTimeMillis()--->因为这个方法是静态的，可以类名.方法名调用
       （2）public static native long currentTimeMillis();
       是本地方法
       为什么没有犯法体？因为这个方法的具体实现不是通过java写的
       （3）这个方法的作用：
       一般会去衡量一些算法所用的时间
         */
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <10000; i++) {
            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);

    }
}
