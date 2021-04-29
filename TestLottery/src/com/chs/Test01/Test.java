package com.chs.Test01;

import java.util.Scanner;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-11 - 03 - 11 - 16:03
 * @Description: com.chs.Test01
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //扫描器
        Scanner sc = new Scanner(System.in);
        //定义一个二维数组来存放每一注的号码
        int[][] arr = new int[2][];


        while(true){
            //控制台输出：

            System.out.println("-------一夜暴富系统-----");
            System.out.println("欢迎来到一夜暴富系统，请您输入红色球号码(1~33)和蓝色球号码(1~16)，然后期待您的好运吧：");
            outer:
            for (int i = 0; i < arr.length; i++) {
                if(i==0){
                    //对红色号码数组进行输入

                    for (int j = 0; j < 6; j++) {
                        System.out.println("请输入第"+(j+1)+"个红色球的号码(1~33)：");
                        int num = sc.nextInt();
                        int[] temper = new int[6];
                        if((num>=0)&&(num<=33)){
                            temper[j] = num;//
                        }else{
                            System.out.println("请输入1~33的整数!");
                            break outer;
                        }
                        arr[i]=temper;
                    }

                }else{
                    //对蓝色号码进行输入
                    System.out.println("请输入蓝色球的号码(1~16)：");
                    int num = sc.nextInt();
                    int[] temper = new int[1];
                    if(num>=0&&num<=33){
                        temper[0] = num;
                    }else{
                        System.out.println("请输入1~16的整数");
                        break outer;
                    }
                    arr[i]=temper;
                }
            }
            for(int i=0;i<2;i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }


            }
            System.out.println();
            //调用我的彩票方法：
            Lottery(arr);

        }


    }
    public static void Lottery(int[][] a){
        /**
        * functional description:
        * @param: int[][] a
        * @return: 是否中奖，中奖等级和金额
        * @auther: ChenHuiShan
        * @date:2020.3.11
        */

    }
}

