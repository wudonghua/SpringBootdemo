package com.cn.springboot.source.configuration;


import java.lang.annotation.*;

/**
 * 切面
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
