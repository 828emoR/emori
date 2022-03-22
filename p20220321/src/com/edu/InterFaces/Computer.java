package com.edu.InterFaces;

public class Computer implements RemoteControl{
	private String cpu;
	private String memory;
	private 

	
	
	@Override
	public void powerON() {
		System.out.println("컴퓨터를 켭니다.");
		
	}

	@Override
	public void powerOff() {
		System.out.println("컴퓨터를 끕니다.");
		
	}
	
	

}
