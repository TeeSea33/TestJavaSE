package com.chs.test01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-18 - 04 - 18 - 11:06
 * @Description: com.chs.test01
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(18);
        col.add(12);
        col.add(11);
        System.out.println(col/*.toString()*/);

        //对集合进行遍历（集合中的元素进行查看）
        //方式1：普通for循环
     /*   for(int i= 0;i<col.size();i++){
            //不得行 没有提取元素的方法
        }*/

        //方式2:增强for循环
        for (Object o:col){
            System.out.println(o);
        }
        System.out.println("-----------------");
        //方式3：iterator（）
        Iterator it = col.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }







































































































    }
}
