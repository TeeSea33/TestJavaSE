package com.chs.test01;

/**
 * @author: ChanHuiShan
 * @date: 2021-05-26 - 05 - 26 - 10:04
 * @description: com.chs.test01
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        //方法一：通过getclass
        Person p = new Person();
        Class c1 = p.getClass();
        System.out.println(c1);//class com.chs.test01.Person
        //方法二：通过类名.class
        Class c2 = Person.class;
        System.out.println(c2);//class com.chs.test01.Person
        System.out.println(c1==c2);//true
        //方法三：调用Class.forName------->常用的
        Class c3 = Class.forName("com.chs.test01.Person");
        System.out.println(c3);//class com.chs.test01.Person
        System.out.println(c1==c3);
        //方式四：使用类的加载器
        ClassLoader cl = Test.class.getClassLoader();
        Class c4 = cl.loadClass("com.chs.test01.Person");
        System.out.println(c4);


    }
}
