package com.chs.test03;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-21 - 03 - 21 - 11:12
 * @Description: com.chs.test03
 * @version: 1.0
 */
public class Girl {
    //属性
    String name;
    double weight;
    //方法
    public void love(Boy boy){//参数是引用数据类型
        System.out.println("我男朋友的名字是："+ boy.name+"年龄是："+ boy.age);
        boy.buy();
    }
    //构造器

    public Girl() {
    }

    public Girl(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
}
