package com.chs.test09;

import java.security.Provider;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-20 - 04 - 20 - 18:39
 * @Description: com.chs.test09
 * @version: 1.0
 */
public class Node {
    //三个属性：
    //上一个元素的地址：
    private Node pre;
    //当前存入的元素
    private Object object;
    //下一个元素地址：
    private Node next;

    public Node getPre() {
        return pre;
    }



    public void setPre(Node pre) {
        this.pre = pre;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "pre=" + pre +
                ", object=" + object +
                ", next=" + next +
                '}';
    }
}
