package com.chs.Test;

import com.chs.calculator.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLOutput;
import java.util.concurrent.Callable;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-05-20 - 05 - 20 - 10:16
 * @Description: com.chs.Test
 * @version: 1.0
 */
public class CalculatorTest {
    @Before
    public void init(){
        System.out.println("测试开始");
    }
    @After
    public void close(){
        System.out.println("测试结束");
    }
    @Test
    public void testAdd(){
        System.out.println("测试ADD方法");
        Calculator cal = new Calculator();
        int result = cal.add(30, 20);
        Assert.assertEquals(50,result);
    }
}
