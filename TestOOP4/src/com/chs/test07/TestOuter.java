package com.chs.test07;

import com.chs.test01.Test;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-30 - 03 - 30 - 15:46
 * @Description: com.chs.test07
 * @version: 1.0
 */

/*
1.类的组成：属性，方法，构造器，代码块（普通块、静态块、构造块、同步块），内部类
2.内部类的划分：成员内部类(静态和非静态)和局部内部类（方法内、块内、构造器内）
3.成员内部类：
    属性，方法，构造器等
    修饰符：private ,default ,protect, public ,final


* */
public class TestOuter {
    //成员内部类
    public class D{
        int age = 20;
        String name;
        public void method(){
            /*//4.内部类可以访问外部类的内容
            System.out.println(age);
            a();*/
            int age = 30;
            //7.内部类和外部类属性同名的时候怎么调用
            System.out.println(age);//30
            System.out.println(this.age);//20
            System.out.println(TestOuter.this.age);//10

        }
    }
    //静态成员内部类
    static class E{
        public void method(){
            /*System.out.println(age);
            a();*/
            //5.静态内部类中只能访问外部类中被static修饰的属性和方法

        }
    }
    //属性
    int age = 10;
    //方法：
    public void a(){
        System.out.println("这是a方法");
        {
            System.out.println("这是一个普通块");
        }
        class A{

        }
        //6.外部类想要访问内部类的东西，需要创建内部类的对象来进行创建

        D d = new D();
        System.out.println(d.name);
        d.method();
    }
    static{
        System.out.println("这是构造块");
    }
}
class Demo{
    public static void main(String[] args) {
        //创建外部类的对象
        TestOuter to = new TestOuter();
        to.a();

        //创建内部类的对象
        //静态的内部类如何创建对象
        TestOuter.E e = new TestOuter.E();
        //非静态的内部类如何创建对象
        /*错误的：TestOuter.D d = new TestOuter.D();*/
        TestOuter  t = new TestOuter();
        TestOuter.D d = t.new D();

    }
}