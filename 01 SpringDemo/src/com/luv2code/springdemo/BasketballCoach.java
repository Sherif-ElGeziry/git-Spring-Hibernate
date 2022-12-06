package com.luv2code.springdemo;

public class BasketballCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;

	// add new fields for email address and team
	private String emailAddress;
	private String team;

	public BasketballCoach() {
		System.out.println("BasketballCoach: inside no-arg constructor");
	}

	// our setter methods
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("BasketballCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("BasketballCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("BasketballCoach: inside setter method - setTeam");
		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		return "Shoot 300 3pts total from 5 positions";
	}

	@Override
	public String getDailyFortune() {

		// use my fortune service to get a fortune
		return "Don't be shy: " + fortuneService.getFortune();
	}

}
