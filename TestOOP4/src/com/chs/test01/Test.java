package com.chs.test01;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-21 - 03 - 21 - 16:07
 * @Description: com.chs.test01
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Girl g = new Girl();
        Animal an = PetStore.getAnimal("狗");

        g.play(an);




    }

}
