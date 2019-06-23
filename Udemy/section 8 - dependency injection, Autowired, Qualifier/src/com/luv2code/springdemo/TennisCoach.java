/*	Types of dependency injection:-
 *  Field, Setter, Constructor
 *  
 * */

package com.luv2code.springdemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*using custom bean id */
//@Component("thatSillyCoach")

/*using default bean id which is tennisCoach in this case*/
@Component 
public class TennisCoach implements Coach {
	// ******** Field injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
	/*
	// ******** Setter injection *******
	// Note:- name of method can be anything(need not to be a setter method). Just the annotation @Autowired will fetch the appropriate obj
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	// ******** Setter injection ends *******
	 */
	
	/* 
	// ******** Constructor injection *******
	// when using Autowired, Spring will scan the component which has implemented required interface
	// in our case its HappyFortuneService (if there are multiple components then use @Qualifier)
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	// ******** Constructor injection ends ********
	*/
	
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backend volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}
