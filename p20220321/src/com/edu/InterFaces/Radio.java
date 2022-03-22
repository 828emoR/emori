package com.edu.InterFaces;

public class Radio implements RemoteControl{
	public void turnOn() {
		System.out.println("라디오를 켭니다");
	}
	public void turnOff() {
		System.out.println("라디오를 끕니다");
	}
	
	
	@Override
	public void powerON() {
		System.out.println("라디오를 켭니다");
	}
	@Override
	public void powerOff() {
		System.out.println("라디오를 끕니다");
	}

}
