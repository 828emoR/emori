package com.edu.InterFaces;

public class TV implements RemoteControl{
	
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}
	@Override
	public void powerON() {
		System.out.println("TV를 켭니다");
		
	}
	@Override
	public void powerOff() {
		System.out.println("TV를 끕니다");
		
	}
	

}
