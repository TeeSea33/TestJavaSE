package com.chs.test13;

import java.util.TreeSet;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-23 - 04 - 23 - 9:41
 * @Description: com.chs.test13
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        //创建一个treeSet
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(12);
        ts.add(9);
        ts.add(5);
        ts.add(7);
        ts.add(2);
        ts.add(2);
        System.out.println(ts.size());
        System.out.println(ts);

    }
}
