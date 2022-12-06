package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		BasketballCoach theCoach = context.getBean("myBasketballCoach", BasketballCoach.class);
		BasketballCoach alphaCoach = context.getBean("myBasketballCoach", BasketballCoach.class);

		boolean result = (theCoach == alphaCoach);
		System.out.println("\nPointing to the same object: " + result);

		System.out.println("\nMemory location for theCoach: " + theCoach);
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");

		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		// call our new methods to get the literal values
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());

		// close the context
		context.close();
	}

}
