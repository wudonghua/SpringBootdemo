package com.cn;

import org.jboss.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import java.time.LocalDateTime;

/**
 * Created by dw07 on 2017/3/28.
 */
@SpringBootApplication
@ServletComponentScan
public class Application {
    private static Logger logger = Logger.getLogger(Application.class);
    public static void main(String[] args) throws Exception {
        logger.info("SpringBoot启动: "+LocalDateTime.now());
        SpringApplication.run(Application.class, args);
    }
}
