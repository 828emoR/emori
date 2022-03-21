package com.edu.abstracts;

public class AnimalExample {
	public static void main(String[] args) {
//		Animal animal = new Animal; //추상 클래스는 인스턴스 생성 불가.
		Animal animal = null;
		animal = new Dog();
		animal.setName("백구");
		animal.eat();
		animal.speak();
		
		
		animal = new Cat();
		animal.setName("두부");
		animal.eat();
		animal.speak();
	}

}
