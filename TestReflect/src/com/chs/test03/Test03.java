package com.chs.test03;

import javax.xml.transform.Source;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author: ChanHuiShan
 * @date: 2021-05-27 - 05 - 27 - 9:55
 * @description: com.chs.test03
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        //获取字节码
        Class<?> cls = Class.forName("com.chs.test03.Student");
        //获取类和父类中的public方法
        Method[] m1 = cls.getMethods();
        for (Method m:m1){
            System.out.println(m);
        }
        System.out.println("---------------");
        //获取运行时类的方法
        Method[] m2 = cls.getDeclaredMethods();
        for (Method m:m2){
            System.out.println(m);
        }
        System.out.println("---------------");
        //获取指定的方法
        Method m3 = cls.getMethod("showInfo");
        Method m4 = cls.getMethod("showInfo",int.class,int.class);
        System.out.println(m3);
        System.out.println(m4);

        System.out.println("------------------");
        Method m5 = cls.getDeclaredMethod("getSno");
        System.out.println(m5);//protected int com.chs.test03.Student.getSno()

        System.out.println("------------------");
        //获取方法的具体结构
        //名字
        String name = m4.getName();
        System.out.println(name);//showInfo
        System.out.println("------------------");
        //修饰符
        int modifiers = m4.getModifiers();
        System.out.println(Modifier.toString(modifiers));//public
        System.out.println("------------------");
        //返回值
        Class returnType = m4.getReturnType();
        System.out.println(returnType);
        System.out.println("------------------");
        //参数列表
        Class[] parameterTypes = m4.getParameterTypes();
        for (Class p:parameterTypes){
            System.out.println(p);
        }
        System.out.println("------------");
        //注解
        Method myMethod = cls.getMethod("myMethod");
        Annotation[] annotations = myMethod.getAnnotations();
        for (Annotation a:annotations)
        {
            System.out.println(a);
        }
        System.out.println("------------");
        //异常
        Class[] exceptionTypes = myMethod.getExceptionTypes();
        for(Class c:exceptionTypes) {
            System.out.println(c);
        }
        System.out.println("------------");
        //调用方法
        //先获取对象
        Object o = cls.newInstance();
        System.out.println(m4.invoke(o, 1, 1));

    }
}
