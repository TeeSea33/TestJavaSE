package com.chs.test03;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-21 - 03 - 21 - 11:17
 * @Description: com.chs.test03
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Boy b = new Boy(18,"尹浩宇");
        Girl g = new Girl("陈慧珊",100);
        //谈恋爱
        g.love(b);
    }
}
