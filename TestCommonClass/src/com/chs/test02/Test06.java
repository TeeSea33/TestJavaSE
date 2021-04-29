package com.chs.test02;

import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-06 - 04 - 06 - 17:07
 * @Description: com.chs.test02
 * @version: 1.0
 */
public class Test06 {
    public static void main(String[] args) {
        //String-->Calender
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想要查看的日期：（提示：请按照例如2012-5-6）");
        Calendar cal = Calendar.getInstance();
        Date date = Date.valueOf(sc.next());
        cal.setTime(date);
        System.out.println(cal);

        //后续操作：
        //星期提示
        System.out.println("日\t一\t二\t三\t四\t五\t六\t");


        //获取本月的最大天数
        int maxDay = cal.getActualMaximum(Calendar.DATE);
        //获取当前日期中的日
        int nowDay = cal.get(Calendar.DATE);

        //将日期转化为当前月的第一天
        cal.set(Calendar.DATE,1);
        //获取这个一号是一周的第几天
        int num = cal.get(Calendar.DAY_OF_WEEK);
        /*System.out.println(num);*/
        int day = num -1;

        //引入一个计数器
        int count = 0;
        //前面空出的天数就是num-1，打印出来
        for (int i = 0; i <num-1; i++) {
            System.out.print("\t");
        }
        //计数器要加上num- 1
        count += day;
        for (int i = 1; i < maxDay; i++) {
            if(i == nowDay){//标记的当前日期
                System.out.print(i+"*"+"\t");
            }else{
                System.out.print(i+"\t");
            }
            count++;//每在控制台输出一个数字，计数器做加一操作
            if(count%7==0){
                System.out.println();
            }
        }



    }
}
