package com.dev;

import java.util.Scanner;

public class IfExample { // WhichExample, (firstName, first_name)= 대소문자 구별이 없을땐 언더바로 구별 (Class이름은 항상 대문자로.)
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 조건문 if.. 
		//80점 이상이면 Pass 
		
				System.out.println("점수를 입력해주세요");
				int score = scn.nextInt();
		
		if(score > 80) {
			System.out.println("Pass입니다. 당신의 점수는 ");
		} else {
			System.out.println("Fail입니다. 당신의 점수는 ");
		}
		// 90점 이상이면 a 80점 이상 B, 70점 이상 C, 60점 이상 D, 이외 F
		
		
		//↓   
		if(score >= 90) {// 크거나 같은(포함하는) 경우 >=, =< 사용
			if (score >= 95) {
				System.out.println("A+입니다.");
		} else {
			System.out.println("A입니다.");
			}
			
			
			
		}else if (score >= 80) {
			if (score >= 85) {
				System.out.println("B+입니다.");
			}else{
			System.out.println("B입니다.");
				}
		
			
			
		}else if (score >= 70) {
			if (score >= 75) {
				System.out.println("C+입니다.");
			}else{
			System.out.println("C입니다.");
			}
		
			
			
		}else if (score >= 60) {
			if(score >= 65) {
				System.out.println("D+입니다.");
			}else{
			System.out.println("D입니다.");
			}
		
		}else {
			System.out.println("F입니다.");
		}
		
		
		
		if (score >= 80) {
		System.out.println("축하드립니다.");
		}
		else {
			System.out.println("아깝습니다. 더 노력해주세요");
		}
	}
}
