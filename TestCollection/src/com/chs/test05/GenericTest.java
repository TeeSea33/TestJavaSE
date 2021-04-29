package com.chs.test05;

import com.sun.org.apache.xpath.internal.operations.Gt;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-19 - 04 - 19 - 15:21
 * @Description:
 * GenericTest就是一个普通类
 * GenericTest<A> 就是一个泛型类
 * <>里面就是一个参数类型，但是这个类型是什么呢？是不确定的
 * 但是现在确定的是这个类型一定是一个引用数据类型，而不是基本数据类型</>
 * @version: 1.0
 */
public class GenericTest<E>{
    //属性
    int age;
    String name;
    E sex;

    //方法
    public void a(E n){}
    public void b(E[] m){}


}


class SubGenericTest extends GenericTest<Integer>{

}
class Demo{
    public static void main(String[] args) {
        //指定父类泛型，那么子类就不需要再指定
        SubGenericTest sgt = new SubGenericTest();
        sgt.a(19);
    }
}
class  Test{
    public static void main(String[] args) {
        //GenericTest实例化
        //（1）实例化的时候不指定泛型，如果实例化的时候不明确的指定类的泛型，那么认为此泛型为object类型
        GenericTest gt1 = new GenericTest();
        gt1.a("abc");
        gt1.a(14);
        gt1.a(new String[]{"a","b","c"});

        //（2）实例化的时候指定泛型 --->推荐的方式
        GenericTest<String> gt2 = new GenericTest<>();
        gt2.sex = "男";
        gt2.a("nv ");
        gt2.b(new String[] {"aq","b"});


    }
}

