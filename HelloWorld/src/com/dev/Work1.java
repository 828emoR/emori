package com.dev;

import java.util.Scanner;

public class Work1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	
		while(true) {
			
			int num1 = 0; 
			int num2 = 0;
			
		System.out.println("첫번쨰 수를 입력하세요");
		num1 = scn.nextInt();
		System.out.println("선택된 숫자는 " + num1 + "입니다.");
		
		System.out.println("두 번째 숫자를 입력하세요");
		num2 = scn.nextInt();
		System.out.println("선택된 숫자는 " + num2 + "입니다.");
		
		if(num1 < num2) {
		
			System.out.println( num2 + "와(과)" + num1 + "의 차 는" + (num2 -= num1) + "입니다.");
		}		
	    if(num1 > num2) {

			System.out.println( num1 + "와(과)" + num2 + "의 차 는" + (num1 -= num2) + "입니다.");
		}
	    int y = 1;
	    
	    System.out.println("다시 계산하시겠습니까?  1(Y) / 0(N)");
	    y = scn.nextInt();
        if(y == 1) {
        	continue;
        }else {
        	break;
         }
	  }
   }
}

