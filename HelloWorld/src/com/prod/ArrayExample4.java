package com.prod;

public class ArrayExample4 {
	public static void main(String[] args) {
		int [] numbers = { 35, 22, 17, 40, 28, 69, 74 };
		int sum = 0;
		int cnt = 0;
		for(int i=0; i< numbers.length; i++) {
			if (numbers[i]%2 == 0) {//짝수일 경우
			    sum += numbers[i];
			    cnt++;
//			    double avg = sum / numbers.length; <=얘로도 평균치 구할 수 있지 않을까
			}
		}
		System.out.println("짝수값의 합; " + sum);
		System.out.println("짝수값의 평균; " + (sum / (double) cnt));
	}

}
