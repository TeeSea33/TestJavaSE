package com.chs.test10;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.HashSet;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-22 - 04 - 22 - 16:27
 * @Description: com.chs.test10
 * @version: 1.0
 */
public class TestString {
    public static void main(String[] args) {
        //创建一个HashSet集合
        HashSet<String> hs = new HashSet<>();
        hs.add("hello");
        hs.add("apple");
        hs.add("banana");
        hs.add("html");
        hs.add("css");
        System.out.println(hs.size());
        System.out.println(hs);
    }
}
