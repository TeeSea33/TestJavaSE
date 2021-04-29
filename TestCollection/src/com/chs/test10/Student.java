package com.chs.test10;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-22 - 04 - 22 - 16:34
 * @Description: com.chs.test10
 * @version: 1.0
 */
public class Student {
    private int age ;//年龄
    private String name;//姓名

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
