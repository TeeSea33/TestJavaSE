package com.chs.test09;

import com.sun.scenario.effect.impl.state.LinearConvolveKernel;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-05-14 - 05 - 14 - 10:18
 * @Description: com.chs.test09
 * @version: 1.0
 */
public class BuyTicketThread implements Runnable {
    @Override
    public void run() {
        int ticketNum = 10;
        //拿来一把锁：
        Lock lock = new ReentrantLock();//多态 接口=实现类 可以使用不同的实现类
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
