package com.services.cfg.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages="com.services")
public class SpringBootHibernateHsqlDB extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootHibernateHsqlDB.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootHibernateHsqlDB.class, args);
	}

}