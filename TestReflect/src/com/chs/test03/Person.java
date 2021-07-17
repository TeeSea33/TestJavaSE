package com.chs.test03;

import java.io.Serializable;

/**
 * @author: ChanHuiShan
 * @date: 2021-05-26 - 05 - 26 - 10:58
 * @description: com.chs.test03
 * @version: 1.0
 */
public class Person implements Serializable {
    //属性
    private int age;
    public String name;
    //方法
    private void eat(){
        System.out.println("Person---eat");
    }
    public void sleep(){
        System.out.println("Person---sleep");
    }
}
