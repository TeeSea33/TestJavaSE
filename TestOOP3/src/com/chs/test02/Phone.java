package com.chs.test02;

import java.util.Objects;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-20 - 03 - 20 - 17:23
 * @Description: com.chs.test02
 * @version: 1.0
 */
public class Phone {
    //属性：
    private String brand;
    private double price;
    private int year;
    //方法：

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
   /* public boolean equals(Object obj) {
        *//*
        * a instanceof b:
        * 判断a对象是否是b这个类的实例
        * *//*
        if(obj instanceof Phone){//属于phone对象
            Phone other = (Phone)obj;
            if(this.getBrand()==other.getBrand()){
                return true;
            }
        }

        return false;

    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Double.compare(phone.price, price) == 0 &&
                year == phone.year &&
                Objects.equals(brand, phone.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price, year);
    }
    //构造器：

    public Phone() {
    }

    public Phone(String brand, double price, int year) {
        this.brand = brand;
        this.price = price;
        this.year = year;
    }
}
