package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		boolean result=(theCoach==alphaCoach);
		
		System.out.println("compare theCoach and alpha :- "+result);
		System.out.println("Memory location for theCoach   "+theCoach);
		System.out.println("Memory location for alphaCoach "+alphaCoach);

	}

}
