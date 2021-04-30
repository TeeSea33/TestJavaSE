package com.chs.test02;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-30 - 04 - 30 - 10:41
 * @Description: com.chs.test02
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        //定义一个线程对象
        BuyTicketThread t = new BuyTicketThread();
        //窗口一买票
        Thread t1 = new Thread(t, "窗口一");
        t1.start();
        //窗口二买票
        Thread t2 = new Thread(t, "窗口二");
        t2.start();
        //窗口三买票
        Thread t3 = new Thread(t, "窗口三");
        t3.start();
    }
}
