/*
@Scope - singleton,prototype,request,session, global-session
 
 
Init and destroy using annotations
@PostConstruct and @PreDestroy
NOTE:- @PostDestroy is called when obj is out of scope in singleton but not in prototype
*/

package com.luv2code.springdemo;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component 
@Scope("singleton")  // prototype or singleton
public class TennisCoach implements Coach {
	// ******** Field injection **************
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	
	@PostConstruct
	public void doStartupStuffs() {
		System.out.println("doStartupStuffs()");
	}
	
	@PreDestroy
	public void doCleanupStuffs() {
		System.out.println("doCleanupStuffs()");
	}
	
	
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backend volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}
