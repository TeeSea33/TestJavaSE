package com.chs.file;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.IOException;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-26 - 04 - 26 - 16:59
 * @Description: com.chs.file
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        //将文件封装为一个file类的对象
        File f = new File("d:\\FUTURE\\test.txt");

        //常用方法
        System.out.println("文件是否可读" + f.canRead());
        System.out.println("文件是否可写" + f.canWrite());
        System.out.println("文件的名字" + f.getName());
        System.out.println("上级目录" + f.getParent());
        System.out.println("是否是一个目录" + f.isDirectory());
        System.out.println("是否是一个文件" + f.isFile());
        System.out.println("是否隐藏" + f.isHidden());
        System.out.println("文件的大小" + f.length());
        System.out.println("是否存在" + f.exists());


        //跟目录相关的方法：
        File f2 = new File("D:\\a\\b\\c");
        //创建目录：
        //f2.mkdir();//创建单层目录
        //f2.mkdirs();//创建多层目录

        //删除：如果是删除目录的话，只会删除一层，并且前提：这层目录是空的，里面没有内容，如果有内容就不会被删除
        f2.delete();
        //查看：
        String[] list = f.list();//文件夹下目录/文件对应的名字
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("=========================");
        File[] files = f.listFiles();//作用更加广泛
        for (File file : files) {
            System.out.println(file.getName() + "," + file.getAbsolutePath());
        }





    }
}
