package com.chs.anno02;

import javax.sound.midi.Soundbank;

/**
 * @author: ChanHuiShan
 * @date: 2021-05-24 - 05 - 24 - 16:04
 * @description: com.chs.anno02
 * @version: 1.0
 */
public class Student extends Person {
    @Override
    public void eat(){
        System.out.println("重写eat方法。。。");
    }
    @Deprecated
    public void study(){
        System.out.println("这是一个被废弃的方法");
    }

}
