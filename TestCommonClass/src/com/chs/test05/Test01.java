package com.chs.test05;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-14 - 04 - 14 - 14:50
 * @Description: com.chs.test05
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        //创建StringBuilder的对象
        StringBuilder sb = new StringBuilder();
        //表面上调用StringBuilder的空构造器，实际底层是对value数组进行初始化，长度为16
        StringBuilder sb2 = new StringBuilder(3);
        //表面上调用StringBuilder的有参构造器，传入一个int类型的数，实际底层就是对value数组进行初始化，
        StringBuilder sb3 = new StringBuilder("abc");
        /*sb.append("def").append("aaaaaaa");*///链式调用方式：return this
        System.out.println(sb3.append("def").append("aaaaaaa"));






    }
}
