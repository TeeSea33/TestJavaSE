package com.chs.test04;

import com.chs.test02.TestThread;

import javax.xml.transform.Source;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-05-02 - 05 - 02 - 18:37
 * @Description: com.chs.test04
 * @version: 1.0
 */
public class TestThread01 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);

        }
    }
}

class TestThread02 extends Thread{
    @Override
    public void run() {
        for (int i = 20; i <= 30; i++) {
            System.out.println(i);
        }
    }
}

class Test{
    public static void main(String[] args) {
        //创建两个子进程，设置不同的优先级:默认有1、5、10
        TestThread01 tt1 = new TestThread01();
        tt1.setPriority(10);//优先级高
        tt1.start();

        TestThread02 tt2 = new TestThread02();
        tt2.setPriority(1);//优先级低
        tt2.start();


    }
}
