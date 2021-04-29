package com.chs.test01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-18 - 04 - 18 - 14:16
 * @Description: com.chs.test01
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        /*
        * List接口中常用的方法
        * 增加:
        * 删除:
        * 修改:
        * 查看:
        * 判断:
        * */
        List list = new ArrayList();
        list.add(13);
        list.add(17);
        list.add(6);
        list.add(-1);
        System.out.println(list);
        list.add(3,66);
        System.out.println(list);
        list.set(3,77);
        System.out.println(list);
        list.remove(2);//在集合中如果存在integer类型的数据,调用remove方法,删去的是对应下标的
        System.out.println(list);

        Object o = list.get(0);
        System.out.println(o);

        //list集合遍历
        System.out.println("-------------");
        //1:普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
        System.out.println("--------------");
        //2:增强for循环
        for (Object obj:list){
            System.out.println(obj);
        }
        //3:迭代器
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
