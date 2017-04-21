package com.cn.springboot.service;

import com.cn.springboot.pojo.User;
import com.cn.springboot.source.configuration.Action;

import java.util.List;

/**
 * Created by dw07 on 2017/4/1.
 */
public interface UserService {
    @Action(name = "查询操作")
    User findUserById(String id);
    int insertUser(User user);
    List<User> findAllUser();
}
