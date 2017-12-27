package com.skools.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 
 * @author rrao
 *
 */
@SpringBootApplication(scanBasePackages = "com.skools")
@EnableWebMvc
@EnableAutoConfiguration
@EntityScan("com.skools.entity") 
@EnableJpaRepositories(basePackages = {"com.skools.dao"})
@EnableTransactionManagement
@EnableRedisHttpSession
public class Run {

	public static void main(String[] args) {
		SpringApplication.run(Run.class, args);
	}

}
