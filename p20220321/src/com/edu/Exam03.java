package com.edu;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	  
		
		int[] intAry = new int[4];
		
		for(int i=0; i < intAry.length; i++) {
			System.out.println("정수를 입력하세요");
			intAry[i] = scn.nextInt();
		}
		//이래야 배열에 값이 저장됨.[]내에 가장 큰 수를 비교해야하기때문에
		int maxValue = intAry[0];
		for (int i=0; i < intAry.length; i++) {
			if (intAry[i] > maxValue ) {
				maxValue = intAry[i];
			}
		}
		System.out.println("최대값: "+ maxValue);
	}

}
