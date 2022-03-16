package com.prod;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.studentName = "홍길동";
		s1.korScore= 80;
		s1.engScore = 90;
		s1.study("국어");
		s1.eat("급식");
	    
		double v1 = s1.getKorScore();
		
	    double v2 = s1.getEngScore();
	    
	    System.out.println("국어점수 " + v1 + ". " + "영어점수 " + v2 + ".");
		}
	}


