package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class WrestlingConfig {

	// define bean for our happyFortuneService
	@Bean
	public FortuneService happFortuneService() {
		return new HappyFortuneService();
	}

	// define bean for our wrestling coach and inject dependency
	@Bean
	public Coach wrestlingCoach() {
		WrestlingCoach myWrestlingCoach = new WrestlingCoach(happFortuneService());
		return myWrestlingCoach;
	}
}
