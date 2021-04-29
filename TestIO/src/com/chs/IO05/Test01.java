package com.chs.IO05;

import java.io.*;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-29 - 04 - 29 - 20:50
 * @Description: com.chs.IO05
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        //DataOutputStream:将内存中的基本数据类型和字符串的变量写出到文件中
        /*File f = new File("D:\\FUTURE\\Java\\IDEA_workspace\\TestJavaSE\\TestIO\\src\\com\\chs\\IO05\\Test.txt");
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);*/
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(new File("D:\\FUTURE\\Java\\IDEA_workspace\\TestJavaSE\\TestIO\\src\\com\\chs\\IO05\\Test.txt")));
        //向外将变量写到文件中去
        dos.writeUTF("你好");
        dos.writeBoolean(false);
        dos.writeInt(18);
        dos.writeDouble(18.3);

        //关闭流
        dos.close();

    }
}
