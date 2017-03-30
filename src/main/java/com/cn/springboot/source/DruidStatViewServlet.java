package com.cn.springboot.source;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * Created by dw07 on 2017/3/29.
 */
@WebServlet(urlPatterns = "/druid/*",
initParams = {
        @WebInitParam(name = "allow",value = ""),//白名单
//        @WebInitParam(name = "deny",value = ""),//黑名单
        @WebInitParam(name = "loginUsername",value = "admin"),//用户名
        @WebInitParam(name = "loginPassword",value = "@123"),//密码
        @WebInitParam(name = "resetEnable",value = "false")//禁止HTML页面上出现"Reset All"功能
})
public class DruidStatViewServlet extends StatViewServlet {
    private static final long serialVersionUID = 1837899765277857759L;
}
