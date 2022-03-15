package com.dev;

public class ForExample {
	public static void main(String[] args) {
//		 i = i + 1;
//		 i += 1;
//		 i++;
		//1 ~ 10 까지 더하는 방법은 ?
	    int sum = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			sum = sum + i; // 0 , 1 => 1
		}
		System.out.println("합계: " + sum);
	}

}
