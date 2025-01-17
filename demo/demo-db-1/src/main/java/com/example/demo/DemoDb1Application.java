package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="com.example.demo.repository")
@SpringBootApplication
public class DemoDb1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoDb1Application.class, args);
	}

}
