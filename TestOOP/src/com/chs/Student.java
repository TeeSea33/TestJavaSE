package com.chs;

import javax.sound.midi.Soundbank;
import java.util.zip.DeflaterOutputStream;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-13 - 03 - 13 - 10:55
 * @Description: com.chs
 * @version: 1.0
 */
public class Student {
    byte e;
    short s;
    int c;
    long num2;
    float f;
    double d;
    boolean bo;
    String name;
    public void study(){
        int num = 10;//局部变量，在方法中必须初始化
        System.out.println(num);
        {
            int a;
        }
        int a;
        if(1==3){
            int b;
        }
        System.out.println(c);
    }
    public void eat(){
        System.out.println(c);
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.d);
        System.out.println(s.c);
        System.out.println(s.bo);
        System.out.println(s.e);
        System.out.println(s.f);
        System.out.println(s.name);
        System.out.println(s.num2);
        s.d = 10.4;

    }
}
