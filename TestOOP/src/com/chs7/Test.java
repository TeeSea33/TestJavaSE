package com.chs7;

import com.chs.Person;
import com.chs5.Demo;

import java.util.Date;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-18 - 03 - 18 - 15:29
 * @Description: com.chs7
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        new Person();
        new Date();
        new java.sql.Date(1000L);//在导包以后，还想用其他包下同名的类，就必须要手动自己写所在的包
        new Demo();



    }
}
