package com.cn;

import com.cn.springboot.source.basinit.basconfig.BaseInit;
import org.jboss.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

import java.time.LocalDateTime;

/**
 * Created by dw07 on 2017/3/28.
 */
@SpringBootApplication
@ServletComponentScan
@EnableAspectJAutoProxy
@PropertySource("external/source")
public class Application {
    private static Logger logger = Logger.getLogger(Application.class);

    public static void main(String[] args) throws Exception {
        logger.info("SpringBoot启动: " + LocalDateTime.now());
        BaseInit.init();
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
//        User.exceptionGetStackTrace();
//        Throwable t = new Throwable();
//        StackTraceElement[] stackTrace = t.getStackTrace();
//        for ( StackTraceElement s:stackTrace) {
//            String className = s.getClassName();
//            String name = BaseUser.class.getName();
//            if(className.equals(name)){
//                System.out.println("+++++++++++");
//            }
//
//
//        }
//        User.ThrowableGetStackTrace();


//        Map<String, Object> map = new HashMap<>();
//        map.put("1", "value1");
//        map.put("2", "value2");
//        map.put("3", "value3");
//        map.put("4", "value4");
//        map.put("5", "value5");
//        map.put("6", "value6");
//        map.put("7", "value7");
//        for (String key : map.keySet()) {
//            boolean b = map.containsKey("8");
//            logger.info(b);
//        }
//        String uuid = UUID.randomUUID().toString().trim()
//
//                .replaceAll("-", "17896");
//        String substring = uuid.substring(0, 2);
//        logger.info(uuid);
//        logger.info(substring);
//




//        map.containsKey();
//        logger.info(values);


    }
}
