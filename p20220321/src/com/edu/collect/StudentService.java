
package com.edu.collect;

import java.util.List;

public interface StudentService {
	public void insertStudent(Student student);//입력
	public Student getStudent(int sno);//한건 조회
	public List<Student> studentList();//전체목록
	public void modifyStudent(Student student);//한건등록


}
