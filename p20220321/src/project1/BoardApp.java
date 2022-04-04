package project1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.edu.collect.Student;
import com.edu.collect.StudentService;
import com.edu.collect.StudentServiceFile;

public class BoardApp {
	// ↓필드

	Scanner scn = new Scanner(System.in);

	// 생성자
	public BoardApp() {// 기본 생성자

	}

	// 멤버클래스.
	class BoardMemberServiceImpl implements BoardMemberService {
		List<BoardMember> list = new ArrayList<BoardMember>();

		@Override
		public void insertBoardMember(BoardMember board2) {// 회원정보 입력
			list.add(board2);

		}

		@Override
		public List<BoardMember> board2List() {// 리스트 출력
			return list;
		}

		@Override
		public void removeBoardMember(String name2) {// 삭제
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getId() == name2) {
					list.remove(list.get(i).getId());
				}
			}
		}

		@Override
		public void modifyBoardMember(BoardMember board2) {// 수정
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getId() == board2.getId()) {
					list.get(i).setEmail(board2.getEmail());
					list.get(i).setName(board2.getName());
					list.get(i).setTel(board2.getTel());
				}
			}
		}

		@Override
		public List<BoardMember> searchBoard(String name2) {// 한건찾기
			List<BoardMember> searchBoard = new ArrayList<BoardMember>();
			for (int i = 0; i < list.size(); i++) {

				if (list.get(i).getId().equals(name2)) {
					searchBoard.add(list.get(i));

				}
			}
			return searchBoard;

		}// 끝

		// 메인 기능을 담당하는 execute()
	public void execute() {
		     BoardServiceOracle service = null;
//							   service = new StudentServiceImpl();// 메인 기능을 하는 메소드.
//				               service = new StudentServiceFile();// <-로 바꾸겠습니다.
							   service = new BoardServiceOracle();
		// service = new StudentServuceOracle();//<-로 바꾸겠습니다.
		// 추가 2.리스트 3.학생 번호로 조회 4.이름으로 조회 5.수정 6.삭제 9. 종료
		while (true) {
			System.out.println("1.추가 2.리스트 3.학생 번호로 조회 4.이름으로 조회 5.수정 6.삭제 9. 종료");
			System.out.println("선택>>");

			int menu = scn.nextInt();

			if (menu == 1) {
				// 학생정보 추가입력. :학생번호, 이름, 영어, 국어점수.

				 System.out.println("사용할 Id 를 입력하세요.");
				 String id;
				 System.out.println("비밀번호를 입력하세요.");
				 String pw;
				 System.out.println("사용할 닉네임을 입력하세요.");
				 String name;
				 System.out.println("성별을 입력하세요.");
				 String gender;
				 System.out.println("생년월일을 입력하세요.");
				 String birth;
				 System.out.println("이메일을 입력하세요.");
				 String email;
				 System.out.println("전화번호를 입력하세요.");
				 String tel;
				 
				BoardMember s1 = new BoardMember(id, pw, name, gender, birth, email, tel);
				service.insertBoard(s1);

			} else if (menu == 2) {
				List<BoardMember> list = service.board2List();
				for (BoardMember s : list) {
					System.out.println("===============================================");
					System.out.println(s.toString());
					System.out.println("===============================================");
				}

			} else if (menu == 3) {// 1건 조회
				System.out.println("조회할 학생번호 입력");
				int studNo = scn.nextInt();
				BoardMember board2 = service.(studNo);

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
}