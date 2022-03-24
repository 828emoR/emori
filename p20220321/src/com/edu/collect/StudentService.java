
package com.edu.collect;

import java.util.List;

//인터페이스는 실제로 클래스를 만드는게 아님. 기능에 대한 추상메소드. 
//임의의 소스를 지정, 정의해주는 공간.
//ㅅㅂ 그러면 왜 인터페이스라고 이름지은거임

public interface StudentService {
	public void insertStudent(Student student);//입력
	public Student getStudent(int sno);//한건 조회
	public List<Student> studentList();//전체목록
	public void modifyStudent(Student student);//한건등록
	public void removeStudent(int sno);
	public List<Student> searchStudent(String name);

}

