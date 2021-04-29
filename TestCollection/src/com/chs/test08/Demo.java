package com.chs.test08;

import org.w3c.dom.ls.LSException;
import sun.tracing.dtrace.DTraceProviderFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-19 - 04 - 19 - 17:58
 * @Description: com.chs.test08
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        List<?> list = null;
        list = list1;
        list = list2;
        list = list3;

    }
}
