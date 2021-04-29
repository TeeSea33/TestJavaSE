package com.chs.test02;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-20 - 03 - 20 - 17:25
 * @Description: com.chs.test02
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Phone p1= new Phone("apple",5999.99,2020);
        Phone p2= new Phone("apple",5999.99,2020);
        //比较两个对象：
        //==的作用，比较左右两侧的值是否相等
        System.out.println(p1==p2);//对于引用数据类型来说，这里比较的是地址值

        //Object类提供了一个方法equals，作用：比较对象具体内容是否相等
        boolean flag = p1.equals(p2);
        System.out.println(flag);

        Cat c = new Cat();
        System.out.println(p1.equals(c));

    }
}
