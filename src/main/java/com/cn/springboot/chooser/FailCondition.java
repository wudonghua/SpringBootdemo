package com.cn.springboot.chooser;

import com.cn.springboot.pojo.User;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by dw07 on 2017/4/6.
 */
public class FailCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        User user = context.getBeanFactory().getBean(User.class);
        String userName = user.getUserName();
        return "FAIL".equals(userName);
    }
}
