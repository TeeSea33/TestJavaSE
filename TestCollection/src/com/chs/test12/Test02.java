package com.chs.test12;

import sun.nio.cs.ext.SJIS_0213;

import java.util.Comparator;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-22 - 04 - 22 - 20:52
 * @Description: com.chs.test12
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        //比较两个学生
        Student s1 = new Student(10, 160.5, "lili");
        Student s2 = new Student(14, 179.5, "wanggang");
        //获取外部比较器
        Comparator bj1 = new BiJiao03();
        System.out.println(bj1.compare(s1,s2));




    }
}
