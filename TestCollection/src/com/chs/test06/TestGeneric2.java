package com.chs.test06;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-19 - 04 - 19 - 16:48
 * @Description: com.chs.test06
 * @version: 1.0
 * 1.泛型方法：
 * 不是带泛型的方法就是泛型方法
 * 必须满足对应的那个参数类型和当前所在的这个类，是否是泛型类，泛型是啥 无关
 * 2.泛型方法定义的时候，前面要加上<T>
 *      原因：如果不加的话，会把T当做一种数据类型，然而代码中没有T类型就会报错
 * 3.T的类型是在调用方法的时候确定的
 * 4.泛型方法可否是静态方法？  可以是静态方法
 */
public class TestGeneric2<A> {
    //不是泛型方法
    public void a(A a){

    }
    //泛型方法：参数类型不一样
    public  static <T> void b(T t){
    }


}

class Demo{
    public static void main(String[] args) {
        TestGeneric2 tg = new TestGeneric2();
        tg.b("abc");
        tg.b(14);
        TestGeneric2.b(17);
    }
}