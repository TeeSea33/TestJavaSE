package com.chs.test05;

import javax.sound.midi.Soundbank;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-30 - 03 - 30 - 14:59
 * @Description: com.chs.test05
 * @version: 1.0
 */
public interface TestInterface2 {
    //常量：
    public static final int NUM = 10;
    //抽象方法：
    public abstract void a();
    //public default非抽象方法：
    public default void b(){
        System.out.println("----testinterface2----b");
    }
    //静态方法：必须要static
    public static void c(){
        System.out.println("-----testinterface2中的静态方法");
    }

}

//实现类
class Demo implements TestInterface{
    @Override
    public void a() {
        System.out.println("重写了a");
    }
    public static void c(){
        System.out.println("Demo中的静态方法");
    }
}

class A{
    public static void main(String[] args) {
        Demo d = new Demo();
        d.c();
        Demo.c();
        TestInterface2.c();

    }
}