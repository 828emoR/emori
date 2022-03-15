package com.dev;

public class WhileExample2 {
	public static void main(String[] args) {
		//1 ~ 10 까지의 수 중에서 짝수만 출력.
		//While 문으로 작성.
		
		int i = 1;
		while (i <= 10) {
			if(i % 2 == 0) {
				System.out.println("i의 값=>" + i);
			}
			i++;
		}
	}
}
