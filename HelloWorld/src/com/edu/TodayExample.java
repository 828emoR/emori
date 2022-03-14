package com.edu;
//이름을 입력받도록(String) -> scn.nextline();
//연락처 입력(String) -> scn.nextLine();
//나이 입력(Int) -> scn.nextInt();
//키 입력(double) -> scn.nextDouble();

//이름은 : ???
//연락처 : ???
//나이  : ???
//키 : ???(소숫점)
//적정몸무게: (키 - 100) * 0.9 => 60.3 크면 과체중 적으면 저체중.
//+-5키로

import java.util.Scanner;

public class TodayExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String Name, Call; 
		int Age;
		double Cm;
		
		double realWeigth = 69.3; //30
	
		
		System.out.println("이름은 무엇인가요?");
		Name = scn.nextLine();
		System.out.println(Name);
		
		System.out.println("나이를 입력하세요");
		Age = scn.nextInt();
		System.out.println(Age);
		
		System.out.println("연락처는 무엇인가요?");
		Call = scn.nextLine();
		System.out.println(Call);
		
		System.out.println("키는 몇cm인가요?");
		Cm = scn.nextDouble();
		System.out.println(Cm);
		
		System.out.println("이름은" + Name + "입니다");
		System.out.println("나이는" + Age + "입니다");
		System.out.println("연락처는" + Call + "입니다");
		System.out.println("키는" + Cm + "입니다");
	
		double weight = (Cm - 100) * 0.9;
		
	    System.out.println("몸무게를 입력하세요");
	    weight = scn.nextDouble();
	    System.out.println(weight);
	    
		if(weight > (60.3)) {
			System.out.println("살좀 빼셈 돼지쉨ㅋㅋ");
		}else {
				System.out.println("저 몸뚱이가 돼지가..아냐..?");
//
//
//		if(weight + 5 > realWeigth && weight -5 < realWeigth) {
//			System.out.println("적정몸무게입니다.");
//			}else{
//				System.out.println("살좀 빼십쇼 휴먼");
//			}
//		
//			
//	}	
//	
//}

		
	}
	}
}
	

	

