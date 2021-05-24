package com.chs.test06;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-05-02 - 05 - 02 - 20:46
 * @Description: com.chs.test06
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) throws InterruptedException {
        //2.定义一个时间格式：
        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        while (true){
            //获取当前时间:
            Date d = new Date();
            System.out.println(d);
            //3.按照上面的定义的格式，将date类型转为指定格式的字符串
            System.out.println(df.format(d));
            Thread.sleep(1000);



        }
    }
}
