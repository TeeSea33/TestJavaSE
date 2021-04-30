package com.chs.test02;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-30 - 04 - 30 - 10:31
 * @Description: com.chs.test02
 * @version: 1.0
 */
public class TestThread implements Runnable {
    @Override
    public void run() {
        //输入1-10
        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName()+"------"+i);


        }
    }
}
