package com.edu;

public class Person extends Object{//person 은 Object 라는 클래스 아래 종속됨, 암튼그럼 반박시 3대가 머머리
	
	//field.
	private String name;
	private int age;
	private double height;
	private double weight;
	
	
	//constructor == 생성자(중요)
	//생성자를 여럿 생성하는 것을 overloading 이라 한다,
	public Person() {
		
	}
    public Person(String name) {
		
	}
	
	public Person(String name, int age, double height, double weight) {
	super();
	this.name = name;
	this.age = age;
	this.height = height;
	this.weight = weight;
}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	

}
