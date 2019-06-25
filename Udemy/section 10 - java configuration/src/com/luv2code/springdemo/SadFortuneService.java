/*
	This file demonstrate how to use java configuration in spring
	files used are SwimJavaConfigDemoApp.java, SwimCoach.java, SportConfig.java, SadFortuneService.java
*/
package com.luv2code.springdemo;

public class SadFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "Today is a sad day";
	}
	
}
