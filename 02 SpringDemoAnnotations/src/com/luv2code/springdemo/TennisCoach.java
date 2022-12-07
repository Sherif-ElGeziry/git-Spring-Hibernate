package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

// @Component("thatSillyCoach") // removed explicit bean id and let default name instead "tennisCoach" (lower case first letter)
@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley!";
	}

}
