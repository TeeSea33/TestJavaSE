package com.chs.test05;

import com.chs.test04.TestThread01;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-05-02 - 05 - 02 - 18:50
 * @Description: com.chs.test05
 * @version: 1.0
 */
public class TestThread extends Thread {
    public TestThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(this.getName()+"-----"+i);

        }
    }
}

class Test {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <= 100; i++) {
            if(i==6){
                //创建子进程
                TestThread tt = new TestThread("子进程");
                tt.start();
                tt.join();//join将其他进程进入到阻塞状态
                //先start再join才有效
            }
            System.out.println("main-----"+i);
        }
    }
}
