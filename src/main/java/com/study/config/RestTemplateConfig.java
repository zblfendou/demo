package com.study.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ZhaoBaogang on 2017/2/6.
 */
@Configuration
//@ConditionalOnBean(RestTemplateBuilder.class)
public class RestTemplateConfig {
    @Autowired(required = false)
    private RestTemplateBuilder builder;

    @Bean
    @ConditionalOnMissingBean(RestTemplate.class)
    public RestTemplate restTemplate() {
        return builder.build();
    }
}
