package com.prod;

//클래스를 정의하는 부분.
public class Calculator {
	
	double PI = 3.14;
	//       ↓매개변수↓매개변수
	int add(int n1, int n2) {
		return n1 + n2;
	}
	
	//반환: int, minus, v1, v2
	int minus(int v1, int v2) {
		return v1 - v2;//두 수의 차
	}
	//사각형의 넓이 계산.
	double getRectArea(double x, double y){
		return x * y;
	}
	//원의 넓이 계산
	double getCircleArea(double radius){
		return PI * radius * radius;
	}

}
