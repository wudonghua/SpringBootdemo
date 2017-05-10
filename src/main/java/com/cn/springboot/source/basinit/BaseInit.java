package com.cn.springboot.source.basinit;

/**
 * Created by dw07 on 2017/4/26.
 */
public class BaseInit {
    private static AInit aInit ;
    private static DInit bInit ;
    public static void init(){
        aInit = new AInit();
        aInit.init();
        bInit = new DInit();
        bInit.init();
    }
}
