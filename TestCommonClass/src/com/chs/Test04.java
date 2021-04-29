package com.chs;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-04 - 04 - 04 - 10:50
 * @Description: com.chs
 * @version: 1.0
 */
public class Test04 {
    public static void main(String[] args) {
        //compareTo:只返回三个值：0,1，-1
        Integer i1 = new Integer(18);
        Integer i2 = new Integer(12);
        System.out.println(i2.compareTo(i1));//return (x < y) ? -1 : ((x == y) ? 0 : 1);
        //equals：integer对象是通过new关键字创建的对象
        Integer i3 = new Integer(18);
        Integer i4 = new Integer(12);
        System.out.println(i3 == i4);//false 因为==比较的是两个的地址
        boolean flag = i3.equals(i4);

        //Integer对象通过自动装箱来完成
        Integer i5 = 130;
        Integer i6 = 130;
        System.out.println(i5.equals(i6));
        System.out.println(i5 == i6);
        /*
        如果自动装箱值在-128~127之间，那么比较的就是具体的数值
        否则比较的就是对象的地址
         */

        //intVaule
        Integer i7 = 130;
        int i = i7.intValue();
        System.out.println(i);

        //parseInt(String s):String --->int
        int i8 = Integer.parseInt("12");
        System.out.println(i8);


        //toString:integer---->string
        Integer i9 = 130;
        System.out.println(i9.toString());

    }
}
