package com.chs.test10;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-05-17 - 05 - 17 - 15:32
 * @Description: com.chs.test10
 * @version: 1.0
 */
public class Product {
    //品牌
    private String Brand;
    //产品类型
    private String name;
    //添加flag
    private boolean flag = false;
    //添加lock锁
    Lock lock = new ReentrantLock();
    //搞一个生产者队列
    Condition producerCondition = lock.newCondition();
    //搞一个消费者队列
    Condition consumeCodition = lock.newCondition();
    public Product() {
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //生产者生产商品的方法
    public void setProduct(String brand, String name) {
        lock.lock();
        try {
            if(flag){
                try {
                    /*wait();*/
                    producerCondition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.setBrand(brand);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setName(name);
            System.out.println("生产者生产了" + this.getBrand() + this.getName());
            flag = true;
            /*notify();*/
            consumeCodition.signal();
        }finally {
            lock.unlock();
        }


    }

    //消费者消费商品
    public void getProduct(){
        lock.lock();
        try {
            if(!flag){
                try {
                    /*wait();*///当前进程等待 回来以后执行以后的代码
                    consumeCodition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("消费者消费了"+this.getBrand()+this.getName());

            flag = false;
            /*notify();*///提醒另外的进程可以进行了
            producerCondition.signal();
        }finally {
            lock.unlock();
        }

    }


}
