package com.chs.test15;

import java.awt.color.ColorSpace;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-25 - 04 - 25 - 19:56
 * @Description: com.chs.test15
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        //Collection不支持创建对象，因为构造器私有化了
        /*Collection cols = new Collection();*/
        //里面的属性和方法都是被static修饰的，我们可以直接用类名，然后去调用就行
        //常用方法
        //addAll
        ArrayList<String> list = new ArrayList<>();
        list.add("cc");
        list.add("cc");
        list.add("cc");
        Collections.addAll(list,"ee","dd","ff");
        Collections.addAll(list,new String[]{"gg","oo","pp"});
        System.out.println(list);
        //binarySearch
        System.out.println(Collections.binarySearch(list,"cc"));

        //copy:替换方法
        ArrayList<String> list2 =  new ArrayList<>();
        Collections.addAll(list2,"tt","ss");
        Collections.copy(list,list2);
        System.out.println(list);
        System.out.println(list2);


        //fill填充
        Collections.fill(list2,"yyyy");
        System.out.println(list2);



    }
}
