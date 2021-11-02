package com.springdemo.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomFortuneApp {
	//Practice Activity
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("myBaseballCoach", BaseballCoach.class);
		
		System.out.println(theCoach.getRandomFortune());
		
		context.close();

	}

}
