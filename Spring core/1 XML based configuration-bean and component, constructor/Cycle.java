package com.ganesh.SpringTest;

import org.springframework.stereotype.Component;

@Component
public class Cycle implements Vehicle{
	public void drive() {
		System.out.println("Cycle running");
	}
}
