package com.springdemo.ioc;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//add new fields email and team
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("CricketCoach : inside no-arg constructor");
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach : inside setter methods - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach : inside setter methods - setTeam");
		this.team = team;
	}

	//setter method for dependency injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : inside setter methods - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getRandomFortune() {
		return fortuneService.getFortune();
	}

}
