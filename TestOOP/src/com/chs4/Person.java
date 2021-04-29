package com.chs4;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-17 - 03 - 17 - 17:13
 * @Description: com.chs4
 * @version: 1.0
 */
public class Person {
    int age ;
    String name;
    double height;
    //无参构造器
    public Person(){

    }
    //有参构造器
    public Person(int age, String name,double height){
        this.age = age;
    }

    //方法：
    public void eat(){
        System.out.println("我喜欢吃饭");
    }
}
