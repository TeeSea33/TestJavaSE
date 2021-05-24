package com.chs.enum03;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-05-20 - 05 - 20 - 16:06
 * @Description: com.chs.enum03
 * @version: 1.0
 */
public class TestSeason {
    public static void main(String[] args) {
        Season winter = Season.WINTER;
        //toString
        System.out.println(winter/*.toString()*/);

        //vaules:返回枚举对象的数组
        System.out.println("-------------");
        Season[] values = Season.values();
        for (Season e:values){//对数组进行遍历
            System.out.println(e);
        }

        System.out.println("-------");
        //valueOf:通过枚举对象名字来获取对象
        Season spring = Season.valueOf("SPRING");
        System.out.println(spring);

    }
}
