package com.cn.springboot.service.impl;

import com.cn.springboot.service.SuccessOrFailService;

/**
 * Created by dw07 on 2017/4/6.
 */
public  class SuccessServiceImpl implements SuccessOrFailService {
    @Override
    public String userName() {
        return "My Name is Riven!";
    }
}
