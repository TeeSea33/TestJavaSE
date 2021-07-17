package com.chs.anno03;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author: ChanHuiShan
 * @date: 2021-05-24 - 05 - 24 - 19:25
 * @description: com.chs.anno03
 * @version: 1.0
 */
@Retention(RetentionPolicy.CLASS)
public @interface MyAnnotation2 {
    String value() default "sas";
}
