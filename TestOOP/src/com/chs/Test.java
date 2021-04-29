package com.chs;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-13 - 03 - 13 - 9:36
 * @Description: com.chs
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //创建一个人类的具体类的对象：
        //创建一个对象，对象的名字：zs
        //Person属于 引用数据类型
        Person zs = new Person();
        zs.weight=65;
        zs.height=170.0;
        zs.name="陈慧珊";
        zs.age=18;
        zs.eat();
        System.out.println(zs.introduce());
        zs.sleep("学校");

    }
}
