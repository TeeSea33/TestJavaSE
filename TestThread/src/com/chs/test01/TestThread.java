package com.chs.test01;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-30 - 04 - 30 - 9:07
 * @Description: com.chs.test01
 * @version: 1.0
 */
public class TestThread extends Thread {
    public TestThread(String name) {
        super(name);
    }

    /*
        一会儿线程对象就要开始争抢资源了，这个线程要执行的任务到底是什么？
        要执行的任务必须放在方法中，而且必须是重写Thread类中的run方法
        然后线程的任务或者是逻辑写在run方法中

         */
    @Override
    public void run() {
        //输出一到十
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName()+"------"+i);

        }
    }
}
