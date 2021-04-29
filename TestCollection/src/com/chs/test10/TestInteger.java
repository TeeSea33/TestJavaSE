package com.chs.test10;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-22 - 04 - 22 - 16:23
 * @Description: com.chs.test10
 * @version: 1.0
 */
public class TestInteger {
    public static void main(String[] args) {
        //创建一个HashSet集合
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();

        hs.add(19);
        hs.add(5);
        hs.add(11);
        hs.add(19);
        hs.add(41);
        hs.add(0);
        System.out.println(hs.size());
        System.out.println(hs);//
        // [0, 19, 5, 41, 11] 19只有一个，满足唯一无序的特点
        //[19, 5, 11, 41, 0] 使用LinkedHashSet以后是按照输入顺序的



    }
}
