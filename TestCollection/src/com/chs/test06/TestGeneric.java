package com.chs.test06;

import java.util.Objects;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-19 - 04 - 19 - 16:09
 * @Description: com.chs.test06
 * @version: 1.0
 */
public class TestGeneric<A,B,C> {
    A age ;
    B name;
    C sex;
    public  void a(A m ,B n ,C sex){

    }

    public TestGeneric() {
    }

    public TestGeneric(A age, B name, C sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }


    public /*static*/ int c(A a){
        return 10;//静态方法里面不能用
    }

    public void a(A m){
        /*A[] i = new A[10];*/
        A[] i = (A[])new Object[10];

    }



}
