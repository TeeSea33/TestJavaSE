package com.chs.test03;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-29 - 03 - 29 - 19:17
 * @Description: com.chs.test03
 * @version: 1.0
 */
//4.一个类中如果有方法是抽象方法，那么类也要变成一个抽象类
public abstract class Person {
    //1.在一个类中，会有一类方法子类对这个方法非常满意无需重写，直接使用
    public void eat(){
        System.out.println("一顿不吃饿得慌");
    }
    //2.在一个类中，会有一类方法，子类对这个方法永远不满意，会对这个方法进行重写
    //3.一个方法的方法体去掉，然后被abstract修饰，变成抽象方法
    public abstract void say();
    public abstract void sleep();

}
//6.抽象类可以被其他类继承
//7.一个类继承一个抽象类，那么这个类也可以变成一个抽抽象类
//8.一般子类不加abstract ，一般会让子类重写父类中的抽象类
//9.子类继承抽象类就必须重写全部的抽象方法
//10.子类如果没有重写全部抽象方法，那子类也可以变成一个抽象类
class Student extends Person{
    public void say(){
        System.out.println("我是成都人，但是不喜欢说成都话");
    }
    public void sleep(){
        System.out.println("成都人喜欢吃辣的");
    }

}

class Demo{
    public static void main(String[] args) {
        //11.创建抽象类的对象
//        Person p = new person();

        //12.创建一个子类对象
        Student s = new Student();
        s.sleep();
        s.say();

        //13.多态的写法：父类引用指向子类对象
        Person  p = new Student();
        s.sleep();
        s.say();
        
    }

        }