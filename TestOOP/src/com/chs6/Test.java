package com.chs6;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-18 - 03 - 18 - 10:25
 * @Description: com.chs6
 * @version: 1.0
 */
public class Test {
    //属性
    int a;
    static int sa;
    //方法
    public void a(){
        System.out.println("----a");
        {
            //普通代码块限制了局部变量的作用范围
            System.out.println("-----这是普遍块");
            int num =10;
            System.out.println(num);
        }
        //System.out.println(num);

    }
    public static void b(){
        System.out.println("----b");
    }
    //构造器
    public Test(){

    }
    public Test(int a){
        this.a = a;
    }

    //构造块
    {
        System.out.println("------这是构造块");

    }

    //静态块
    //在静态块中只能访问静态属性和静态方法

    static{
        System.out.println("-----这是静态块");
        System.out.println(sa);
        b();
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.a();

        Test t2 = new Test();
        t2.a();

    }
}
