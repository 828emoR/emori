package com.dev;

import java.util.Scanner;

public class ForExample3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//입력받는 두 수를 num1. num2
		
//		System.out.println(10 + "부터" + 20 + "까지의 합:" + 1000);
		
		int num1, num2;
		int sum = 0;
		
		System.out.println("첫 번째 수를 입력해주세요");
		num1 = scn.nextInt();
		System.out.println("첫 번째 수보다 더 큰 정수를 입력해주세요");
		num2 = scn.nextInt();
		
		for (int i = num1; i <= num2; i++) {
//			if (i % 2 ==0) { // (2씩 더한다? 2로 나눴을때 나머지가 없는?)
System.out.println(i);
				sum += i;
				
				
			}
		System.out.println(num1 + "부터" + num2 + "까지의 합:" + sum);
	
		
		
		
	}
}

