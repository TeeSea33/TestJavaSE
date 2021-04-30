package com.chs.test02;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-30 - 04 - 30 - 10:34
 * @Description: com.chs.test02
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //创建子线程对象：
        TestThread tt = new TestThread();
        Thread t = new Thread(tt,"子线程");
        t.start();

        //主线程
        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName()+"-----"+i);

        }

    }
}
