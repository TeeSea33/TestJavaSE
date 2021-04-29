package com.chs;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-04 - 04 - 04 - 10:38
 * @Description: com.chs
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        //自动装箱int---->Integer
        Integer i = 12;
        System.out.println(i);
        //自动拆箱
        Integer i2 = new Integer(12);
        int num = i2;
        System.out.println(num);


    }
}
