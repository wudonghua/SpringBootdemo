//package com.cn.springboot.service.impl;
//
//import org.apache.commons.io.IOUtils;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.BeanNameAware;
//import org.springframework.context.ResourceLoaderAware;
//import org.springframework.core.io.Resource;
//import org.springframework.core.io.ResourceLoader;
//import org.springframework.stereotype.Service;
//
//import java.io.IOException;
//
///**
// * Created by dw07 on 2017/4/6.
// */
//@Service
//public class SpringAwareImpl implements BeanNameAware, ResourceLoaderAware {
//    Logger logger = LoggerFactory.getLogger(SpringAwareImpl.class);
//    private String beanName;
//    private ResourceLoader loader;
//
//    @Override
//    public void setBeanName(String name) {
//        this.beanName = name;
//    }
//
//    @Override
//    public void setResourceLoader(ResourceLoader resourceLoader) {
//        this.loader = resourceLoader;
//    }
//
//    public void getBeanName() throws IOException {
//        Resource resource = loader.getResource("classpath:external/source");
//        logger.info("Bean名称： {}", beanName);
//        String s = IOUtils.toString(resource.getInputStream(), "UTF-8");
//        logger.info("File文件内容: {}",s);
//    }
//
//
//}
