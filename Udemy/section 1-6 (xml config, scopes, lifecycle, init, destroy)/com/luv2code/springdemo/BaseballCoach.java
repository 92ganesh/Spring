package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	// private field for dependency
		private FortuneService fortuneService;
		
		// constructor for dependency injection
		public BaseballCoach(FortuneService theFortuneService) {
			fortuneService = theFortuneService;
		}
		
		
		@Override
		public String getDailyWorkout() {
			return "Spend 30 min on batting practice";
		}

		@Override
		public String getDailyFortune() {
			// use my fortuneService to get a fortune
			return fortuneService.getFortune();
		}
}
