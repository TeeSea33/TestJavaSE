package com.chs.test01;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-30 - 04 - 30 - 9:47
 * @Description: com.chs.test01
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {

        BuyTicketThread btt1 = new BuyTicketThread("窗口一");
        btt1.start();
        BuyTicketThread btt2 = new BuyTicketThread("窗口二");
        btt2.start();
        BuyTicketThread btt3 = new BuyTicketThread("窗口三");
        btt3.start();
    }
}
