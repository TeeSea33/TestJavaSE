package com.chs.test1;

import java.net.InetAddress;
import java.net.InetSocketAddress;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-05-18 - 05 - 18 - 15:38
 * @Description: com.chs.test1
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        InetSocketAddress isa = new InetSocketAddress("192.168.23.1",8080);
        System.out.println(isa);
        System.out.println(isa.getHostName());
        System.out.println(isa.getPort());

        InetAddress ia = isa.getAddress();
        System.out.println(ia.getHostName());
        System.out.println(ia.getHostAddress());
    }
}
