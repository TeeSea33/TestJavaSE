package com.chs.test02;

import com.chs.test01.Person;

/**
 * @author: ChanHuiShan
 * @date: 2021-05-26 - 05 - 26 - 10:42
 * @description: com.chs.test02
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        /*
        Class类的具体的实例：
        （1）类：外部类，内部类
        （2）接口
        （3）注解
        （4）数组
        （5）基本数据类型
        （6）void
         */
        Class c1 = Person.class;
        Class c2 = Comparable.class;
        Class c3 = Override.class;
        int[] arr1 = {1,2,3};
        Class c4 = arr1.getClass();
        int[] arr2 = {5,6,7};
        Class c5 = arr2.getClass();
        System.out.println(c4==c5);//结果：true .同一个维度，同一个元素类型,得到的字节码就是同一个

        Class c6 = int.class;
        Class c7 = void.class;
    }
}
