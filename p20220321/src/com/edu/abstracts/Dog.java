package com.edu.abstracts;

public class Dog extends Animal{
	
	public Dog() {
		super();
		System.out.println("Dog() 생성자 호출");
	}

	@Override
	public void eat() {
		System.out.println("댕멍이가쳐묵쳐묵");
		
	}

	@Override
	public void speak() {
		System.out.println("댕멍댕멍댕멍댕멍댕멍");
	}
	
}
