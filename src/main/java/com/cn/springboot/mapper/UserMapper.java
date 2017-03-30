package com.cn.springboot.mapper;

import com.cn.springboot.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by dw07 on 2017/3/29.
 */

public interface UserMapper {
    @Select("SELECT u.USER_NAME AS userName,u.USER_AGE AS userAge,u.USER_GENDER AS userGender FROM user u WHERE u.ID = #{id}")
    User findUserById(@Param("id") String id);

//    @Insert(" INSERT INTO  user (USER_NAME,USER_AGE,USER_GENDER) VALUE (#{userName},#{userAge},#{userGender})")
    int insertUser(@RequestBody User user);
}
