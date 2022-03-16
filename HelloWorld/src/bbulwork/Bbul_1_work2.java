package bbulwork;

import java.util.Scanner;

public class Bbul_1_work2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int num1, num2, num3;
		int check1, check2, check3, check4;
		
		System.out.println("첫번째 숫자를 입력해주세요");
		num1 = scn.nextInt();
		
		System.out.println("두번째 숫자를 입력해주세요");
		num2 = scn.nextInt();
		
		System.out.println("세번째 숫자를 입력해주세요");
		num3 = scn.nextInt();
		
		
		check1 = (num1 > num2) ? num2 : num1; // num1가 num2보다 클 경우 num2를 출력, 아닐경우 num1을 출력
		//check2 = (num1 > num3) ? num3 : num1; // num1가 num3보다 클 경우 num3을 출력, 아닐경우 num1을 출력
		check2 = (num2 > num3) ? num3 : num2; // num2가 num3보다 클 경우 num3를 출력, 아닐경우 num2를 출력
		check3 = (num3 > num1) ? num3 : num1; // num3가 num2보다 클 경우 num2를 출력, 아닐경우 num3를 출력

		System.out.println(check1 + "," + check2 + "," + check3);
		
		}
}
