package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

	private FortuneService fortuneService;

	// define a default constructor
	public BasketballCoach() {
		System.out.println(">> BasketballCoach: inside default constructor!");
	}

	/*
	 * @Autowired public BasketballCoach(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */

	// define a setter method
	@Autowired
	@Qualifier("randomFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> BasketballCoach: inside setFortuneService method!");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Shoot 300 3pts total from 5 positions";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
