package newTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




//학생정보등록 기능 작성
//학생 정보 수정기능 작성.
//학생 리스트를 출력하는 기능 작성
public class StudentApp {

	Scanner scn = new Scanner(System.in);
	List<Student> studentList = new ArrayList<Student>(); // 컬렉션을 이용해서 정보를 저장.

	class StudentServiceImpl implements StudentService {

		@Override
		public void addStudent(Student student) {
			studentList.add(student);

		}
  
		@Override
		public void modStudent(Student student) {

			for (int i = 0; i < studentList.size(); i++) {
				if (studentList.get(i).getStudNo() == student.getStudNo()) {
					studentList.get(i).setStudName(student.getStudName());
				}
			}

		}

		@Override
		public List<Student> studentList() {
			return studentList;
		}


	}

	public void execute() {


		StudentService service = new StudentServiceImpl();

		// 1.입력, 2.수정, 3.리스트 보기 기능을 구성하세요.
		while (true) {
			System.out.println("1.입력, 2.수정, 3.리스트 보기, 4.종료");
			System.out.println("선택>> ");
			int menu = scn.nextInt();

			if (menu == 1) {
				// 입력일 경우 고등학생정보와 대학생정보를 구분해서 처리.
				System.out.println("1.고딩 입력 2.학식입력");
				menu = scn.nextInt();
				
				if (menu == 1) {
					System.out.println("고딩입력창");

					System.out.println("\r\n급식충 번호 입력");
					int studNo = scn.nextInt();
					System.out.println("이름을 입력하세요");
					String stuName = scn.next();
					System.out.println("담탱의 이름을 입력하세요");
					String teacherName = scn.next();
					System.out.println("해당 급식의 학년을 입력하세요");
					String groupName = scn.next();

					HighStudent s1 = new HighStudent(studNo, stuName, teacherName, groupName);
				
					service.addStudent(s1);
			

					System.out.println("입력완료");

				} else if (menu == 2) {
					System.out.println("학식입력창");

					System.out.println("\r\n학식충 학번 입력");
					int studNo = scn.nextInt();
					System.out.println("이름을 입력하세요");
					String stuName = scn.next();
					System.out.println("담당 교수의 이름 을 입력하세요");
					String ProfName = scn.next();
					System.out.println("전공 과묵을 입력하세요");
					String Major = scn.next();

					CollegeStudent c1 = new CollegeStudent(studNo, stuName,ProfName, Major);


					service.addStudent(c1);


					System.out.println("입력완료");

				}
			} else if (menu == 2) {
				System.out.println("1.급식수정 2.학식수정");

				if (menu == 1) {
					System.out.println("급식충 정보 수정입니다.");

					System.out.println("수정할 급식의 담임을 입력하세요 ");
					int studNo = scn.nextInt();
					System.out.println("수정할 학년을 입력하세요 ");
					String stuName = scn.next();
					
					
					Student student = new Student(studNo, stuName);
					service.modStudent(student);

					System.out.println("수정완료");

				} else if (menu == 2) {
					System.out.println("수정할 학식의 담당일진을 입력하세요 ");
					int studNo = scn.nextInt();
					System.out.println("수정할 전공과목을 입력하세요 ");
					String stuName = scn.next();
					
					
					Student student = new Student(studNo, stuName);
					service.modStudent(student);

					System.out.println("입력완료");

				}

			} else if (menu == 3) {
				System.out.println("리스트 보기");

				List<Student> student = service.studentList();
				for (Student s : student) {
					System.out.println(s.toString());
				}

			} else if (menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}
		System.out.println("end of program.");
	}
}
