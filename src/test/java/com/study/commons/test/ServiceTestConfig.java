package com.study.commons.test;

import com.study.config.DataInitializerConfig;
import com.study.config.RestTemplateConfig;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.dao.PersistenceExceptionTranslationAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration(exclude = {
        JmxAutoConfiguration.class,
        JdbcTemplateAutoConfiguration.class,
        ThymeleafAutoConfiguration.class,
        PersistenceExceptionTranslationAutoConfiguration.class})
@ComponentScan("com.study")
@EnableJpaRepositories("com.study.**.repositories")
@EntityScan("cn.site.**.models")
@EnableTransactionManagement(order = 3)
@EnableCaching(order = 2)
@EnableAspectJAutoProxy(exposeProxy = true, proxyTargetClass = true)
@Import({DataInitializerConfig.class, RestTemplateConfig.class})
public class ServiceTestConfig {
}
