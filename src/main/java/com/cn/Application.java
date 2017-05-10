package com.cn;

import com.alibaba.fastjson.JSON;
import com.cn.springboot.pojo.User;
import com.cn.springboot.source.basinit.BaseInit;
import com.cn.springboot.source.jedis.JedisConfig;
import org.jboss.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

import java.time.LocalDate;
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
        com.cn.springboot.pojo.User bean = new com.cn.springboot.pojo.User("123456", "x");
        String user = JSON.toJSONString(bean);
        JedisConfig.setValue("user", user);
        JedisConfig.setValue("Riven","This is a Bast Paly");
        String value = JedisConfig.getValue("Riven");
        String user1 = JedisConfig.getValue("user");
        User user2 = JSON.parseObject(user1, User.class);
        System.out.println(value);
        System.out.println(user2);
//        RInputStream bean1 = new RInputStream();
//        CebServiceImpl cebService = new CebServiceImpl(bean1);
//        bean1.start();
//        cebService.start();
//        TsetPrime tsetPrime = new TsetPrime();
//        byte[] prime = tsetPrime.getPrime();
        LocalDate ldt = LocalDate.now();
        logger.info(ldt);
//        tsetPrime.printPrime(prime);
//        tsetPrime.getRead();
//        UnZipUtil.zip("D:/D.zip", new File("D:/test.txt"));
//        UnZipUtil.unZip();
//        String dl = LocalDate.now().toString();
//        boolean b = UnZipUtil.deleteDirectory("D:/sssss/"+dl);
//        if(b){
//            System.out.println("删除成功");
//        }else{
//            System.out.println("删除失败");
//        }


    }

}
