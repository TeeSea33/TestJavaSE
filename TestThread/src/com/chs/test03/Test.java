package com.chs.test03;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-30 - 04 - 30 - 11:01
 * @Description: com.chs.test03
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //定义一个线程对象
        TestRandomNum tr = new TestRandomNum();
        FutureTask ft = new FutureTask(tr);
        Thread t = new Thread(ft);

        //线程开始
        t.start();

        //返回想要的值
        System.out.println(ft.get());
    }
}
