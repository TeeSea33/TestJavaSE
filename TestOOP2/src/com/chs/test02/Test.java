package com.chs.test02;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-18 - 03 - 18 - 16:30
 * @Description: com.chs.test02
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //创建一个Student对象
        Student s1 = new Student();
        s1.setName("Nene");
        s1.setAge(18);
        s1.setSex("女");
        System.out.println(s1.getName()+"---"+s1.getSex()+"---"+s1.getAge());

        Student s2 = new Student(18,"Tina","33");
        System.out.println(s2.getName()+"---"+s2.getSex()+"---"+s2.getAge());

    }
}
