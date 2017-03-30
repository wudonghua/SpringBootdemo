package com.cn.springboot.pojo;

import java.io.Serializable;

/**
 * Created by dw07 on 2017/3/29.
 */
public class User implements Serializable {
    private static final long serialVersionUID = -7531102640304086150L;
    private String id;
    private String userName;
    private String userAge;
    private String userGender;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", userAge='" + userAge + '\'' +
                ", userGender='" + userGender + '\'' +
                '}';
    }
}
