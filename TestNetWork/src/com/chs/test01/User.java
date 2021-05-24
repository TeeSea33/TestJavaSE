package com.chs.test01;

import java.io.Serializable;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-05-18 - 05 - 18 - 16:57
 * @Description: com.chs.test01
 * @version: 1.0
 */
public class User implements Serializable {
    private static final long serialVersionUID = -6614167431281354713L;
    private String name;
    private String pwd;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }
}
