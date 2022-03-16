package com.prod;

public class Student {
	//22-123456
	// => 정보만을 저장하는것: 필드.(field)
	String studentNo;
	String studentName;
	double korScore;
	double engScore;

	//method : 기능, 함수
	void study(String gwamok) {
		System.out.println("이 조그마한 존재는 메모리입니다.");
	}
	void eat(String food) {//매개변수
		System.out.println("");
		
	}
	
	double getKorScore() {
		return korScore;
	}
	double getEngScore() {
		return engScore;
	}
	}
