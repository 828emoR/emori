package com.edu.collect;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StudentApp {
	// ↓필드
	List<Student> list = new ArrayList<Student>();
	Scanner scn = new Scanner(System.in);

	// 생성자
	public StudentApp() {// 기본 생성자

	}

	// 멤버클래스.
	class StudentServiceImpl implements StudentService {

		
		//기본 생성자 파일에 저장되어있는 것을 읽어서
		
		
		@Override
		public Student getStudent(int sno) { // 학생번호로 한건 조회함.
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
		public void insertStudent(Student student) {
			list.add(student); // list 컬렉션에 student 추가

		}

		@Override
		public void removeStudent(int sno) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStuNo() == sno) {
					list.remove(list.get(i).getStuNo());
				}
			}
		}

		@Override
		public void modifyStudent(Student student) {// 수정
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStuNo() == student.getStuNo()) {
					list.get(i).setEngScore(student.getEngScore());// 영어점수 수정
					list.get(i).setKoScore(student.getKoScore()); // 국어점수 수정
				}
			}
		}

		@Override
		public List<Student> searchStudent(String name) {
			List<Student> searchStudent = new ArrayList<Student>();
			for (int i = 0; i < list.size(); i++) {

				if (list.get(i).getStuName().equals(name)) {
					searchStudent.add(list.get(i));

				}
			}
			return searchStudent;

		}// 끝

		@Override
		public void saveToFile() {
			try {
				FileWriter fw = new FileWriter("Studentlist.data");
				BufferedWriter bw = new BufferedWriter(fw);
				for (Student stud : list) {
					bw.write(stud.getStuNo() + "," + stud.getStuName() + "," + stud.getEngScore() + ","
							+ stud.getKoScore());
				}
				bw.close();
				fw.close();

			} catch (IOException e) {

				e.printStackTrace();
			}
		}


		}
	// 메인 기능을 담당하는 execute()
			public void execute() {
				StudentService service = null; 
//							   service = new StudentServiceImpl();// 메인 기능을 하는 메소드.
//				               service = new StudentServiceFile();// <-로 바꾸겠습니다.
				               service = new StudentServiceOracle();
				// service = new StudentServuceOracle();//<-로 바꾸겠습니다.
				// 추가 2.리스트 3.학생 번호로 조회 4.이름으로 조회 5.수정 6.삭제 9. 종료
				while (true) {
					System.out.println("1.추가 2.리스트 3.학생 번호로 조회 4.이름으로 조회 5.수정 6.삭제 9. 종료");
					System.out.println("선택>>");

					int menu = scn.nextInt();

					if (menu == 1) {
						// 학생정보 추가입력. :학생번호, 이름, 영어, 국어점수.

						System.out.println("학생번호를 입력하세요.");
						int stuNo = scn.nextInt();

						System.out.println("학생이름 입력하세오");
						String name = scn.next();

						System.out.println("영어점수 입력");
						int engScore = scn.nextInt();

						System.out.println("국어점수 입력");
						int korScore = scn.nextInt();

						Student s1 = new Student(stuNo, name, engScore, korScore);
						service.insertStudent(s1);

					} else if (menu == 2) {
						List<Student> list = service.studentList();
						for (Student s : list) {
							System.out.println("===============================================");
							System.out.println(s.toString());
							System.out.println("===============================================");
						}

					} else if (menu == 3) {// 1건 조회
						System.out.println("조회할 학생번호 입력");
						int studNo = scn.nextInt();
						Student student = service.getStudent(studNo);

						if (student == null) {
							System.out.println("정보없음");
						} else {
							System.out.println(student.toString());
						}

					} else if (menu == 4) {
						System.out.println("조회할 학생이름 입력");
						String studName = scn.next();
						List<Student> searchStudent = service.searchStudent(studName);

						if (studName == null) {
							System.out.println("정보없음");
						} else {
							System.out.println(searchStudent);
						}

					} else if (menu == 5) {// 수정정보 입력

						System.out.println("수정 할 학생번호를 입력하세요.");
						int stuNo = scn.nextInt();

						System.out.println("영어점수 입력");
						int engScore = scn.nextInt();

						System.out.println("국어점수 입력");
						int korScore = scn.nextInt();

						Student s1 = new Student(stuNo, null, engScore, korScore);
						service.modifyStudent(s1);
						System.out.println("처리가 완료되었습니다.");

					} else if (menu == 6) {

						System.out.println("삭제할 학생번호를 입력하세요");
						int studNo = scn.nextInt();

						service.removeStudent(studNo);
						System.out.println("처리가 완료되었습니다.");

					} else if (menu == 9) {
						System.out.println("시스템을 종료합니다.");
						service.saveToFile();
						break;
					}

				} // while 끝
				System.out.println("EOP");
	}
			
}
