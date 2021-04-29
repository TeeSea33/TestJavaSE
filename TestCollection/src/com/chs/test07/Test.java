package com.chs.test07;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-19 - 04 - 19 - 17:22
 * @Description: com.chs.test07
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Object obj = new Object();
        String s = new String();
        obj = s;//多态的一种形式：父类引用指向子类对象

        Object[] objArray = new Object[10];
        String[] strArray = new String[10];
        objArray = strArray;

        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        /*list1 = list2;*/

        //总结：A 和 B 是子类父类的关系，但是G<A> 和 G<B> 不存在继承关系，是并列关系
    }
}
