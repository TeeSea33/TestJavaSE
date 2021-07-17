package com.chs.anno;

import com.sun.org.glassfish.gmbal.ParameterNames;

/**
 * @author:ChanHuiShan
 * @Date: 2021-05-24 - 05 - 24 - 14:37
 * @Description: com.chs.anno
 * @version: 1.0
 */
public class Person {
    /**
     * 下面是eat方法 实现了XXX功能
     * @param  num1 就餐人数
     * @param num2 点了几个菜
     */
    public void eat(int num1,int num2){

    }

    /**
     *
     * @param age
     * @return int
     * @exception RuntimeException 当年龄超过100的时候
     * @exception IndexOutOfBoundsException
     * @see Student
     */
    public int sleep(int age){
        new Student();
        if (age>100){
            throw new RuntimeException();
        }
        if (age<0){
            throw new IndexOutOfBoundsException();
        }
        return 10;

    }
}
