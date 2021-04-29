package com.chs.test02;

import java.sql.Date;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-05 - 04 - 05 - 10:46
 * @Description: com.chs.test02
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        //java.sql.Date
        Date d = new Date(1592055964263L);
        System.out.println(d);
        /*
        (1)java.sql.Date和java.util.Date的区别:
        前者：年月日 时分秒
        后者：年月日
        （2）两者的联系：sql是继承自util的

        */

        //两者相互转换
            //util--》sql
            java.util.Date date = new Date(1592055964263L);
            //方式一：向下转型
            Date date1 = (Date)date;
            //方式二：利用构造器
            Date date2 = new Date(date.getTime());

            //[2]sql-->util:
            java.util.Date date3 = d;

            //[3]String ---> sql.Date
            Date date4 = Date.valueOf("2019-2-8");



        }
    }
