package com.chs.test07;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-20 - 03 - 20 - 12:08
 * @Description: com.chs.test07
 * @version: 1.0
 */
public class Student extends Person{
    double height;
    double weight;

    public Student() {
    }


    public Student(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public Student(int age, String name, double height, double weight) {
        super(age, name);
        this.height = height;
        this.weight = weight;
    }

}
