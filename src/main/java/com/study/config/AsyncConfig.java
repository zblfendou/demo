package com.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;
/**
 * Created by zbl on 2017/6/19.
 */
@EnableAsync
public class AsyncConfig {
    @Bean
    public TaskExecutor taskExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(10);
        taskExecutor.setMaxPoolSize(50);
        taskExecutor.setQueueCapacity(50);
        taskExecutor.setRejectedExecutionHandler(new CallerRunsPolicy());
        taskExecutor.afterPropertiesSet();
        taskExecutor.setThreadNamePrefix("testExecutor");
        return taskExecutor;
    }
}
