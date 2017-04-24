package com.cn.springboot.source.basinit;

import com.cn.springboot.source.basinit.basconfig.AbcBaseConfig;

public class BInit extends AbcBaseConfig {

    public BInit() {
        super();
        System.out.println("构造器 BInit");
    }

    @Override
   public void doInit() {
        System.out.println("执行Init操作");
    }
}
