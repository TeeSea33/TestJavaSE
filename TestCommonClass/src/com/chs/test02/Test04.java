package com.chs.test02;

import sun.security.provider.ConfigFile;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-05 - 04 - 05 - 16:47
 * @Description: com.chs.test02
 * @version: 1.0
 */
public class Test04 {
    public static void main(String[] args) {
        //日期转换：
        //SimpleDateFormat(子类)extends DateFormat(父类是一个抽象类)
        //格式化标准已经定义好了
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //String--->Date
        try {
            df.parse("2019-4-6 12:23:54");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //Date -->String
        String format = df.format(new Date());
        System.out.println(format);
        

    }
}
