package com.chs.test03;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-21 - 03 - 21 - 11:12
 * @Description: com.chs.test03
 * @version: 1.0
 */
public class Boy {
    //属性：
    int age;
    String name;
    //方法：
    public void buy(){
        System.out.println("跟我谈恋爱，我给你买买买");
    }
    //构造器

    public Boy() {
    }

    public Boy(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
