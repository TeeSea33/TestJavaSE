package com.chs.test08;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-30 - 03 - 30 - 16:21
 * @Description: com.chs.test08
 * @version: 1.0
 */
public class TestOuter {
    //1.在局部内部类中访问的变量必须是被final修饰的
    public void method(){
        final int num = 10;
        class A{
            public void a(){
//                num = 20;
                System.out.println(num);

            }
        }
    }
    //2.如果类B在整个项目中只使用一次那么就没有必要单独创建一个B类
    public Comparable method2(){
        class B implements Comparable{
            @Override
            public int compareTo(Object o) {
                return 100;
            }

        }
        return new B();
    }

    public Comparable method3(){
        //3.匿名内部类
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 200;
            }
        };
    }

    public void test(){
        Comparable com = new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 200;
            }
        };
        System.out.println(com.compareTo("abd"));



    }

}
