package com.cn.springboot.service.impl;

import com.alibaba.fastjson.JSON;
import com.cn.springboot.mapper.UserMapper;
import com.cn.springboot.pojo.User;
import com.cn.springboot.service.UserService;
import com.cn.springboot.source.configuration.Action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dw07 on 2017/4/1.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    @Action(name = "查询操作")
    public User findUserById(String id) {
        return userMapper.findUserById(id);
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public List<User> findAllUser() {
        User user = new User();
        String s = JSON.toJSONString(user);
        return userMapper.findAllUser();
    }
}
