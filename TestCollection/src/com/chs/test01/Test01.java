package com.chs.test01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-18 - 04 - 18 - 10:43
 * @Description: com.chs.test01
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        /*
        collection接口的常用方法
        增加：add(E e) addAll(Collection<? extends E> c)
        删除：clear() remove(Object o)
        修改：
        查看：iterator() size()
        判断：contains(Object o)  equals(Object o) isEmpty()
        * */
        //创建对象：接口不能创建对象，利用实现类创建对象
        Collection col = new ArrayList();
        //调用方法：
        //集合有一个特点：只能存放引用数据类型的数据，不能是基本数据类型
        //基本数据类型可以自动装箱，对应包装类，int----》integer
        col.add(18);//这里的基本数据类型已经变为integer
        col.add(12);
        col.add(11);
        System.out.println(col/*.toString()*/);

        List list = Arrays.asList(new Integer[]{12, 15, 2, 5, 1});
        col.addAll(list);
        System.out.println(col);

        boolean isRemove = col.remove(15);
        System.out.println(col);
        System.out.println("集合中的数据是否被删除"+isRemove);

        Collection col2 = new ArrayList();
        col2.add(18);
        col2.add(12);
        col2.add(11);

        Collection col3 = new ArrayList();
        col3.add(18);
        col3.add(12);
        col3.add(11);

        System.out.println(col2.equals(col3));//true
        System.out.println(col2==col3);//false

        System.out.println(col3.contains(17));//包含
        System.out.println(col3.isEmpty());

        //

    }
}
