package com.cn.springboot.source.configuration;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;


/*
            rejectPolicy预定义有四种：
            (1)ThreadPoolExecutor.AbortPolicy策略，是默认的策略,处理程序遭到拒绝将抛出运行时 RejectedExecutionException。
            (2)ThreadPoolExecutor.CallerRunsPolicy策略 ,调用者的线程会执行该任务,如果执行器已关闭,则丢弃.
            (3)ThreadPoolExecutor.DiscardPolicy策略，不能执行的任务将被丢弃.
            (4)ThreadPoolExecutor.DiscardOldestPolicy策略，如果执行程序尚未关闭，则位于工作队列头部的任务将被删除，
                然后重试执行程序（如果再次失败，则重复此过程）.
        */
@Configuration
@EnableAsync//开启异步任务支持
class TaskExecutorConfig implements AsyncConfigurer{
    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(5);//线程池维持线程的最小数量
        executor.setMaxPoolSize(10);//线程池维持线程的最大数量
        executor.setQueueCapacity(25);//队列的最大长度
        //设置拒绝策略
//        ThreadPoolExecutor.CallerRunsPolicy rejectPolicy = new ThreadPoolExecutor.CallerRunsPolicy();
//        executor.setRejectedExecutionHandler(rejectPolicy);
        executor.initialize();
        return executor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}
