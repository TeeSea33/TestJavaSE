package com.chs.test05;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-30 - 03 - 30 - 14:42
 * @Description: com.chs.test05
 * @version: 1.0
 */
public interface TestInterface {
    //常量：
    public static final int NUM = 10;
    //抽象方法：
    public abstract void a();
    //public default修饰的非抽象方法:default修饰符必须要加上
    public default void b(){
        System.out.println("testinterface----b");

    }
}
class Test implements TestInterface{
    public void c(){
        b();
        /*super.b();*/
        TestInterface.super.b();
    }
    @Override
    public void a() {

    }

    @Override
    public void b() {

    }//重写非抽象不能加default

}