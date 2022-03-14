package com.edu;

public class Variables {
	public static void main(String[] args) {
		//변수 : 메모리공간 이름지정 값을 할당.
		int age = 20; // 20 == 30
		System.out.println("age변수: " + age );
		int num1 = 30;
		int num2 = 50;
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		System.out.println("20 + 10 = 30");
//↑해당 구문은 "" 안에 위치한 텍스트 값을 출력함.
		
//		String name = "홍길동"; // 문자열.
//	    name = "최민규";
//		System.out.println(name + "의 나이는 " + age + "입니다.");
		
		String Phonenumber = "010-2437-9092";
		String email = "828emor@gamil.com";
		
		final String myName = "Emori";//상수(Constance)
//	    myName = "이모리"; final 값이 붙으면 변경불가 선언.
		//전화번호, 이메일 값을 담을 수 있는 변수
		
		String name = "Emori";
		name = "Emori";
		System.out.println(name + "'s call number is " + Phonenumber + ", " + " e-mail address is " + email + " .");
		
//		System.out.println("Emori's call num: 010-2437-9092이며 이메일은 828emoR@gamil.com");
	}
}
