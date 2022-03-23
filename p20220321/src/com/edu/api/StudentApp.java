package com.edu.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.edu.collect.Student;
import com.edu.collect.StudentService;

public class StudentApp {

	List<Student> list = new ArrayList<Student>();
	Scanner scn = new Scanner(System.in);

	// 멤버클래스.
	class StudentServiceImp1 implements StudentService {

		@Override
		public void insertStudent(Student student) {
			list.add(student); // 추가

		}

		@Override
		public Student getStudent(int sno) { // 학생번호로 한건 만 조회함.
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStuNo() == sno) {
					return list.get(i);
				}
			}
			return null;
		}

		@Override
		public List<Student> studentList() {
			return list;
		}

		@Override
		public void modifyStudent(Student student) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStuNo() == student.getStuNo()) {
					list.get(i).setEngScore(student.getEngScore());// 영어점수 수정
					list.get(i).setKoScore(student.getKoScore()); // 국어점수 수정
				}

			}
		}

	}// 끝

	// 1추가. 2리스트.3 한건 조회.4 수정. 9종료
	public void execute() {

		while (true) {
			System.out.println("1. 추가 2. 리스트 3. 한건조회 4. 수정 9 종료");
			System.out.println("선택>>");

			int menu = scn.nextInt();

			if (menu == 1) {

			} else if (menu == 2) {

			} else if (menu == 3) {

			} else if (menu == 4) {

			} else if (menu == 9) {
				System.out.println("시스템을 종료합니다.");
				break;
			}

		} // while 끝
		System.out.println("EOP");
	}

}