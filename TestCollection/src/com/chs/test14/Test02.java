package com.chs.test14;

import java.util.Map;
import java.util.TreeMap;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-24 - 04 - 24 - 16:08
 * @Description: com.chs.test14
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        Map<String,Integer> map = new TreeMap<>();
        map.put("bllili",21);
        map.put("allili",121);
        map.put("bllili",12);
        map.put("cllili",23);
        map.put("dllili",23);
        System.out.println(map.size());
        System.out.println(map);


    }
}
