package com.chs.test04;

/**
 * @Auther:ChanHuiShan
 * @Description: com.chs.test04
 * @version: 1.0
 */

/*
* 1.类是类，接口是接口
* 2.接口中没有构造器
 * 3.接口如何声明：interface
* 4.在JDK1.8之前，接口中只有两部分内容：
* 常量（固定修饰符：public static final）和抽象方法（固定修饰符：public abstract）
*
* */
public interface TestInterface01 {
    //常量
    /*public static final */int NUM = 10;
    //抽象方法
    /*public abstract */void a();
    /*public abstract */void b(int num);
    /*public abstract */int c(String name);


}
interface TestInterface02{
    void d();
    String f();
}
/*
* 5.类和接口的关系是什么？实现关系，类实现接口
* 6.一旦实现一个接口，那么实现类要重写接口中的全部的抽象方法
* */
class Student extends Person implements TestInterface01,TestInterface02{
    @Override
    public void a() {
        System.out.println("----1");
    }

    @Override
    public void b(int num) {
        System.out.println("----2");
    }

    @Override
    public int c(String name) {
        return 100;
    }

    @Override
    public void d() {

    }

    @Override
    public String f() {
        return null;
    }
    //7.没有重写接口里面全部的方法的话就可以将这个类变为抽象类
    //8.java只有单继承，但是可以实现多个接口

}


class Test{
    public static void main(String[] args) {
        //10.接口不能创建对象
//        TestInterface02 f = new TestInterface02();
        TestInterface02 t = new Student();//接口指向实现类---》多态

        //11.接口中的常量如何访问：
        System.out.println(TestInterface01.NUM);
        System.out.println(Student.NUM);
        Student s = new Student();
        System.out.println(s.NUM);

    }
}