package com.chs.test01;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-29 - 03 - 29 - 16:06
 * @Description: com.chs.test01
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Pig p = new Pig();
        Animal an = p;//向上转型
        an.shout();

        //加入转型的代码
        //将animal转为pig类型
        Pig pig = (Pig)an;//向上转型
        pig.eat();
        pig.weight = 60.8;



    }
}
