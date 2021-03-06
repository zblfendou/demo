package com.study;

import com.study.config.AsyncConfig;
import com.study.config.DataInitializerConfig;
import com.study.config.RestTemplateConfig;
import com.study.task.TestTask;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.dao.PersistenceExceptionTranslationAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration(exclude = {
		JmxAutoConfiguration.class,
		JdbcTemplateAutoConfiguration.class,
		PersistenceExceptionTranslationAutoConfiguration.class})
@ImportResource({"classpath*:*-dubbo.xml"})
@ComponentScan("com.study")
@EnableJpaRepositories("com.study.**.repositories")
@EntityScan("com.study.**.models")
@EnableTransactionManagement(order = 3)
@EnableCaching(order = 2)
@EnableAspectJAutoProxy(exposeProxy = true, proxyTargetClass = true)
@Import({AsyncConfig.class, DataInitializerConfig.class, RestTemplateConfig.class})
public class SpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplication.class, args);
		System.out.println("Services Started");
	}
}
