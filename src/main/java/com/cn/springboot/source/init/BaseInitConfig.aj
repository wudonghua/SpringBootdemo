package com.cn.springboot.source.init;

/**
 * Created by dw07 on 2017/4/21.
 */
public abstract class BaseInitConfig implements BaseConfiguration{

    public BaseInitConfig() {
        Throwable throwable = new Throwable();
        StackTraceElement[] stackTraces = throwable.getStackTrace();
        for (StackTraceElement stackTrace:stackTraces) {
            String className = stackTrace.getClassName();
            String name = BaseInit.class.getName();
            if(className.equals(name)){
                System.out.println(className+" 在 "+name+" 初始化成功!");
            }
        }
    }

    @Override
    public void init() {
        doInit();
    }

    public abstract void doInit() ;
}
