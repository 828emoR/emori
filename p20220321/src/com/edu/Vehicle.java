package com.edu;

public class Vehicle extends DriverExample{
	
	private int maxSpeed;
	
	public Vehicle() {
		this.maxSpeed = 100;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void run() {
		System.out.println("탈것이 달립니다.");
		
	}
	public void stop() {
		System.out.println("탈것이 멈춥니다.");
	}

	@Override
	public String toString() {
		
		return "택시의 최고속도는 "+ getMaxSpeed() + "입니다.";
	}

}
