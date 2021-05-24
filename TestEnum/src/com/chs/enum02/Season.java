package com.chs.enum02;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-05-20 - 05 - 20 - 15:42
 * @Description: com.chs.enum02
 * @version: 1.0
 */
public enum Season {
    //提供枚举的有限的确定的对象
    SPRING("Spring","春暖花开"),
    SUMMER("SUMMER","烈日炎炎"),
    AUTUMN("AUTUMN","硕果累累"),
    WINTER("WINTER","冰天雪地");

    //属性
    private final String seasonName ;//名字
    private final String  seasonDesc;//描述

    private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }


    //额外因素

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

   /* @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }*/
}
