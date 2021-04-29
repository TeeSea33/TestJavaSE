package com.chs.test09;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-20 - 04 - 20 - 18:42
 * @Description: com.chs.test09
 * @version: 1.0
 */
public class MyLinkedList {
    //链中一定有一个首节点
    Node first;
    //链中一定有一个尾节点
    Node last;
    //计数器：
    int count = 0;

    //提供一个构造器
    public MyLinkedList(){

    }


    //添加元素方法：
    public void add(Object o){
        if(first==null){//证明你添加的元素是第一个节点
            //将添加的元素封装为一个node对象
            Node n = new Node();
            n.setPre(null);
            n.setObject(o);
            n.setNext(null);
            //当前链中第一个节点变为n
            first = n;
            //当前链中最后一盒节点变为n
            last = n;
        }else{//证明已经不是链中的第一个节点了
            Node n  = new Node();
            n.setPre(last);//n的上一个节点一定是当前链中的最后一个节点last
            n.setObject(o);
            n.setNext(null);

            //当前链中的最后一个节点的下一个元素要指向n
            last.setNext(n);
            //将最后一个节点变为n
            last = n;

        }
        //链中元素的数量要加一
        count += 1;
    }

    //得到集合中元素的数量
    public int getSize(){
        return count;
    }

    //通过下标得到元素
    public Object get(int index){
        //获取头元素，然后一路向下找元素
        Node n = first;
        for (int i = 0; i < index; i++) {
            n = n.getNext();
        }
        return n.getObject();
    }

}
class Test{
    public static void main(String[] args) {
        //创建一个MyLinkedList对象
        MyLinkedList ml = new MyLinkedList();
        ml.add("aa");
        ml.add("bb");
        ml.add("cc");
        System.out.println(ml.getSize());

        




    }
}

