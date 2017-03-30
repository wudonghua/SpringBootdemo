package com.cn.springboot.controller;

import com.cn.springboot.mapper.UserMapper;
import com.cn.springboot.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/ss")
@RestController
@EnableAutoConfiguration
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/hello")
    String userIndex() {
        return "Hello";
    }

    @RequestMapping("/user")
    User findUser(@RequestParam String id) {
        return userMapper.findUserById(id);
    }

    @RequestMapping("/insert")
    void insertUser(@RequestBody User user) {
        userMapper.insertUser(user);
        String id = user.getId();
        logger.info("插入数据库的ID: {}", id);
    }
}
