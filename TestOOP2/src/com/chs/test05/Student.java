package com.chs.test05;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-20 - 03 - 20 - 10:27
 * @Description: com.chs.test05
 * @version: 1.0
 */
public class Student extends Person {
    double score;
    int age;//子类中与父类有同名属性
    public void study(){
        System.out.println("我可以学习");

    }
    public void a(){
        System.out.println(this.age);
        System.out.println(super.age);//如果需要访问父类里面的东西，但是子类有同名的，那就需要加一个super.

    }



}
