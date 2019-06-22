package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	
	public TrackCoach() {
		super();
	}

	@Override
	public String getDailyWorkout() {
		return "Run hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: "+fortuneService.getFortune();
	}
	
	// custom methods used in beanLifeCycle from section 6 lec 49
	public void doMyStartupStuff() {
		System.out.println("TrachCoach: inside doMyStartupStuff()");
	}
	public void doMyCleanupStuff() {
		System.out.println("TrachCoach: inside doMyCleanupStuff()");
	}
	
	
	

}
