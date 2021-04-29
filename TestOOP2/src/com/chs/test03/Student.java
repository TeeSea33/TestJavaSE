package com.chs.test03;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-18 - 03 - 18 - 17:58
 * @Description: com.chs.test03
 * @version: 1.0
 */
public class Student extends Person {//子类student 继承自父类的 Person
    //属性
    private int sno;//学号

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }
    //方法
    public void study(){
        System.out.println("学生可以学习");
    }
}
