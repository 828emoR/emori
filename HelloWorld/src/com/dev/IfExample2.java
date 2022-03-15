package com.dev;

import java.util.Scanner;

public class IfExample2 {
	public static void main(String[] args) {
		//물건의 가격이 50000원 이상일 경우 배송비 0 출력
		//50000이하일 경우 3000원의 배송비 출력
		
		//결재 금액이 얼마일지를 보여주는 코드
		
		Scanner scn = new Scanner(System.in);
//		
//		int A, B, C, D, cashing, price;
//		
//		A = 30000; 
//		B = 25000;
//		C = 10000;
//		D = 5000;
//		
//		
//		System.out.println("구매할 물건을 입력하세요");
//		System.out.println("A = 30000원");
//		System.out.println("B = 25000원");
//		System.out.println("C = 10000원");
//		System.out.println("D = 5000원");
//	    scn.nextInt();
//		
//		
//		
//		
//		
//		
//		
        int price, shippingfree = 3000;
        System.out.println("물건의 가격을 입력하세요");
        price = scn.nextInt();
	    
        		if(price >= 50000) {
        			price = price;
        		}else {
        			price = price + shippingfree;
        		}
        price = (price >= 50000) ? price : price + shippingfree;
        
        System.out.println("결재할 금액은 " + price + "원 입니다.");
        scn.close();
		
		
		
	}

}
