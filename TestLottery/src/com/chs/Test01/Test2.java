package com.chs.Test01;

import java.util.Scanner;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-11 - 03 - 11 - 19:24
 * @Description: com.chs.Test01
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] balls = new int[7];
        int count = 0;
        while(true){
            System.out.println("-------一夜暴富系统-----");
            System.out.println("欢迎来到一夜暴富系统，请选择下列功能：");
            System.out.println("1.投注号码");
            System.out.println("2.开奖");
            System.out.println("3.退出");
            int choice = sc.nextInt();
/*          优化：对你录入的choice做一个过滤：
            while(choice!=1&&choice!=2&&choice!=3){
                System.out.println("对不起，你录入的功能错误，请重新录入：");
                int newChoice = sc.nextInt();
                choice = newChoice;
            }*/

            //根据你录入的数字，判断执行对应的功能：
            switch (choice) {
                case 1:
                    System.out.println("暴富系统》》》投注：");
                    System.out.println("输入你要投注的号码");
                    for (int i = 1; i <=7; i++) {
                        if(i==7){
                            //蓝球号码
                            System.out.println("请输入蓝球号码（1~16）：");
                            balls[i-1] = sc.nextInt();


                        }else{
                            System.out.println("请输入第"+i+"个红色球的号码(1~33)：");
                            balls[i-1] = sc.nextInt();
                       }

                    }
                case 2:
                    System.out.println("暴富系统》》》》开奖啦！！");
                    //1.定义一个中奖的号码,调用一个方法生成一个随机数组
                    int[] luckBall = getLuckBall();
                    //2.将两组号码进行比对，调用一个方法判断中奖等级
                    int level = getLevel(balls,luckBall);
                    //根据level的结果返回中奖结果
                    switch(level){
                        case 1:
                            System.out.println("恭喜你，中奖了一等奖！ 1注奖金500万，您一共获得"+500*count+"万元，恭喜你一夜暴富了！！！");
                        case 2:
                            System.out.println("恭喜你，中奖了一等奖！ 1注奖金100万，您一共获得"+100*count+"万元，恭喜你一夜暴富了！！！");
                        case 3:
                            System.out.println("恭喜你，中奖了一等奖！ 1注奖金30万，您一共获得"+30*count+"万元，恭喜你一夜暴富了！！！");
                        case 4:
                            System.out.println("恭喜你，中奖了一等奖！ 1注奖金5万，您一共获得"+5*count+"万元，恭喜你一夜暴富了！！！");
                        case 5:
                            System.out.println("恭喜你，中奖了一等奖！ 1注奖金2千，您一共获得"+2000*count+"元，恭喜你一夜暴富了！！！");
                        case 6:
                            System.out.println("恭喜你，中奖了一等奖！ 1注奖金2千，您一共获得"+2000*count+"元，恭喜你一夜暴富了！！！");

                    }
                case 3:
                    System.out.println("暴富系统》》》》退出功能");
                    System.out.println("确定要退出吗？Y/N:");
                    String isExit = sc.next();
                    switch (isExit) {
                        case "Y":
                            System.out.println("系统退出，欢迎您下次继续使用！");
                            return;//结束当前方法
                    }

            }
        }

    }

    public static int[] getLuckBall(){
        int[] arr = new int[7];
//        Math.random();
        //遍历赋值
        for (int i = 0; i < 7 ; i++) {
            if(i!=7){
                //给蓝色球赋值
                arr[i] = (int)(Math.random()*32 + 1);
            }else{
                arr[i] = (int)(Math.random()*15 + 1);
            }
        }
        return arr;
    }

    public static int getLevel(int[] balls,int[] luckBall){
        int level = 0;
        //添加计数器来计算红球相等：
        int redCount = 0 ;
        //添加计数器来计算蓝球相等：
        int blueCount = 0;
        for (int i = 0; i <7; i++) {
            if (i != 6) {
                for (int j = 0; j <7 ; j++) {
                    //比对红球
                    if (balls[i] == luckBall[j]) {
                        redCount++;
                    }
                }
            }else{
                //比对蓝球
                if (balls[6] == luckBall[6]) {
                    blueCount++;
                }
            }
        }
        //输出比对结果：
        System.out.println("红球有"+redCount+"个相等");
        System.out.println("蓝球有"+blueCount+"个相等");
        if(redCount==6&&blueCount==1){
            level = 1;
        }else if(redCount==6){
            level = 2;
        }else if(redCount==5&&blueCount==1){
            level = 3;

        }else if(redCount==5||(redCount==4&&blueCount==1)){
            level = 4;
        }else if(redCount==4||(redCount==3&&blueCount==1)){
            level = 5;
        }else{
            level = 6;
        }
        return level;
    }


}
