package com.chs.test08;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-20 - 03 - 20 - 12:15
 * @Description: com.chs.test08
 * @version: 1.0
 */
public class Student extends Person {
    double height;

    public Student() {
    }

    public Student(int age, String name, double height) {
        super(age, name);
        this.height = height;
    }
}
