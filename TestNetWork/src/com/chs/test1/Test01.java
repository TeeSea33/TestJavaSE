package com.chs.test1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-05-18 - 05 - 18 - 10:38
 * @Description: com.chs.test1
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws UnknownHostException {
        //1.因为inetaddress是被default修饰 不能创建对象
        InetAddress ia = InetAddress.getByName("10.129.32.237");
        System.out.println(ia);
        InetAddress ia2 = InetAddress.getByName("localhost");//"localhost/127.0.0.1"这个也是本机的地址
        System.out.println(ia2);
        InetAddress ia3 = InetAddress.getByName("127.0.0.1");
        System.out.println(ia3);
        InetAddress ia4 = InetAddress.getByName("Villanellekillme");//封装计算机名
        System.out.println(ia4);
        InetAddress ia5 = InetAddress.getByName("www.baidu.com");//封装域名
        System.out.println(ia5);

        System.out.println(ia5.getHostAddress());//获取ip
        System.out.println(ia5.getHostName());//获取地址

    }
}
