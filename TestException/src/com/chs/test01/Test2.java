package com.chs.test01;

import jdk.nashorn.internal.runtime.ECMAException;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-03 - 04 - 03 - 15:39
 * @Description: com.chs.test01
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        //运行时异常：
        int[] arr = {1,2,3};
        System.out.println(arr.length);
        int[] arr2 = null;
        try {
            System.out.println(arr2.length);
        }catch (Exception ex){
            System.out.println("出现异常" );
        }

    }
}
