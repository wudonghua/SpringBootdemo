package com.cn.springboot.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by dw07 on 2017/4/6.
 */
@Service
@Async
public class AsyncTaskServiceImpl {
    Logger logger = LoggerFactory.getLogger(AsyncTaskServiceImpl.class);
    @Async
    public void asyncTask1(Integer integer){

        logger.info("asyncTask1异步序列号：{}",(integer+1));

    }
    @Async
    public void asyncTask2(Integer i){
        logger.info("      asyncTask2异步序列号: {}",i);
    }
}
