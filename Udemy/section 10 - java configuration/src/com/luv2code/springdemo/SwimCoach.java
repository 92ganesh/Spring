/*
	This file demonstrate how to use java configuration in spring
	files used are SwimJavaConfigDemoApp.java, SwimCoach.java, SportConfig.java, SadFortuneService.java
*/
package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{
	private FortuneService fortuneService;
	
	
	// Field value injection using java
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;

	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim 1000m";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
