package com.chs5;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-18 - 03 - 18 - 10:10
 * @Description: com.chs5
 * @version: 1.0
 */
public class Demo {
    int id;
    static int sid;//静态属性是先于对象存在的
    public void a(){
        System.out.println(id);
        System.out.println(sid);
        System.out.println("----a");
    }
    //1.static 和 public都是修饰符，并列的没有先后顺序
    public static void b(){
//        System.out.println(this.id);在静态方法中不能使用this关键字
//      a();在静态方法中不能调用非静态的方法
//        System.out.println(id);在静态方法中不能访问非静态的属性
        System.out.println(sid);
        System.out.println("----b");
    }

    public static void main(String[] args) {
        //非静态的方法可以用对象名.方法名调用
        Demo d = new Demo();
        d.a();
        //静态方法可以用对象名.方法名也可以使用类名.方法名
        Demo.b();
        d.b();
    }
}
