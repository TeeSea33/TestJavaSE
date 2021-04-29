package com.chs.test10;

import java.util.HashSet;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-22 - 04 - 22 - 16:36
 * @Description: com.chs.test10
 * @version: 1.0
 */
public class TestStudent {
    public static void main(String[] args) {
        //创建一个HashSet对象
        HashSet<Student> hs = new HashSet<>();
        hs.add(new Student(19,"lili"));
        hs.add(new Student(22,"nana"));
        hs.add(new Student(34,"gg"));
        hs.add(new Student(14,"ff"));
        hs.add(new Student(19,"lili"));
        System.out.println(hs.size());
        System.out.println(hs.toString());//输出了两个lili说明这里没有唯一

    }
}
