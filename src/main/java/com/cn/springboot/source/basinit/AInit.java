package com.cn.springboot.source.basinit;


import com.cn.springboot.source.basinit.basconfig.AbsBaseInitConfig;

public class AInit extends AbsBaseInitConfig {

    public AInit() {
        super();//先调用父类构造器
        System.out.println("构造器 AInit");
    }

    @Override
    public void doInit() {
        System.out.println("执行Init操作");
    }
}
