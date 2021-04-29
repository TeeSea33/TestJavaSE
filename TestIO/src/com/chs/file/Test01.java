package com.chs.file;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.omg.CORBA.ARG_OUT;

import javax.lang.model.util.ElementScanner6;
import javax.xml.transform.Source;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-26 - 04 - 26 - 10:47
 * @Description: com.chs.file
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        //将文件封装为一个file类的对象
        File f = new File("d:\\FUTURE\\test.txt");
        File f1 = new File("d:\\FUTURE\\test.txt");
        File f2 = new File("d:/FUTURE/test.txt");
        //file.separator属性帮我们获取当前操作系统的路径拼接符号
        File f3 = new File("d:"+File.separator+"\\FUTRUE\\test.txt");

        //常用方法
        System.out.println("文件是否可读"+f.canRead());
        System.out.println("文件是否可写"+f.canWrite());
        System.out.println("文件的名字"+f.getName());
        System.out.println("上级目录"+f.getParent());
        System.out.println("是否是一个目录"+f.isDirectory());
        System.out.println("是否是一个文件"+f.isFile());
        System.out.println("是否隐藏"+f.isHidden());
        System.out.println("文件的大小"+f.length());
        System.out.println("是否存在"+f.exists());
        /*if(f.exists()){
            f.delete();
        }else{//如果不存在就创建这个文件
            f.createNewFile();


        }
        */
        System.out.println(f == f1);//比较两个对象的地址
        System.out.println(f.equals(f1));//比较两个对象对应的文件的路径

        //跟路径相关的
        System.out.println("绝对路径"+f.getAbsolutePath());
        System.out.println("相对路径"+f.getPath());
        System.out.println("toString"+f.toString());

        System.out.println("-----------------------");
        File f5 =new File("demo.txt");
        if(!f5.exists()){
            f5.createNewFile();
        }
        System.out.println("绝对路径"+f5.getAbsolutePath());
        System.out.println("相对路径"+f5.getPath());
        System.out.println("toString"+f5.toString());



















    }
}