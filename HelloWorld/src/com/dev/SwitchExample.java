package com.dev;

import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {
		//가위(1), 바위(2), 보(3)
		int ranVal = (int) (Math.random() *3) + 1;
		

		Scanner scn = new Scanner(System.in);

		System.out.println("아쎄이! 올챙이크림을 건 짱깸뽀를 시작하지");
		System.out.println("자 시작한다 짱 깸 뽀!");
		
		
		
		int num = scn.nextInt();
		
		
		
    	if (ranVal == 1 ) {
			System.out.println("가위!");
		}else if (ranVal == 2) {
			System.out.println("바위!");
		}else if (ranVal == 3) {
			System.out.println("보!");
		}
    	
    	if (num == ranVal) {
    		sysout
//		
//		switch(ranVal) {
//		case 1:
//			System.out.println("짱!");
//			break;
//		case 2:
//			System.out.println("깸!");
//			break;
//		case 3:
//			System.out.println("뽀!");
		}
		System.out.println("짱깸뽀는 끝이다 애송이");
		
	}

}
