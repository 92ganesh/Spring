package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	private String[] data= {"eg1","eg2","eg3"};
	
	private Random rand = new Random();
	
	@Override 
	public String getFortune() {
		int index = rand.nextInt(data.length);
		return "RandomFortuneService "+data[index];
	}
}
