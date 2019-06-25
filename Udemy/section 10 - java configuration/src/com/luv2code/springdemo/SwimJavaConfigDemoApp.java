/*
	This file demonstrate how to use java configuration in spring
	files used are SwimJavaConfigDemoApp.java, SwimCoach.java, SportConfig.java, SadFortuneService.java
*/
package com.luv2code.springdemo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// read spring config using java class
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SportConfig.class);
		
		SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// methods from SwimCoach.class whose values are injected thr java config @Value
		System.out.println("Email "+theCoach.getEmail());
		System.out.println("Email "+theCoach.getTeam());
		
		context.close();
	}

}
