package com.cn.springboot.source.configuration;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;

/**
 * Created by dw07 on 2017/4/5.
 */
@Aspect
@Configuration
@Service
public class LogAspect {
  private  Logger logger = LoggerFactory.getLogger(LogAspect.class);
    //声明一个切点:
    @Pointcut("@annotation(com.cn.springboot.source.configuration.Action)")
    public void pointCut(){}

    //声明一个建言:
        //使用上面声明的切点,只要使用了该注解的方法都应该在之前执行after建言
    @After("pointCut()")
    public  void  after(JoinPoint joinPoint){
        //通过反射拿到注解上面的内容
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action= method.getAnnotation(Action.class);
        System.out.print(action);


        //注解上面的内容
        String name = method.getName();
         logger.info("DAO操作: {}",action);
    }

    //方法规则拦截
    @Before("execution(* com.cn.springboot.service.UserService.*(..))")
    public void before(JoinPoint joinPoint){
        //通过反射拿到注解上面的内容
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        //注解上面的内容
        String name = method.getName();
        logger.info("DAO操作: {}",name);
    }
}
