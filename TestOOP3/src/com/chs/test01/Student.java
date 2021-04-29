package com.chs.test01;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-20 - 03 - 20 - 16:31
 * @Description: com.chs.test01
 * @version: 1.0
 */
public class Student {
    private String name;
    private int age;
    private double height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Student() {
    }

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    //对String 进行重写
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
  /*public String toString(){
        return ("这位同学的名字是"+this.name+"，年龄是"+this.age+"，身高是"+this.height);
     }*/
    //对equals进行重写
}
