package com.chs.test02;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-05 - 04 - 05 - 16:05
 * @Description: com.chs.test02
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        //(1)String -->java.sql.Date
        java.sql.Date date = java.sql.Date.valueOf("2015-9-24");
        //(2)java.sql.Date--->java.util.Date
        java.util.Date date2 = date;
        System.out.println(date2.toString());











    }
}
