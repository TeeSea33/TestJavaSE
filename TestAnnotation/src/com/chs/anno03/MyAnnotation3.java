package com.chs.anno03;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * @author: ChanHuiShan
 * @date: 2021-05-24 - 05 - 24 - 20:02
 * @description: com.chs.anno03
 * @version: 1.0
 */
@Target({TYPE,FIELD,METHOD})
public @interface MyAnnotation3 {
    String value() default "sas";
}

