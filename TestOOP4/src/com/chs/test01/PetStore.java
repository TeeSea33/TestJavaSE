package com.chs.test01;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-29 - 03 - 29 - 16:31
 * @Description: com.chs.test01
 * @version: 1.0
 */
public class PetStore {//宠物店
    //方法：提供动物
    public static Animal getAnimal(String petName){//多态的一个应用场合
        Animal an = null;
        if("猫".equals(petName)){//petName.equals("猫")---》这样写容易发生空指针异常
            an = new Cat();
        }
        if("狗".equals(petName)){
            an = new Dog();
        }
        if("猪".equals(petName)){
            an = new Pig();
        }
        return an;
    }

}
