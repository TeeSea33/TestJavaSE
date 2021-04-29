package com.chs.test06;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-20 - 03 - 20 - 10:48
 * @Description: com.chs.test06
 * @version: 1.0
 */
public class Student extends Person {
    double score;
    public Student(){
        /*super();*/
        //调用父类的空构造器，只是一般可以省略不写
    }


    public Student(int age, String name, double score) {
        /*this.age = age;
        this.name = name;*/
        /*super.age = age;
        super.name = name;*/
        super(age, name);//利用super调用父类的构造器
        this.score = score;
    }
}

