package com.edu.InterFaces;

public class Refrigerator implements RemoteControl{
	public void turnOn() {
		System.out.println("냉장고를 켭니다");
	}

	public void turnOff() {
		System.out.println("냉장고를 끕니다");
	}

	@Override
	public void powerON() {
		System.out.println("냉장고를 켭니다");

		
	}

	@Override
	public void powerOff() {
		System.out.println("냉장고를 끕니다");
		
	}

	
	
}