package com.chs.test13;

import java.util.Comparator;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-24 - 04 - 24 - 8:56
 * @Description: com.chs.test13
 * @version: 1.0
 */
public class Student  /*implements Comparable<Student>*/{
    private int age ;
    private String name;

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

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    /*@Override
    public int compareTo(Student o) {
        return this.getAge()-o.getAge();
    }*/
}
class BiJiao implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge()-o2.getAge();
    }
}