package com.prod;

public class MemberExample {
	public static void main(String[] args) {
		//int num1=10; 수를 담고 싶을때
		//String name = "홍길동"; 문자를 담고 싶을때
		//?? Member = "문자" + "숫자" 를 담아보자.
		
		Member mem1 = new Member(); //name, age 속성이 들어있지 않은 상태.
//		mem1.name = "홍길동"; <=문자열
//		mem1.age = 20;      <=숫자
		
		Member mem2 = new Member();//일단 초기화부터
	    mem2.name = "김민수";
	    mem2.age = 25;
		
		System.out.println("mem1의 name속성: " + mem1.name);
		System.out.println("mem1의 age속성: " + mem1.age);
		
		Student st1 = new Student();
		st1.studentNo = "22-1234987";
		st1.studentName = "김영희";
		st1.korScore = 90;
		st1.engScore = 80;
		
		Student st2 = new Student();
		st2.studentNo = "17-15100143";
		st2.studentName = "김이모리";
		st2.korScore = 90;
		st2.engScore = 80;
	}

}
