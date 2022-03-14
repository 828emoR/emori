package com.edu;

import java.util.Scanner;

public class CalExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int hour, minute, second, inputVal;
		
		System.out.println("계산할 시간을 입력하세요.(시간 단위 입력)" );
		inputVal = scn.nextInt();
		
		
	    hour = inputVal * 1; //
	    minute = inputVal * 60; //
	    second = inputVal * 3600; //
	    
//	    System.out.println("시간 -> 시간/분/초 변환 결과");
		System.out.println("시간:" + hour);
		System.out.println("분:" + minute );
		System.out.println("초:" + second );
		

		
		System.out.println("계산할 시간을 입력하세요.(초 단위 입력)" );
		inputVal = scn.nextInt();
		
		
	    hour = inputVal / 3600; //5000/3600 =>시간
	    minute = inputVal % 3600 / 60; // 1400 / 60 =>23분
	    second = inputVal % 3600  % 60; // 1400 % 60 =>20초
	    
//	    System.out.println("초 -> 시/분/초 변경 결과");
		System.out.println(hour + "시간 " + minute + "분 " + second + "초");
	
		
		
		scn.close();
		}

	}
// (/= 빼기), (%= 나누기) (*= 곱하기) (+= 더하기)


//분 또는 시간 ->초 계산



		
