package com.chs.test13;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-24 - 04 - 24 - 9:17
 * @Description: com.chs.test13
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        //利用外部比较器，需要自己制定
        /*Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        };//匿名类*/
        //创建一个TreeSet对象
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });
        ts.add(new Student(19,"lililai"));
        ts.add(new Student(19,"lililai"));
        ts.add(new Student(19,"lililai"));
        ts.add(new Student(19,"lililai"));
        ts.add(new Student(19,"lililai"));
        ts.add(new Student(19,"lililai"));
        System.out.println(ts.size());
        System.out.println(ts);

    }
}
