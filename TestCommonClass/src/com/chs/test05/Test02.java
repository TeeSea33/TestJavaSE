package com.chs.test05;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-04-14 - 04 - 14 - 17:02
 * @Description: com.chs.test05
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //增
        sb.append("为自己而活这是梦想");
        System.out.println(sb);/*为自己而活这是梦想*/
        //删
        sb.delete(3,6);
        System.out.println(sb);/*为自己是梦想*/
        sb.deleteCharAt(2);//删除对应位置上的字符
        System.out.println(sb);/*为自是梦想*/
        //改---》插入
        sb.insert(3,",");
        System.out.println(sb);/*为自是,梦想*/
        //改---》替换
        sb.replace(3,5,"*****");
        System.out.println(sb);/*为自是我好累想*/
        sb.setCharAt(3,'!');
        System.out.println(sb);
        //查,打印
        for (int i = 0; i <sb.length(); i++) {
            System.out.println(sb.charAt(i)+"\t");

        }
        System.out.println();
        //截取
        String str = sb.substring(2,4);
        System.out.println(str);
        System.out.println(sb);

        //算法和数据结

    }
}
