package game;

import javax.swing.*;
import java.awt.*;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-31 - 03 - 31 - 16:52
 * @Description: com.chs.game
 * @version: 1.0
 */
public class StartGame {
    public static void main(String[] args) {
        //创建一个窗体-------------------------------------
        JFrame jf = new JFrame();
        //给窗体设置一个标题
        jf.setTitle("派派吃橘子~");
        //设置窗体弹出对应的坐标：对应窗体的宽和高
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        jf.setBounds((width-800)/2,(height-800)/2,800,800);
        //设置窗体大小不可调
        jf.setResizable(false);
        //关闭窗口的同时 程序随之关闭：
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //默认情况下窗体是隐藏的效果;细节--》这个显现的方法最好放在后面
        jf.setVisible(true);
        //创建面板---------------------------------------------
        GamePanel gp = new GamePanel();
        //将面板放入窗体中
        jf.add(gp);


    }
}
