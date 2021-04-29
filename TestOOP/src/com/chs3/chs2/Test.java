package com.chs3.chs2;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-13 - 03 - 13 - 11:12
 * @Description: com.chs2
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        /*
        1.一般保证空构造器的存在，空构造器中一般不会进行属性的赋值操作
        2.一般我们会重载构造器，在重载的构造器中进行属性赋值操作
        3.在重载构造器以后，如果没有定义空构造器的话，那就会出错
        4.
        * */
        Person p = new Person("lili",3,179);



    }
}
