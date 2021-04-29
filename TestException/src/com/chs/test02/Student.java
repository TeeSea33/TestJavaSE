package com.chs.test02;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-03 - 04 - 03 - 16:33
 * @Description: com.chs.test02
 * @version: 1.0
 */
public class Student {
    private int age ;//年龄

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;//名字
    private String sex;//性别

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) throws Exception {
        if (sex.equals("男")||sex.equals("女")){
            this.sex = sex;
        }else{
            //1.
            /*this.sex = "男";*/

            //2.
            /*System.out.println("对不起你的性别错误了");*/

            //3.制造运行时异常
           /* throw new RuntimeException("性别不对！");*/

            //4.制造检查异常
          /*  try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }*/

            throw new Exception();
       }
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    //构造器

    public Student() {
    }

    public Student(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        try {
            this.setSex(sex);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
