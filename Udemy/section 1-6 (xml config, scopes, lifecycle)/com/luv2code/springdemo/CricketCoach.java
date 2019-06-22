package com.luv2code.springdemo;

public class CricketCoach implements Coach{
	private FortuneService fortuneService;
	private String email,team;
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg Constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("cricket: inside FortuneService setter");
		this.fortuneService = fortuneService;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("cricket: inside email setter");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("cricket: inside team name setter");
		this.team = team;
	}

	
	
	
}
