package com.prod;

public class ArrayExample2 {
	public static void main(String[] args) {
		//정수를 담을 수 있는 배열
		//ages-> int/ 20살, 23살, 27살
		//20살 입니다.
		//23살 입니다.
		//27살 입니다.
		
		//sumAge, avgAge(double)
		int sum = 0;
		
//		double avg = sum / (double)3;
		
		int [] ages = new int[3];
		
		ages[0] = 20;
		ages[1] = 23;
		ages[2] = 28;
		
		System.out.println(ages[0] + "살 입니다." );
		System.out.println(ages[1] + "살 입니다." );
		System.out.println(ages[2] + "살 입니다." );
		

		
		for (int i = 0; i < 3; i++) {
			sum += ages[i];
		}
		double avg = sum / (double) 3;
		
		System.out.printf("평균은 " + " %.3f", avg +  "입니다");
		
	}

}
