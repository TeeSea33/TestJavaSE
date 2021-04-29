package com.chs.test08;

import com.sun.org.apache.xerces.internal.xs.StringList;
import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-19 - 04 - 19 - 17:37
 * @Description: com.chs.test08
 * @version: 1.0
 */
public class Test {
    //由于泛型类型的定义的不存在继承，是并列关系，所以两个方法的参数相当于是同一个类型，不能重载
    /*public void a(List<Object> list){

    }

    public void a(List<String> list){

    }*/
    public void a(List<?> list){
        for(Object obj:list){

        }
    }



}

class T{
    public static void main(String[] args) {
        Test t = new Test();
        t.a(new ArrayList<Integer>());
        t.a(new ArrayList<String>());
        t.a(new ArrayList<Object>());


    }

}
