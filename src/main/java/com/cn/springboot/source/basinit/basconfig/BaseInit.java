package com.cn.springboot.source.basinit.basconfig;

import com.cn.springboot.source.basinit.AInit;
import com.cn.springboot.source.basinit.BInit;

/**
 * Created by dw07 on 2017/4/21.
 */
public class BaseInit {

    private static AInit aInit ;
    private static BInit bInit ;
    public static void init(){
        aInit = new AInit();
        aInit.init();
        bInit = new BInit();
        bInit.init();
    }
}
