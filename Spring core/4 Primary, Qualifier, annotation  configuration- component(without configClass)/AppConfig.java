/**
 * NOTE:- 
 * name of the method can be anything
 * name of this file name i.e AppConfig can be anything
 * only the word Samsung is mapped 
 */

package com.ganesh.SpringTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.ganesh.SpringTest")
public class AppConfig {
	/** Bean is created like 
	 * @Bean
	 * public Interface/Class_name anyMethodName() {
	 * 	  return new Class_name();
	 * }
	 */
	
	
/*	@Bean
	public Samsung getPhone() {  
		return new Samsung();
	}
	
	@Bean
	public MobileProcessor getProcessor() {
		return new Snapdragon();
	}
*/
} 
