package com.chs.test10;

import com.sun.scenario.effect.impl.prism.PrTexture;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-05-17 - 05 - 17 - 15:34
 * @Description: com.chs.test10
 * @version: 1.0
 */
public class ProducerThread extends Thread {
    //共享的商品
    private Product p;
    //构造器

    public ProducerThread(Product p) {
        this.p = p;
    }

    //重写run方法

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
                if (i % 2 == 0) {
                   p.setProduct("费列罗","巧克力");
            }else{
                    p.setProduct("哈尔滨","啤酒");
                }
        }
    }
}
