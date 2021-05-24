package com.chs.enum01;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-05-20 - 05 - 20 - 10:57
 * @Description: com.chs.enum01
 * @version: 1.0
 */
public class Season {//枚举类 有限的内容
    //属性
    private final String seasonName ;//名字
    private final String  seasonDesc;//描述

    private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //提供枚举的有限的确定的对象
    public static final Season SPRING = new Season("Spring","春暖花开");
    public static final Season SUMMER = new Season("SUMMER","烈日炎炎");
    public static final Season AUTUMN = new Season("AUTUMN","硕果累累");
    public static final Season WINTER = new Season("WINTER","冰天雪地");

    //额外因素

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
