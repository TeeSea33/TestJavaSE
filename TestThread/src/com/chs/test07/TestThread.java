package com.chs.test07;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-05-07 - 05 - 07 - 14:11
 * @Description: com.chs.test07
 * @version: 1.0
 */
public class TestThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            System.out.println("子线程"+i);
        }

    }
}

class Test{
    public static void main(String[] args) {
        //创建并启动子线程：
        TestThread tt = new TestThread();
        tt.setDaemon(true);
        tt.start();

        for (int i = 0; i <= 10; i++) {
            System.out.println("主线程"+i);

        }
    }
}