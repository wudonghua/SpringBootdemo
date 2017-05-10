package com.cn.springboot.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * Created by dw07 on 2017/3/29.
 */
@Service
public class User implements Serializable {
    private static final long serialVersionUID = -7531102640304086150L;
    private String id;
    @Value("${name}")
    private String userName;
    @Value("${userAge}")
    private String userAge;
    private String userGender;

    public User() {}

    public User(String id, String userGender) {
        this.id = id;
        this.userGender = userGender;
    }

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

    public static void  exceptionGetStackTrace(){
        StackTraceElement[] stacknTrace = new Exception().getStackTrace();
        for ( StackTraceElement s :stacknTrace) {
//
//
//
//            System.out.println(s.getClassName()+"\n"+s.getMethodName()+"\n"+s.getFileName());
//            System.out.println("\n"+"\n");

        }
    } public static void  ThrowableGetStackTrace(){
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        for ( StackTraceElement s :stackTrace) {

            String className = s.getClassName();
            String name = BaseUser.class.getName();

            System.out.print(className+"\t");
            System.out.print(name);

            boolean equals = className.equals(name);
            System.out.println(equals);


//            System.out.println(s.getClassName()+"\n"+s.getMethodName()+"\n"+s.getFileName());
//            System.out.println("\n"+"\n");

        }
    }

}
