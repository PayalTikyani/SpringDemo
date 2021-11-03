package com.springdemo.ioc;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {}

	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it : " + fortuneService.getFortune();
	}

	@Override
	public String getRandomFortune() {
		return fortuneService.getFortune();
	}
	
	//custom init method
	public void doMyStartUpStuff() {
		System.out.println("TrackCoach : inside method doMyStartUpStuff");
	}
	
	//custom destroy method
	public void doMyCleanUpStuff() {
		System.out.println("TrackCoach : inside method doMyCleanUpStuff");
	}

}
