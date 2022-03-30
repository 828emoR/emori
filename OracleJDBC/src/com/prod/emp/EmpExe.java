package com.prod.emp;

import java.util.List;
import java.util.Scanner;

public class EmpExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		EmpDAO dao = new EmpDAO();

		// 메뉴: 1.사원리스트 2. 입력 3. 수정 4. 삭제 5. 한건조회 9. 종료

		List<Employee> list = dao.empList(); // 전체조회기능.
		while (true) {

			System.out.println("\n\r=======메뉴선택=======");
			System.out.println("메뉴: 1.사원리스트 2. 입력 3. 수정 4. 삭제 5. 한건조회 9. 종료");

			int menu = scn.nextInt();

			if (menu == 1) {// 리스트호출
				List<Employee> List = dao.empList();
				System.out.println("===============");
				System.out.println("=====노예목록=====");
				System.out.println("===============");
				for (Employee emp : list) {
					System.out.println(emp.toString());
				}

			} else if (menu == 2) {// 입력
				// 사원번호, lastname, email, hireDate, jobid
				System.out.println("===사원정보 입력 메뉴입니다=====\n\r");

				Employee emp = new Employee();

				System.out.println("사원번호 입력");
				emp.setEmployeeId(scn.nextInt());

				System.out.println("이름 입력");
				emp.setLastName(scn.next());

				System.out.println("이메일 입력");
				emp.setEmail(scn.next());

				System.out.println("입사일 입력 ex: 0000-00-00");
				emp.setHireDate(scn.next());

				System.out.println("직무 입력");
				emp.setJobId(scn.next());

				// emp = new Employee (lastName, email, hireDate, jobId);

				boolean tOrF = dao.insertEmp(emp);// boolean 타입으로 결과값을 받아와서
				if (tOrF) {
					System.out.println("정상");
				} else
					System.out.println("오류");

			} else if (menu == 3) {// 수정
				// 사원번호, 전화번호. firstname, salary

				System.out.println("==========수정메뉴입니다=========\n\r");

				Employee emp = new Employee();

				System.out.println("수정할 성씨 입력");
				emp.setFirstname(scn.next());

				System.out.println("수정할 전화번호 입력");
				emp.setPhoneNumber(scn.next());

				System.out.println("바뀐 연봉 입력");
				emp.setSalary(scn.nextInt());

				System.out.println("적용할 사원번호 입력");
				emp.setEmployeeId(scn.nextInt());

				boolean result = dao.updateEmp(emp);
				boolean tOrF = dao.updateEmp(emp);// boolean 타입으로 결과값을 받아와서
				if (tOrF) {
					System.out.println("정상");
				} else
					System.out.println("오류");

				System.out.println("수정완료");

			} else if (menu == 4) {// 삭제
				Employee emp = new Employee();
				System.out.println("삭제할 사원번호 선택");

				boolean result = dao.deleteEmp(scn.nextInt());
				boolean tOrF = dao.deleteEmp(scn.nextInt());
				
					if (tOrF) {
						System.out.println("정상");
					} else
						System.out.println("오류");

					System.out.println("수정완료");
			} else if (menu == 5) {// 한건 조회
				System.out.println("조회할 사원번호 입력");
				int eid = scn.nextInt();

				Employee emp = dao.searchEmp(eid);
				if (emp == null)
					System.out.println("조회결과 없음");
				else
					System.out.println(emp.toString());

			} else if (menu == 9) {// 종료
				System.out.println("종료합니다.");
				break;
			} else {

			}
		} // end of while
		System.out.println("EOP");
		scn.close();

	}// end of main

}
