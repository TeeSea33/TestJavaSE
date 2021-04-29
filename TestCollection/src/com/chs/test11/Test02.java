package com.chs.test11;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-22 - 04 - 22 - 20:37
 * @Description: com.chs.test11
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        //比较两个学生
        Student s1 = new Student(10, 160.5, "lili");
        Student s2 = new Student(14, 179.5, "wanggang");
        System.out.println(s1.compareTo(s2));

    }
}
