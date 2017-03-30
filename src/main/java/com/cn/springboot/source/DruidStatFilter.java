package com.cn.springboot.source;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Created by dw07 on 2017/3/29.
 */
@WebFilter(filterName = "druidWebStatFilter", urlPatterns = "/"
        , initParams = {//忽略资源
            @WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")
})

public class DruidStatFilter extends WebStatFilter {
}
