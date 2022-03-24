package com.edu;

import java.util.Scanner;

public class Exam02 {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1, n2;
		double result;
		
		System.out.println("첫 번째 값을 입력하세요");
		n1 = scn.nextInt();
		System.out.println("두 번째 값을 입력하세요");
		n2 = scn.nextInt();
		
		if (n1 > n2) {
			result = n1 / (double) n2; //정수 연산은 결과값도 정수로 나옴.4바이트(정수) 8바이트(실수)
		}else {
			result = n2 / (double) n1;
		}
		System.out.printf("결과: %.1f", result);
	}

}
