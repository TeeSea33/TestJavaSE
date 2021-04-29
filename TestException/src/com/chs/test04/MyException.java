package com.chs.test04;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-03 - 04 - 03 - 17:47
 * @Description: com.chs.test04
 * @version: 1.0
 */
public class MyException extends RuntimeException {
    static final long serialVersionUID = -70348971L;//序列化
    public MyException(){

    }
    public MyException(String msg){
        super(msg);
    }

}
