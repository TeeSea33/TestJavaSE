package com.chs.test02;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-06 - 04 - 06 - 16:21
 * @Description: com.chs.test02
 * @version: 1.0
 */
public class Test05 {
    public static void main(String[] args) {
        //Calender是一个抽象类 不可以创建对象
        //GregorianCalendar()子类extend Calender(父类是一个抽象类)
        Calendar cal = new GregorianCalendar();
        Calendar cal2 = Calendar.getInstance();
        System.out.println(cal2);

        //常用的方法:get方法，Calender中定义的常量
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));

        //set方法

        cal.set(Calendar.YEAR,1900);
        cal.set(Calendar.MONTH,3);
        cal.set(Calendar.DATE,13);
        System.out.println(cal);

        //String---->Calender
        //分解：
        //String---》Date
        java.sql.Date date = java.sql.Date.valueOf("2020-4-5");
        //java.sql.Date--->Calender
        cal.setTime(date);
        System.out.println(cal);



    }
}
