package com.chs;

import javax.xml.transform.Source;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-13 - 03 - 13 - 9:20
 * @Description: com.chs
 * @version: 1.0
 */
public class Person {
    //名词---属性---成员变量---放在类方法外（注意：我们只把有需要的内容写到代码里）
    int age;//年龄
    String name;//姓名
    double height;//身高
    double weight;//体重


    //动词---方法
    //吃饭
    public void eat(){
        int num = 0;//局部变量：放在方法中，必须进行初始化
        System.out.println("我喜欢吃饭");
    }
    //睡觉
    public void sleep(String address){
        System.out.println("我在"+address+"睡觉");
    }
    //自我介绍
    public String introduce(){
        return "我的名字是"+name+",我的年龄是"+age+",我的身高是"+height+"，我的体重是"+weight;
    }

}
