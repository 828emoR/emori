package com.dev;

import java.util.Scanner;

import com.edu.Student;

public class ObjectExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		Student s1 = new Student(100, "이모리");// studNo = 100
		System.out.println(s1.getStudNo());
		System.out.println(s1.getStudName());
		s1.setKorScore(100);
		s1.setEngScore(60);
		s1.setMathScore(80);

		Student s2 = new Student("메모리", 101, 80, 82, 85); // 생성자를 통해 필드의 값을 제어할 수 있음.
		System.out.printf(s2.getStudName() + "의 평균: %.2f", s2.getAvgScore());

		Student s3 = new Student("해물비빔소스", 102, 80, 100, 92);
		Student s4 = new Student("톤톤목", 103, 100, 100, 0);

		Student[] students = { s1, s2, s3, s4 };
/////////////////////////////////////////////////////////////////
		while (true) {

			System.out.println("\n조회하려는 학생의 이름을 입력해주세요.");
			String searchName = scn.next();
			if(searchName.equals("종료")) {
				break;
			}

			for (int i = 0; i < students.length; i++) {
				if (students[i].getStudName().equals(searchName)) {
					System.out.println(students[i].getStudInfo());
				}

			}

		}
		System.out.println("종료합니다");
////////////////////////////////////////////////////////////////
	}

}
