package com.cn.springboot.source.configuration;

import com.cn.springboot.chooser.FailCondition;
import com.cn.springboot.chooser.SucceedCondition;
import com.cn.springboot.service.SuccessOrFailService;
import com.cn.springboot.service.impl.FailServiceImpl;
import com.cn.springboot.service.impl.SuccessServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ConditionConfig {
    @Bean
    @Conditional(SucceedCondition.class)
    public SuccessOrFailService successService() {
        return new SuccessServiceImpl();
    }

    @Bean
    @Conditional(FailCondition.class)
    public SuccessOrFailService failService() {
        return new FailServiceImpl();
    }
}
