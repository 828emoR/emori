package com.prod;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.PI);
		
		int number1 = 10;
		int number2 = 20;
		
		//기능을 호출하는 부분     매개값1   매개값2
		int result =  cal.add(number1, number2); //add = 정수를 반환해주는 메소드
		System.out.println(number1 + "과" + number2 + "의 합계는 " + result);
		
		int result2 = cal.minus(number1, number2);
		System.out.println(number1 + "과" + number2 + "의 차이는 "+ result2);
		
		double area = cal.getRectArea(number1, number2);
		System.out.println("가로길이: " + number1 + ", " + "세로길이" + number2 + "의 너비: " + area);
		
		double r = 4.5;
		area = cal .getCircleArea(r);
		System.out.println("반지름: " + r + "의 넓이: " + area);
	}

}
