package Test;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
			
			int input;
			
			
			
			System.out.println("1~10까지의 수를 선택하세요");
			input = scn.nextInt();
			
			while(true) {
				int rand = (int) (Math.random() * 11) + 1; 
				System.out.println("임의의 생성된 값: "+ rand);
				if (rand == input) {
					break;
				}
			}	
	}
}
