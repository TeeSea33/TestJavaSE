package com.chs.test02;

import javafx.scene.paint.Material;
import sun.util.resources.cldr.wal.CalendarData_wal_ET;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-07 - 04 - 07 - 17:05
 * @Description: com.chs.test02
 * @version: 1.0
 */
public class Test08 {
    public static void main(String[] args) {
        //格式化类：DateTimeFormatter

        //方式一：预定义的标准格式。不常用
        DateTimeFormatter df1 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //df1可以帮我们完成localDateTime和String之间的相互转换
        //LocalDateTime--》String
        LocalDateTime now = LocalDateTime.now();
        String str = df1.format(now);
        System.out.println(str);//2021-04-08T10:38:33.3
        //String----->LocalDateTime
        TemporalAccessor parse = df1.parse("2021-04-08T10:38:33.3");
        System.out.println(parse);


        //方式二：本地化相关的格式
        //参数：FormatStyle.LONG / FormatStyle.MEDIUM//FormatStyle.SHORT
        //LONG:2021年4月10日 上午11时06分27秒
        DateTimeFormatter df2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        //MEDIUM:2021-4-10 11:08:23
        DateTimeFormatter df3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        //SHORT:21-4-10 上午11:10
        DateTimeFormatter df4 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        //LocalDateTime-->String
        LocalDateTime now1 = LocalDateTime.now();
        String str2 = df2.format(now1);
        System.out.println(str2);
        String str3 = df3.format(now1);
        System.out.println(str3);
        String str5 = df4.format(now1);
        System.out.println(str5);
        //String --> LocalDateTime
        TemporalAccessor parse1 = df2.parse("2021年4月10日 上午11时06分27秒");
        System.out.println(parse1);

        //方式三：自定义的格式：如ofPattern("yyyy-MM-dd hh:mm:ss")----> 重点，常用
        DateTimeFormatter df5 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        //LocalDateTime ----> String
        LocalDateTime now2 = LocalDateTime.now();
        String str6 = df3.format(now2);
        System.out.println(str6);
        //String --> LocalDateTime
        TemporalAccessor parse2 = df3.parse("2021-4-10 11:33:44");
        System.out.println(parse2);


    }
}
