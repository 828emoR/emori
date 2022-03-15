package com.dev;

import java.util.Scanner;

public class WhileExample3 {
	public static void main(String[] args) {
		// 계속 입력할 수 있지만 "-1"이라는 값을 입력하면 입력이 멈추게됨
		// 입력값의 누적이 가능함.
		// sum값에 입력.

		Scanner scn = new Scanner(System.in);
		int sum = 0, inputVal;

		while (true) {
			System.out.println("숫자를 입력하세요");
			inputVal = scn.nextInt();

			if (inputVal == -1) {
				break;
			}
			sum += inputVal;
		}
		System.out.println("현재 수는" + sum + "입니다.");
	}
}