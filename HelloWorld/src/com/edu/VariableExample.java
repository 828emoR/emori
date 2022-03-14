package com.edu;

public class VariableExample {
	public static void main(String[] args) {
		//변수의 타입
		int num1 = 100; //int 타입의 '정수' 를 지정함. 4byte가 필요.
		double num2 = 100.5; //소수점 까지 표현가능 8byte가 필요.
		double result = num1 * num2; 
        //자동형변환: 작은범위 -> 큰범위.

		// 10050; 으로 보여짐 단 result 앞의 타입은 더 큰 byte를 포함한 num2를 기준으로 할 것.
		System.out.println("결과: " + result);
		//강제형변환(casting): 큰범위 -> 작은범위.
		int val1 = 100;
		double val2 = 20.5;
		int sum = val1 + (int) val2;
		System.out.println("결과: " + sum);
		
		int n1 = 10;
		int n2 = 4;
		
		double n3 = n1 / (double)n2; // 10/4 => 2.5
	 System.out.println("나눈 결과: " + n3);
	 
	 //나머지 10을 3으로 나눈 나머지 => 1
	 int n4 = n1 % n2;
	System.out.println("나머지: " + n4);
	
	// 짝수, 홀수 구하기
	if(n1 % 2 ==0) {
		System.out.println(n1 + "의 값은 짝수 입니다.");
		if (n1 % 2 ==1) {
			System.out.println(n1 + "의 값은 홀수 입니다.");
		}
	}
	
	
	} 

}
