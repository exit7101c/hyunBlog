package com.hyun.apiblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import select.exquery.service.ExqueryService;

@SpringBootApplication
@ComponentScan(
		{"com.hyun.apiblog", "select.exquery.service", "select.exquery.dao"})
public class HyunApiBlogApplication {


	public static void main(String[] args) {
		SpringApplication.run(HyunApiBlogApplication.class, args);
	}
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOrigins("*");
			}
		};
	}

}
