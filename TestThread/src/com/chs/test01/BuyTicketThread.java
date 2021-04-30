package com.chs.test01;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-30 - 04 - 30 - 9:37
 * @Description: com.chs.test01
 * @version: 1.0
 */
public class BuyTicketThread extends Thread {
    static int ticketNum = 10;
    public BuyTicketThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        //每个窗口都有100个人抢票：
        for (int i = 0; i < 100; i++) {
            if(ticketNum>0){
                System.out.println("我在"+this.getName()+"买到了从北京到哈尔滨的第"+ticketNum--+"张票");
            }

        }
    }
}
