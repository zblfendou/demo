package com.study.config;


import org.quartz.spi.JobFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import javax.inject.Inject;
import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by zbl on 2017/6/21.
 */
@Configuration
public class ScheduleConfig {
    private static final Logger logger = LoggerFactory.getLogger(ScheduleConfig.class);
    public static final String NEW_SCHEDULER = "new-scheduler";
    public static final String OLD_SCHEDULER = "common-scheduler";
    @Inject
    private DataSource dataSource;

    //    @Inject
//    private PlatformTransactionManager txManager;
    @Inject
    private JobFactory jobFactory;


    @Bean(NEW_SCHEDULER)
    public SchedulerFactoryBean newScheduler() throws IOException {
        return schedulerFactory(NEW_SCHEDULER);
    }

    @Bean(OLD_SCHEDULER)
    public SchedulerFactoryBean oldScheduler() throws IOException {
        return schedulerFactory(OLD_SCHEDULER);
    }

    private SchedulerFactoryBean schedulerFactory(String beanName) throws IOException {
        SchedulerFactoryBean factoryBean = new SchedulerFactoryBean();
        factoryBean.setBeanName(beanName);
        factoryBean.setDataSource(dataSource);
//        factoryBean.setTransactionManager(txManager);
        factoryBean.setJobFactory(jobFactory);

        factoryBean.setOverwriteExistingJobs(true);
        factoryBean.setQuartzProperties(quartzProperties());

        return factoryBean;
    }

    @Bean
    public Properties quartzProperties() throws IOException {
        PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
        propertiesFactoryBean.setLocation(new ClassPathResource("/quartz.properties"));
        propertiesFactoryBean.afterPropertiesSet();
        return propertiesFactoryBean.getObject();
    }
}
