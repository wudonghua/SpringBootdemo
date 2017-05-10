package com.cn.springboot.source.basinit;

public class DInit extends AbcBaseConfig {

    public DInit() {
        super();
        System.out.println("构造器 BInit");
    }

    @Override
    public void doInit() {
        System.out.println("执行Init操作");
    }
}
