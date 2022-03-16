package com.prod;

public class Car {
	// 모델, 현재 속도, 최고속도, 가속(), 감속(), 현재속도()
	private String model;
	private int speed;
	private int maxSpeed;
	
	public void setModel(String model) {
		this.model = model;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void addSpeed() {
		if(this.speed + 10 >= this.maxSpeed) {
			System.out.println("최고 속도를 초과할 수 없습니다.");
			return;
		}
		System.out.println("가속합니다.");
		this.speed += 30;
		
	}
	
	public void breakSpeed() {
		System.out.println("감속합니다");
		this.speed -= 30;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
}
