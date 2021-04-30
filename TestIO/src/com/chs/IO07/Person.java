package com.chs.IO07;

import java.io.Serializable;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-30 - 04 - 30 - 8:08
 * @Description: com.chs.IO07
 * @version: 1.0
 */
public class Person implements Serializable {
    private static final long serialVersionUID = 5688546400189084935L;
    private int age ;//年龄
    private String name;//名字

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Person() {
    }

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

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
