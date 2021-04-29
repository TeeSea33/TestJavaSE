package com.chs.test03;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-18 - 03 - 18 - 17:56
 * @Description: com.chs.test03
 * @version: 1.0
 */
public class Person {
    //属性：
    private int age;
    private String name;
    //default 缺省修饰符：在同一个类或者不同类都是可以访问的，限制于同一个包package
//    protected 权限是到其他包里面都可以访问
    //属性一般是private 方法一般是public

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double height;

    //方法
    public void eat(){
        System.out.println("可以吃饭。。。");

    }
    public void sleep(){
        System.out.println("可以睡觉。。");
    }


}
