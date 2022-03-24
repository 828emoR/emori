package Test;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
		
		System.out.println("학번입력");
		String stuNo = scn.next();
		
		System.out.println("이름 입력");
		String stuName = scn.next();
		
		System.out.println("영어점수");
		int engScore = scn.nextInt();
		
		System.out.println("국어점수");
		int korScore = scn.nextInt();
		
		Student student = new Student(stuNo, stuName, engScore, korScore);
		student.showInfo();
	}

	}


