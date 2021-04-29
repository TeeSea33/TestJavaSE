package com.chs.test14;

import com.sun.org.apache.xpath.internal.operations.Or;

import javax.xml.transform.Source;
import java.util.*;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-24 - 04 - 24 - 13:59
 * @Description: com.chs.test14
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
         /*
        增加：put(K key, V value)
        删除：clear() remove(Object key)
        修改：
        查看：entrySet() get(Object key) keySet() size() values()
        判断：containsKey(Object key) containsValue(Object value)
            equals(Object o) isEmpty()
         */
         //创建一个Map集合
        Map<String,Integer> map = new Hashtable<>();
        map.put("lili",1223233);
        map.put("nana",1327833);
        map.put("lili",1567573);
        map.put("qiiq",1233233);
        System.out.println(map.size());
        System.out.println(map);

        /*map.clear();
        map.remove("lili");*/
        System.out.println(map.size());
        System.out.println(map);

        System.out.println(map.containsKey("lili"));
        System.out.println(map.containsValue(12312));

        HashMap<String,Integer> map2 = new HashMap<>();
        System.out.println(map.put("lili",1231232));
        map2.put("nana",123455);
        map2.put("fiefei",234343);
        System.out.println(map2.put("lili",123213));

        Set<String> set = map.keySet();
        for(String s:set){
            System.out.println(s);
        }

        System.out.println("-------------");
        //values()对集合中的value进行遍历查看
        Collection<Integer> vaules = map.values();
        for(Integer i:vaules){
            System.out.println(i);
        }
        System.out.println("--------------------");
        //get(Object key) keySet()
        Set<String> set2 = map.keySet();
        for(String s:set2){
            System.out.println(map.get(s));
        }
        System.out.println("---------------------");
        //entrySet()
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> e:entries)
        {
            System.out.println(e.getKey()+"------"+e.getValue());
        }


    }
}
