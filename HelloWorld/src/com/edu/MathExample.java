package com.edu;

import java.util.Scanner;

public class MathExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double num1, num2, num3, num4, num5, num6;
		
		System.out.println("첫 번째 수를 입력해주세요");
		num1 = scn.nextDouble();
		
		System.out.println("두 번째 수를 입력해주세요");
		num2 = scn.nextDouble();
		
		num3 = num1 + num2;
	    num4 = num1 - num2;
	    num5 = num1 * num2;
	    num6 = num1 / num2;
		
	    System.out.println("두 수의 합은 " + num3 + " 입니다");
	    System.out.println("두 수의 차는 " + num4 + " 입니다");
	    System.out.println("두 수의 곱은 " + num5 + " 입니다");
	    System.out.println("두 수를 나눈 몫은 " + num6 + " 입니다");
	    System.out.println("두 수를 나누고 남은 값은" + ( num1 % num2 ));


	     scn.close();
	}
	
	}


