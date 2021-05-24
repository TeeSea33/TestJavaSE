package com.chs.test10;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-05-17 - 05 - 17 - 15:10
 * @Description: com.chs.test10
 * @version: 1.0
 */
public class CustomerThread extends Thread {
    //共享的商品
    private Product p;
    //构造器 参数是商品

    public CustomerThread(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            p.getProduct();
        }
    }
}
