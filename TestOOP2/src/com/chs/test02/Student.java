package com.chs.test02;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-18 - 03 - 18 - 16:29
 * @Description: com.chs.test02
 * @version: 1.0
 */
public class Student {
    //属性
    private int age;
    private String name;
    private String sex;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if(sex.equals("男")||sex.equals("女")){
            this.sex = sex;
        }else {
            this.sex = "男";
        }

    }
    //加入构造器
    public Student(){

    }

    public Student(int age, String name, String sex){
       /* this.age = age;
        this.name = name;
        this.sex = sex;*/
       //可以在构造器里面调用set方法来解决构造器定义的对象无法使用set设置属性的问题
        this.setSex(sex);
        this.setAge(age);
        this.setName(name);


    }
}
