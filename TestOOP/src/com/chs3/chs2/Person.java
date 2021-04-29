package com.chs3.chs2;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-13 - 03 - 13 - 11:10
 * @Description: com.chs2
 * @version: 1.0
 */
public class Person {
    public Person(){

    }
    public Person(String name,int age,double height){
        //在要表示对象的属性前加上this来修饰，
        this.name = name;
        this.age = age;
        this.height = height;

    }
    //属性
    String name;
    int age;
    double height;

    //方法
    public void eat(){
        System.out.println("我喜欢吃饭");
    }
}
