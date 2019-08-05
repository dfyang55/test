package com.dfyang.xss.entity;


import com.dfyang.xss.aop.PreventXSSField;

/**
 * @Auther: 55411
 * @Date: 2019/6/21 16:20
 * @Description:
 */
public class User {

    private String username;

    private String password;

    @PreventXSSField
    private String nickname;

    @PreventXSSField
    private String description;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
