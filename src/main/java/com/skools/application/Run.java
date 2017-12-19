package com.skools.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 
 * @author rrao
 *
 */
@SpringBootApplication(scanBasePackages = "com.skools")
@EnableWebMvc
@EnableMongoRepositories(basePackages = "com.skools.dao")
public class Run {

	public static void main(String[] args) {
		SpringApplication.run(Run.class, args);
	}

}
