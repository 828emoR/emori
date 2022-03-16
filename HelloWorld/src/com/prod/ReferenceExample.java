package com.prod;

public class ReferenceExample {
	
	public static void main(String[] args) {
		//참조타입 vs 기본타입
		int num1 = 10; // 리터럴 
		int num2 = 10; //
		//int, double, (byte short, long,=>정수| float, char, boolean=>실수)
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1 == num2);
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1 == str2);
	    System.out.println(str1.equals(str2));
		//이름은 같으나 주소지가 다르다. 서로 다른장소의 저장값 출력.
	}

}
