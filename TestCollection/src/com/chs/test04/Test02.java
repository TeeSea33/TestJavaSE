package com.chs.test04;

import java.util.ArrayList;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-19 - 04 - 19 - 15:12
 * @Description: com.chs.test04
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        //创建一个ArrayList集合，像这个集合中存入学生的成绩
        //加入泛型的优点：在编译时期就会对类型进行检查，不是泛型对应的类型就不可以添加入这个集合
        ArrayList<Integer> al = new ArrayList<Integer>();
        /*al.add("ll");就会报错了*/
        al.add(12);
        al.add(13);

        //穿件一个ArrayList集合，想这个集合中存入学生的成绩
        //加入反向的优点：在编译时期就会对类型进行检查，不是泛型对应的类型就不可以添加入这个结合
        //集合遍历
         for(Integer i:al){
             System.out.println(i);

         }



    }
}
