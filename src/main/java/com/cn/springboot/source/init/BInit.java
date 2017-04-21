package com.cn.springboot.source.init;

public class BInit extends BaseInitConfig {

    public BInit() {
        super();
        System.out.println("构造器 BInit");
    }

    @Override
   public void doInit() {
        System.out.println("执行Init操作");
    }
}
