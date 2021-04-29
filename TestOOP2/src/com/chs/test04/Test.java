package com.chs.test04;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-18 - 03 - 18 - 18:53
 * @Description: com.chs.test04
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //创建一个Student类的对象
        Student s = new Student();
        s.study();
        s.eat(); //重写：发生在子类或者父类中，当子类对父类提供的方法不满意的时候，就要对父类的方法进行重写
        //xhongxie :发生在子类或者父类中，当子类对父类提供的方法不满意的时候，就要对父类v
    }
}
