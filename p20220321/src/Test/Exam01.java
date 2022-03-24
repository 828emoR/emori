package Test;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1, n2;
		double result;
		
		
		System.out.println("첫 번째 정수를 입력하세요");
		n1 = scn.nextInt();
		
		System.out.println("두 번째 정수를 입력하세요");
		n2 = scn.nextInt();

		if (n1 > n2) {
			result = n1 / (double) n2;
		}else {
			result = n2 / (double) n1;
		}
		System.out.printf("결과: %.1f", result);
	}

}

