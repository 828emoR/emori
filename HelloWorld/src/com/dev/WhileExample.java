package com.dev;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
//		//for
//		for(int i = 1; i <=5; i++) {
//			System.out.println("i의 값 =>" + i);
//		}
//			
//		
//		//while
//		int i = 1;//변수를 1차 지정, 값의 초기화
//		while(i <= 5) {//i가 5이하인지 확인하는 작업, 조건식
//			System.out.println("i의 값 => " + i );//5 이하일 경우 해당 값을 출력 후 계산함.
//			i++; //증가 또는 감소식. 조건식을 만족시키지 못할경우 while 로 돌아가서 다시 수행.
//		}
//		
//		//while
//		int num = 0;
//		while(true) {
//			System.out.println("num의 값 => " + num );
//			num ++;
//		      if(num>5) {
//			  break;//반복문 탈출.
//		}
				
				//while
		      
		      Scanner scn = new Scanner(System.in);
			
				int input;
				
				
				
				System.out.println("1~ 100까지 골라보쇼");
				input = scn.nextInt();
				
				while(true) {
					int rand = (int) (Math.random() * 100) + 1; // 1 ~ 100
					System.out.println("임의의 생성된 값: "+ rand);
					if (rand == input) {//rand 가 input과 같아질 때 멈춤
						break;
					}
				}	
		}
//		
//		//while
//		while(true) {
//			int rand = (int) (Math.random() * 100) + 1; // 1 ~ 100
//			System.out.println("임의의 생성된 값: "+ rand);
//			if (rand == 8) {//rand 가 8이 될 경우 멈춤
//				break;
//			}
//		}
//		System.out.println("EOP");

	}
//
//}
