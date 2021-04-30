package com.chs.test02;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-30 - 04 - 30 - 10:38
 * @Description: com.chs.test02
 * @version: 1.0
 */
public class BuyTicketThread implements Runnable{
    /*static */int tickNum = 10;//这里的三个窗口都是使用的这一个对象，不需要使用静态
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            if(tickNum>0){
                System.out.println("我在"+Thread.currentThread().getName()+"买到了北京到哈尔滨的第"+tickNum--+"张车票");
            }

        }
    }
}
