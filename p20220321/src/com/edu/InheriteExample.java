package com.edu;

public class InheriteExample {
	//학생, 직장인, 친구 => 정보를 담아놓는 정보.
	//학생의 경우에는 학교, 학년,
	//직장은 직정명, 직급
	//출신지역
	public static void main(String[] args) {
		Students student = new Students();
		
		student.setName("홍길동");
		student.setAge(15);
		student.setSchool("중앙고");
		student.setGrade(2);
		student.setHeight(0);
		student.setWeight(0);
		
		Worker worker = new Worker();
		worker.setName("직장인");
		worker.setAge(35);
		worker.setCompany("카카오");
		worker.setJob("개발팀장");

		//부모 클래스의 참조 변수에 자식 클래스의 참조변수 자동 형변환(promotion)
		Person p1 = new Person();
		p1 = (Person) student;
		p1 = worker;
		
	//	student = worker; 자식-자식간 관계는 병렬불가.
		

}
}