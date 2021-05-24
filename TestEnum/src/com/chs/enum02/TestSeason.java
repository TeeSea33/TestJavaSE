package com.chs.enum02;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-05-20 - 05 - 20 - 15:46
 * @Description: com.chs.enum02
 * @version: 1.0
 */
public class TestSeason {
    public static void main(String[] args) {
        Season winter = Season.WINTER;
        System.out.println(winter);
        //enum关键字对应的枚举类的上层父类是java.lang.enum
        //自己定义的枚举类上层是object
        System.out.println(Season.class.getSuperclass().getName());//java.lang.enum
        //等我们老了 去你妈的老了 去你妈的老了 全都是骗人的 全部都是骗人的
    }
}
