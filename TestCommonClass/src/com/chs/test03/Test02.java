package com.chs.test03;

import java.util.Random;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-11 - 04 - 11 - 15:40
 * @Description: com.chs.test03
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        System.out.println("随机数"+ Math.random());

        //学习Rondom类
        //（1）利用带参数的构造器创建对象,seed里面放可以返回long类型的方法才会随机
        Random r1 = new Random(100000L);
        int i = r1.nextInt();
        System.out.println(i);

        //（2）利用空参构造器
        Random r2 = new Random();//表面是在调用无参构造器，实际底层还是调用了带参构造器
        System.out.println(r2.nextInt(10));//[0,10)
        System.out.println(r2.nextDouble());
        
    }
}
