package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
public class SportConfig {

	// define bean for our sad fortune service
	@Bean
	public FortuneService saFortuneService() {
		return new SadFortuneService();
	}

	// define bean for out swimCoach and inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(saFortuneService());
	}
}
