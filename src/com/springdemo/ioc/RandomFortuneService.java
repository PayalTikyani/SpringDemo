package com.springdemo.ioc;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] arr = new String[3];
		arr[0] = "Fortune befriends the bold!";
		arr[1] = "Diligence is the mother of good fortune.";
		arr[2] = "A great mind becomes a great fortune.";
		
		return arr[new Random().nextInt(arr.length)];
	}

}
