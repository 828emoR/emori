package com.edu;

import java.util.Scanner;

public class CashExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 2개 값을 입력
		int price, cash;
		
		
		System.out.println("가격을 입력하세요");
		price = scn.nextInt();	 //5500원, 부가세 10% 포함된 금액.
		
		
			//문제 2 손님이 낸 금액
		System.out.println("손님이 낸 금액");
			cash = scn.nextInt(); //10000원
		
			
		//문제 3 하나는 상품의 부가세, 하나는 거스름돈
		//부가세 : 500원.
			System.out.println("부가세는" + price * 1/10 + "입니다");
		//거스름돈 : 4500원
			System.out.println("거스름돈은" + (cash - price) + "입니다");
	}

}
