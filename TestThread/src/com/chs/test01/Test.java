package com.chs.test01;

import javax.xml.transform.Source;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-30 - 04 - 30 - 9:10
 * @Description: com.chs.test01
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //Thread.currentThread()可以获取当前线程
        // 设置当前主线程的名字
        Thread.currentThread().setName("主线程");
        //主线程中输出十个数
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"1-----"+i);
        }
        //制造其他线程，和主线程争抢资源
        TestThread tt = new TestThread("子线程");
        /*tt.run();*///调用run方法执行线程中的任务--->这个run方法不能直接调用，再直接调用以后会被当做一个普通方法
        //想要tt子线程真正起作用的话需要启动线程
        tt.start();

        //主线程中输出十个数
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"2======"+i);
        }

    }
}
