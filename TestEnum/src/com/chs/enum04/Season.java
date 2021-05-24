package com.chs.enum04;

import com.sun.beans.editors.ShortEditor;

import java.util.Timer;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-05-20 - 05 - 20 - 16:26
 * @Description: com.chs.enum04
 * @version: 1.0
 */
public enum Season implements TestInterface {
    SPRING{
        @Override
        public void show() {
            System.out.println("勒是春天");
        }
    },
    SUMMER{
        @Override
        public void show() {
            System.out.println("勒是夏天");
        }
    },
    AUTUMN{
        @Override
        public void show() {
            System.out.println("勒是秋天");
        }
    },
    WINTER{
        @Override
        public void show() {
            System.out.println("勒是冬天");
        }
    };
}
