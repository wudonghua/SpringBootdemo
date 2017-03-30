package com.test;

import com.alibaba.fastjson.JSON;
import com.cn.springboot.pojo.User;

/**
 * Created by dw07 on 2017/3/30.
 */
public class DemoTest {
    public String demoJSON() {
        User user = new User();
        user.setUserAge("23");
        user.setUserGender("1");
        user.setUserName("吴东华");
        String json = JSON.toJSONString(user);

        return json;
    }
}
