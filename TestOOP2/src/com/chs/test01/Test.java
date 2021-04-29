package com.chs.test01;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-18 - 03 - 18 - 16:03
 * @Description: com.chs.test01
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Girl g = new Girl();
        /*g.age = 333;
        System.out.println(g.age);*/
        //设置年龄
        g.setAge(18);
        //读取年龄
        g.getAge();

    }
}
