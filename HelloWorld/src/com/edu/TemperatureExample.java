package com.edu;

import java.util.Scanner;

public class TemperatureExample {
	public static void main(String[] args) {
		// C = 5/9(F-32) 화씨온도를 섭씨온도로 변경규칙.
		Scanner scn = new Scanner(System.in);
		double fDeg, cDeg;
		
		//30.0보다 클 경우에 "오늘은 더운 날씨네오" 그 외는 "여전히 더운 날씨네오" 
		System.out.println("5252 밖에 나가고 싶으면 오늘 온도를 입력해보라구 애송이");
		
		fDeg = scn.nextDouble();
		cDeg = (double) 5 / 9*(fDeg - 32);
	
		
		boolean result = cDeg > 25;
		
		if(result) {
			System.out.println(cDeg + "도 로군! 죽기 싫으면 돌아가라 애송이");
		}else {
			System.out.println("아직도 포기하지 않았나?" + cDeg + "도");
		}
		scn.close();
	}

}



// Scanner scn = new Scanner(System.in);
//double fDeg, cDeg;
//System.out.println("오늘 온도를 입력하세요");
//fDeg = scn.nextDouble();
//cDeg = (double) 5 / 9*(fDeg - 32);
//System.out.println(cDeg)

