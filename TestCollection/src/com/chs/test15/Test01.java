package com.chs.test15;

import java.util.HashMap;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-25 - 04 - 25 - 16:45
 * @Description: com.chs.test15
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        //创建一个HashMap的对象，存储的是双列数据，键值对key - value
        HashMap<Integer,String> hm = new HashMap<>();
        //存储数据：
        System.out.println(hm.put(12,"丽丽"));
        System.out.println(hm.put(7,"菲菲"));
        System.out.println(hm.put(19,"露露"));
        System.out.println(hm.put(13,"明明"));
        System.out.println(hm.put(6,"莹莹"));

        System.out.println("集合中的元素"+hm);
        System.out.println("集合中元素的数量"+hm.size());





    }
}
