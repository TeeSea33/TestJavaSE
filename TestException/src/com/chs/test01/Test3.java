package com.chs.test01;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-03 - 04 - 03 - 15:58
 * @Description: com.chs.test01
 * @version: 1.0
 */
public class Test3 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //检查异常：
       /* try {
            try {
                Class.forName("com.chs.test01.Test").newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
        Class.forName("com.chs.test01").newInstance();

    }
}
