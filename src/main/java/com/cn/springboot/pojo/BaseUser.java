package com.cn.springboot.pojo;

import java.io.Serializable;

/**
 * Created by dw07 on 2017/4/21.
 */
public class BaseUser implements Serializable {


    User u = new User();
    private Integer NO;

    public Integer getNO() {
        return NO;
    }

    public void setNO(Integer NO) {
        this.NO = NO;
    }


}
