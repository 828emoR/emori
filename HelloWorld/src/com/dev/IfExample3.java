package com.dev;

import java.util.Scanner;

public class IfExample3 {


	public static void main(String[] args) {
		int ranVal = (int) (Math.random() * 3) + 1; //0 부터 1 사이의 임의의 값을 생성
		
		
		Scanner scn = new Scanner(System.in);

		System.out.println("아쎄이! 숫자맞추기를 시작하지");
		System.out.println("1부터 3까지 원하는 숫자를 넣어라!");
		
		int num = scn.nextInt();
		
		System.out.println(ranVal);
		
		if (ranVal == num) {
		 System.out.println("아쎄이 33%확률을 뚫었군 새끼...기합!");
			
			
		}else {
			System.out.println("아쎄이...고작 33%도 못뚫나? 새끼..기열!");
		}
		
		
		
//		String restart;
//		int restart1 = Y;
//		
//		System.out.println("아쎄이, 다시 도전하겠나?");
//		
//		if (restart == ) {
//			
//		}
//		restart = scn.nextLine();
		
		
		 
		
	}

}
