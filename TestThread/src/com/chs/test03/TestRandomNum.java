package com.chs.test03;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-30 - 04 - 30 - 10:56
 * @Description: com.chs.test03
 * @version: 1.0
 */
public class TestRandomNum implements Callable<Integer> {
    /*
    1. 实现callable接口，可以不带泛型，那么call方法返回的返回值就是object类型
    2.带泛型，那么call的返回值就是泛型对应的类型
    3.从call方法看到：方法有返回值，可以跑出异常

     */
    @Override
    public Integer call() throws Exception {
        return new Random().nextInt(10);//返回10以内的随机数

    }
}
