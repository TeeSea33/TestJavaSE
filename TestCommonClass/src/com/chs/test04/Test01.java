package com.chs.test04;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-11 - 04 - 11 - 16:23
 * @Description: com.chs.test04
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        //声明变量
        String str = "abc";
        System.out.println(str);
        //通过构造器来创建对象
        String s1 = new String();
        String str2 = new String("avd");
        String s3 = new String(new char[]{'a','b','c'});

        String s4 = "abc";
        System.out.println("字符的长度是："+s4.length());

        String s5 = new String();
        System.out.println("字符串是否空"+s5.isEmpty());//取决于length

        System.out.println(s4.charAt(1));

        String s6 = new String("abcd");
        String s7 = new String("abcsed");

        //字符串的截取
        String s9 = "abdfsshdhh";
        System.out.println(s9.substring(3));
        System.out.println(s9.substring(3,6));

        //字符串拼接或者合并操作
        System.out.println(s9.concat("pppppp"));

        //字符串中字符的替换，但是不会改变原来的字符串
        String s11 = "sdhfdsjhfj";
        System.out.println(s11.replace('s', 'u'));
        System.out.println(s11);

        //按照指定的字符串，进行分裂成数组的形式
        String s10 = "a-b-c-f";
        String[] strs = s10.split("-");
        System.out.println(Arrays.toString(strs));

        //将字符转为大小写
        String s12 = "abc";
        System.out.println(s12.toUpperCase());
        System.out.println(s12.toUpperCase().toLowerCase());

        //去除首尾空格
        String s13 = "   ab s  ";
        System.out.println(s13.trim());
        //toString()
        String s15 = "abc";
        System.out.println(s15.toString());

        //转换为String类型：
        System.out.println(String.valueOf(false));



    }
}
