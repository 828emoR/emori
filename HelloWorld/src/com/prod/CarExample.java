package com.prod;

public class CarExample {
	public static void main(String[] args) {
		
		Car Shelby = new Car();
		Shelby.setModel("GT500 2014");
		Shelby.setSpeed(0);
		Shelby.setMaxSpeed(354);
		
		Shelby.addSpeed();
		Shelby.addSpeed();
		Shelby.addSpeed();
		System.out.println("현재속도" + Shelby.getSpeed() + "km입니다.");
		Shelby.addSpeed();
		Shelby.addSpeed();
		Shelby.addSpeed();
		System.out.println("현재속도" + Shelby.getSpeed() + "km입니다.");		
		Shelby.addSpeed();
		Shelby.addSpeed();
		Shelby.addSpeed();
		Shelby.addSpeed();
		Shelby.addSpeed();
		Shelby.addSpeed();
		Shelby.addSpeed();
		Shelby.addSpeed();
		Shelby.addSpeed();
		System.out.println("현재속도" + Shelby.getSpeed() + "km입니다.");
		Shelby.addSpeed();
		Shelby.addSpeed();
		
		Shelby.breakSpeed();
		System.out.println("현재속도" + Shelby.getSpeed() + "km입니다.");

		
	}

}
