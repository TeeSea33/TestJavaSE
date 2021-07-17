package com.chs.test03;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author: ChanHuiShan
 * @date: 2021-05-27 - 05 - 27 - 9:07
 * @description: com.chs.test03
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        //获取字节码
        Class cls = Class.forName("com.chs.test03.Student");
        //获取属性
        //获取public属性
        Field[] f1 = cls.getFields();
        for (Field f:f1){
            System.out.println(f);
        }
        System.out.println("------------");
        //获取所有属性
        Field[] f2 = cls.getDeclaredFields();
        for (Field f:f2){
            System.out.println(f);
        }
        System.out.println("-------------");
        //获取指定的属性
        //仅限public
        Field score = cls.getField("score");
        System.out.println(score);
        //任意的
        Field sno = cls.getDeclaredField("sno");
        System.out.println(sno);
        System.out.println("----------------");
        //获取属性的名字
        String name = score.getName();
        System.out.println(name);
        //获取属性数据类型名字
        Class type = score.getType();
        System.out.println(type);
        System.out.println("-----------------");
        //获取修饰符
        int modifiers = score.getModifiers();
        System.out.println(Modifier.toString(modifiers));

        System.out.println("----------------");
        //给属性赋值
        Object o = cls.newInstance();
        score.set(o,12.1);
        System.out.println(o);



    }
}
