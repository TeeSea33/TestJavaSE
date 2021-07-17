package com.chs.anno02;

import java.util.ArrayList;

/**
 * @author: ChanHuiShan
 * @date: 2021-05-24 - 05 - 24 - 18:43
 * @description: com.chs.anno02
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.study();

        @SuppressWarnings("unused")
        int age = 1;

        @SuppressWarnings({"unused","rwatypes"})
        ArrayList al = new ArrayList();
    }

}
