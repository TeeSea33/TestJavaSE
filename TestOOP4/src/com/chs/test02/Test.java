package com.chs.test02;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-29 - 03 - 29 - 17:43
 * @Description: com.chs.test02
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //第一种情况
        //final修饰一个变量，变量的值不可以改变，这个变量也变成了一个字符常量，约定俗成的规定：名字大写
        final int S = 10;//final 修饰基本数据类型

        //第二种情况
        final Dog d = new Dog();//final修饰应用数据类型，地址值就不可以改变
//        d = new Dog();不可以改变
        //d的属性可以改变
        d.age = 10;
        d.weight = 23;

        //第三种情况：
        final Dog d2 = new Dog();
    }
    public static void a(Dog d){
        d = new Dog();
    }

}
