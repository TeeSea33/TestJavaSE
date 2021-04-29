package com.chs.test02;

import com.sun.org.apache.xpath.internal.operations.Lt;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-07 - 04 - 07 - 10:40
 * @Description: com.chs.test02
 * @version: 1.0
 */
public class Test07 {
    public static void main(String[] args) {
        //1.完成实例化
        //方法一：now()
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);//年月日
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);//时分秒
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);//日期加时间

        //方法二：of
        LocalDate of = LocalDate.of(2010,5,6);
        LocalTime of1 = LocalTime.of(12, 23, 12);
        LocalDateTime of2 = LocalDateTime.of(1890, 2, 12, 12, 43, 3);

        //用的最多的是LocalDateTime
        //下面讲解LocalDateTime
        //一系列常用的get***
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getMinute());


        //不是set方法，叫with
        //原先的日期不可变，变化后产生新的日期新的变量
        LocalDateTime localDateTime2 = localDateTime.withMonth(8);
        System.out.println(localDateTime);
        System.out.println(localDateTime2);
        //提供了加减操作
        LocalDateTime localDateTime1 = localDateTime.plusMonths(2);
        System.out.println(localDateTime1);



    }
}
