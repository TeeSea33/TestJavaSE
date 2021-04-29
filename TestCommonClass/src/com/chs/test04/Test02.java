package com.chs.test04;

import org.omg.CORBA.StringHolder;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-13 - 04 - 13 - 17:30
 * @Description: com.chs.test04
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        String s1 = "a" + "b" + "c";
        String s2 = "ab"+"c";
        System.out.println(s1 == s2);
        //字符串拼接还是一样的内存

        String s3 = new String("abc");
        System.out.println(s1 == s3);
        //创建对象占两个空间，堆里面有一个空间，方法区有一个






    }
}
