package com.chs.test03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author: ChanHuiShan
 * @date: 2021-05-26 - 05 - 26 - 15:05
 * @description: com.chs.test03
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取字节码信息
        Class c1 = Class.forName("com.chs.test03.Student");
        //通过字节码信息可以获取构造器
        //getConstructors()可以获取所有被public修饰的构造器
        Constructor[] con1 = c1.getConstructors();
        for(Constructor c:con1){
            System.out.println(c);
        }
        System.out.println("-------------");
        //getDeclaredConstructors()可以获取运行时类的全部修饰符的构造器
        Constructor[] con2 = c1.getDeclaredConstructors();
        for(Constructor c:con2){
            System.out.println(c);
        }
        System.out.println("--------------");
        //获取指定的构造器
        //空构造器：getConstructor()
        Constructor con3 = c1.getConstructor();
        System.out.println(con3);
        System.out.println("--------------");
        //两个参数的构造器
        Constructor con4 = c1.getConstructor(double.class, double.class);
        System.out.println(con4);
        //得到一个参数的有参构造器：并且是private修饰的
        Constructor con5 = c1.getDeclaredConstructor(int.class);
        System.out.println(con3);
        System.out.println("---------------");
        //有了构造器以后我就可以创建对象
        Object o1 = con3.newInstance();
        System.out.println(o1);

        Object o2 = con4.newInstance(13.1, 22.1);
        System.out.println(o2);



    }
}
