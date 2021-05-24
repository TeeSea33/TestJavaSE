package game;

import javax.swing.*;
import java.net.URL;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-31 - 03 - 31 - 15:33
 * @Description: com.chs.game
 * @version: 1.0
 */
public class images {
    // 相对路径file:/D:/FUTURE/Java/IDEA_workspace/TestJavaSE/out/production/TestSnakeGame/
    //将图片得路径封装为一个对象
    public static URL bodyURL = images.class.getResource("/images/body.png");
    //将图片封装为程序的一个对象
    public static ImageIcon bodyImg = new ImageIcon(bodyURL);
    //将图片得路径封装为一个对象
    public static URL downURL = images.class.getResource("/images/down.png");
    //将图片封装为程序的一个对象
    public static ImageIcon downImg = new ImageIcon(downURL);
    //将图片得路径封装为一个对象
    public static URL foodURL = images.class.getResource("/images/food.png");
    //将图片封装为程序的一个对象
    public static ImageIcon foodImg = new ImageIcon(foodURL);
    //将图片得路径封装为一个对象
    public static URL headerURL = images.class.getResource("/images/header.png");
    //将图片封装为程序的一个对象
    public static ImageIcon headerImg = new ImageIcon(headerURL);
    //将图片得路径封装为一个对象
    public static URL leftURL = images.class.getResource("/images/left.png");
    //将图片封装为程序的一个对象
    public static ImageIcon leftImg = new ImageIcon(leftURL);
    //将图片得路径封装为一个对象
    public static URL rightURL = images.class.getResource("/images/right.png");
    //将图片封装为程序的一个对象
    public static ImageIcon rightImg = new ImageIcon(rightURL);
    //将图片得路径封装为一个对象
    public static URL upURL = images.class.getResource("/images/up.png");
    //将图片封装为程序的一个对象
    public static ImageIcon upImg = new ImageIcon(upURL);

}
