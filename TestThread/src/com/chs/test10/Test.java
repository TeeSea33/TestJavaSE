package com.chs.test10;

import java.time.Period;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-05-17 - 05 - 17 - 16:04
 * @Description: com.chs.test10
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //商品
        Product p = new Product();
        //生产者线程
        ProducerThread pt = new ProducerThread(p);
        //消费者线程
        CustomerThread ct = new CustomerThread(p);

        //启动线程
        pt.start();
        ct.start();
    }
}
