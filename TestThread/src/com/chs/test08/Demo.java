package com.chs.test08;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-05-07 - 05 - 07 - 14:24
 * @Description: com.chs.test08
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if(i == 6){
                Thread.currentThread().stop();//已经不常用的方法了
            }
        }
    }
}
