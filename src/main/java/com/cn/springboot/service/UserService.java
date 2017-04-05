package com.cn.springboot.service;

import com.cn.springboot.pojo.User;

import java.util.List;

/**
 * Created by dw07 on 2017/4/1.
 */
public interface UserService {
    User findUserById(String id);
    int insertUser(User user);
    List<User> findAllUser();
}
