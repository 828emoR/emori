package com.dev;
 
import java.util.Scanner;

public class SwitchExample2 {
	public static void main(String[] args) {
		//90이상 A , 80점 이상 B, 70점 이상 C, 60점 D, 그외 F
		
		int score = (int) (Math.random() * 100);
		
		System.out.println(score + "점이군");
		

		
		
		switch (score / 10) {
		case 9: 
			System.out.println("자네는 A일세");
			break;
		case 8:
			System.out.println("자네는 B일세");
			break;
		case 7:
			System.out.println("자네는 C일세");
			break;
		case 6:
			System.out.println("자네는 D일세");
			break;
			default:
			System.out.println("자네는 사람이 맞는가...? F일세! 떼이잉...쯪쯪");

		}
		
	}

}
