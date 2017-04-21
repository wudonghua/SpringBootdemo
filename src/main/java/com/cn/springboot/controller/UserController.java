package com.cn.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.cn.springboot.pojo.User;
import com.cn.springboot.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;


@RequestMapping("/demo")
@RestController
@EnableAutoConfiguration
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

//    @PostConstruct
//    private void init(){
//        logger.info(userService.toString());
//
//    }

    @RequestMapping("/hello")
    String userIndex() {
        return "Hello";
    }

    @RequestMapping("/user")
    User findUser(@RequestParam String id) {
        return userService.findUserById(id);
    }

    @RequestMapping("/insert")
    void insertUser(@RequestBody User user) {
        userService.insertUser(user);
        String id = user.getId();
        logger.info("插入数据库的ID: {}", id);
    }

    @RequestMapping("allUser")
    List<User> findAllUser(){
        List<User> allUser = userService.findAllUser();
        Stream<User> stream = allUser.stream();
        stream.forEach(
                p->System.out.println(p)
        );
        return allUser;

    }

    @RequestMapping("get")
    public ModelAndView get(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login.jsp");
        return modelAndView;
    }
    @RequestMapping("map")
    public String getMapToJson(){
        Map<String,String> map = new HashMap<>();
        map.put("errorCode","0000");
        String jsonString = JSON.toJSONString(map);
        logger.info(jsonString);
        return jsonString;

    }


}
