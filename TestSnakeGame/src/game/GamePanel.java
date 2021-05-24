package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-31 - 03 - 31 - 17:25
 * @Description: com.chs.game
 * @version: 1.0
 * GamePanel继承了JPanel以后才能成为一个面板
 */
public class GamePanel extends JPanel {
    //定义蛇的长度
    int length;
    //定义两个数组
    //一个数组存x轴的坐标
    int[] snakeX = new int[200];
    //一个数组存y轴的坐标
    int[] snakeY = new int[200];
    //加入一个定时器
    Timer timer;
    //定义蛇的行走方向
    String direction;//U D R L
    //定义食物的x,y轴坐标
    int foodX;
    int foodY;
    //定义一个积分
    int score;
    //加入一个变量，判断小蛇的状态：
    boolean isDie = false;//默认没有死亡
    //333333333333定义大小25倍数333333333
    int size = 50;
    //游戏只有两个状态，开始，暂停：
    boolean isStart = false;//默认游戏是暂停效果

    public void init(){
        //初始化蛇的长度
        length = 3;
        //初始化蛇头坐标
        snakeX[0] = 200;
        snakeY[0] = 300;
        //初始化第一节身子坐标
        snakeX[1] = snakeX[0]-size;
        snakeY[1] = 300;
        //初始化第二节身子坐标
        snakeX[2] = snakeX[1]-size;
        snakeY[2] = 300;
        //初始化蛇头的方向
        direction = "R";//U D L R
        //初始化食物的坐标
        foodX = 300;
        foodY = 200;

    }

    public GamePanel() {
        init();
        //将焦点定位在当前操作的面板上
        this.setFocusable(true);
        //加入监听
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {//监听键盘按下的操作:空格，上下左右
                super.keyPressed(e);
                int keyCode = e.getKeyCode();
                //监听空格
                if(keyCode == KeyEvent.VK_SPACE){
                    if(isDie){
                        init();
                        isDie = false;
                    }else {
                        isStart = !isStart;//监听到空格以后，游戏开始的就变成暂停的，暂停的就变成了开始的
                        repaint();//重绘的动作
                    }
                }
                //监听向上
                if(keyCode == KeyEvent.VK_UP){
                    direction = "U";
                }
                //监听向下
                if(keyCode == KeyEvent.VK_DOWN){
                    direction = "D";
                }
                //监听向左
                if(keyCode == KeyEvent.VK_LEFT){
                    direction = "L";
                }
                //监听向右
                if(keyCode == KeyEvent.VK_RIGHT){
                    direction = "R";
                }
            }
        });

        //对定时器进行初始化动作：
        timer = new Timer(130, new ActionListener() {
            /*
            ActionListener是 事件监听
            相当于每100ms就监听一下你是否发生了一个动作
            具体动作放入actionPerformed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isStart&&isDie==false){//游戏是开始状态的时候蛇才会动
                    //后一节身子走到前一节身子
                    for (int i = length-1; i > 0 ; i--) {
                        snakeX[i] = snakeX[i-1];
                        snakeY[i] = snakeY[i-1];

                    }
                    //动头：
                    if("R".equals(direction)){
                        snakeX[0]  += size;
                    }
                    if("L".equals(direction)){
                        snakeX[0]  -= size;
                    }
                    if("U".equals(direction)){
                        snakeY[0]  -= size;
                    }
                    if("D".equals(direction)){
                        snakeY[0]  += size;
                    }
                    //防止蛇超出边界
                    /*if(snakeX[0]>750){
                        snakeX[0] = 25;
                    }
                    if(snakeX[0]<25){
                        snakeX[0] = 750;
                    }
                    if(snakeY[0]>725){
                        snakeY[0] = 75;
                    }
                    if(snakeY[0]<75){
                        snakeY[0] = 725;
                    }*/

                    //检测碰撞的动作：
                    if(snakeX[0]==foodX&&snakeY[0]==foodY){
                        //蛇的长度要加1
                        length++;
                        //食物坐标需要改变,随机生成坐标，是size的倍数，x:25,750 y:75,725
                        foodX = size*(int)(13*Math.random())+50;
                        foodY = size*(int)(12*Math.random())+100;
                        //吃上食物以后积分加十
                        score += 1;
                    }
                    //死亡判定：
                    // 1.蛇头与任意一个蛇身撞上都要死亡
                     for (int i = 1; i <length ; i++) {
                        if(snakeX[0]==snakeX[i]&&snakeY[0]==snakeY[i]){
                            isDie = true;
                        }
                    }
                    //2.碰壁死亡
                    if(snakeX[0]>700||snakeX[0]<50||snakeY[0]>650||snakeY[0]<100){
                        isDie = true;
                    }
                    repaint();
                }
            }
        });
        //定时器要启动
        timer.start();
    }

    /*
    -------------------------任何要画的东西----------------------------------
        paintComponent这个方法比较特殊，这个方法就属于图形版的main方法
        虚拟机就可以自动调用
         */
    @Override
    protected void paintComponent(Graphics g) {
        /*-------------------------面板底色--------*/
        super.paintComponent(g);
        //填充背景颜色
        this.setBackground(new Color(225, 175, 230));
        //画头部的图片:
         images.headerImg.paintIcon(this,g,10,10);
        //调节画笔的颜色
        g.setColor(new Color(252, 255, 137));
        //画一个矩形
        g.fillRect(10,70,770,685);

        /*-------------------蛇身--------------*/
        //画蛇头需要根据方向来画
        if("R".equals(direction)){
            images.rightImg.paintIcon(this,g,snakeX[0],snakeY[0]);
        }
        if("L".equals(direction)){
            images.leftImg.paintIcon(this,g,snakeX[0],snakeY[0]);
        }
        if("U".equals(direction)){
            images.upImg.paintIcon(this,g,snakeX[0],snakeY[0]);
        }
        if("D".equals(direction)){
            images.downImg.paintIcon(this,g,snakeX[0],snakeY[0]);
        }
       /* //画第一节身子
        images.bodyImg.paintIcon(this,g,snakeX[1],snakeY[1]);
        //话第二节身子
        images.bodyImg.paintIcon(this,g,snakeX[2],snakeY[2]);*/
       //使用循环来画身子
        for (int i = 1; i < length ; i++) {
            images.bodyImg.paintIcon(this,g,snakeX[i],snakeY[i]);
        }
        /*-------------------提示语--------------*/
        //如果游戏暂停的话，界面中间就应该有一句
        if(isStart == false){
            //画一个文字
            g.setColor(new Color(135, 125, 230));
            //三个参数：字体，加粗，字号
            g.setFont(new Font("黑体",Font.BOLD,40));
            //画文字：三个参数：文字内容，x轴
            g.drawString("点击空格开始游戏",250,330);

        }
        /* ---------------------画食物------------------*/
        images.foodImg.paintIcon(this,g,foodX,foodY);
        /*----------------积分------*/
        g.setColor(new Color(226, 229, 230));
        g.setFont(new Font("微软雅黑",Font.BOLD,24));
        g.drawString("橘子："+score,620,45);
        /*--------死亡状态提示----*/
        if(isDie){
            g.setColor(new Color(230, 11, 11));
            g.setFont(new Font("微软雅黑",Font.BOLD,20));
            g.drawString("派派撞到墙壁或者派大星啦！按下空格重新吃橘子！",250,330);
        }
    }
}
