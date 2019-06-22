package com.luv2code.springdemo;
import org.springframework.stereotype.Component;

/*using custom bean id */
//@Component("thatSillyCoach")

/*using default bean id which is tennisCoach in this case*/
@Component 
public class TennisCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return "Practice your backend volley";
	}
	
}
