package com.cn.springboot.source.init;


public class AInit extends BaseInitConfig {

    public AInit() {
        super();//先调用父类构造器
        System.out.println("构造器 AInit");
    }

    @Override
    public void doInit() {
        System.out.println("执行Init操作");
    }
}
