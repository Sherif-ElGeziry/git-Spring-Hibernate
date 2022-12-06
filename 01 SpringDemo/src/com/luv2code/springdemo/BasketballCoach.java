package com.luv2code.springdemo;

public class BasketballCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;

	public BasketballCoach() {
		System.out.println("BasketballCoach: inside no-arg constructor");
	}

	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
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
