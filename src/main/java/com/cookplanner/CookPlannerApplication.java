package com.cookplanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class CookPlannerApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(CookPlannerApplication.class, args);
	}
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CookPlannerApplication.class);
	}
}
