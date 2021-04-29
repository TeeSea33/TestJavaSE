package com.chs.test14;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-24 - 04 - 24 - 16:12
 * @Description: com.chs.test14
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) {

        Map<Student,Integer> map = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return ((Double)(o1.getHeight())).compareTo((Double)(o2.getHeight()));
            }
        });
        map.put(new Student(12,"lili",123.2),123213);
        map.put(new Student(18,"sili",155.2),123213);
        map.put(new Student(22,"aili",123.2),123213);
        map.put(new Student(19,"dili",123.2),123213);
        System.out.println(map);
        System.out.println(map);
        

    }
}
