/*
	This file demonstrate how to use java configuration in spring
	files used are SwimJavaConfigDemoApp.java, SwimCoach.java, SportConfig.java, SadFortuneService.java
*/
package com.luv2code.springdemo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")  // to read from .properties files
public class SportConfig {
	// no need to write anything here if using component scan. Above annotation is used to scan components
	// It is similar to xml config using component scan
	
	
	// without @ComponentScan
	// define bean
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// define bean for coach and inject dependency i.e fortuneService
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
	
	
}
