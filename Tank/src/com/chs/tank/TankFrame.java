package com.chs.tank;

import com.sun.javafx.binding.StringFormatter;

import javax.xml.transform.Source;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author: ChanHuiShan
 * @date: 2021-06-30 - 06 - 30 - 15:51
 * @description: com.chs.tank
 * @version: 1.0
 */
public class TankFrame extends Frame {
   public TankFrame(){
       setSize(800,600);
       setResizable(false);
       setTitle("TANK WAR");
       setVisible(true);

       addWindowFocusListener(new WindowAdapter() {
           @Override
           public void windowClosing(WindowEvent e) {
               System.exit(0);
           }
       });
   }

    @Override
    public void paint(Graphics g) {
       g.fillRect(200,200,50,50);
    }
}
