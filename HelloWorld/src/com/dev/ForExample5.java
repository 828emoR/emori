package com.dev;

import java.util.Scanner;

public class ForExample5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		int num;
		int num2;
		
		System.out.println("약수를 구할 첫번째 수를 입력하세요" );
		num = scn.nextInt();
		
		System.out.println("약수를 구할 두번째 수를 입력하세요" );
		num2 = scn.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
			if (num2 % i == 0) {
				System.out.println(i);
				
			}
		}
	}

}
