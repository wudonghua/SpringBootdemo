package com.cn.springboot.service;

import com.cn.springboot.source.configuration.Action;
import org.springframework.stereotype.Service;

/**
 * Created by dw07 on 2017/4/5.
 */
@Service
public class DemoAnnotationService {

    @Action(name = "add操作")
   public void add(){
        System.out.println("11");
    }
}
