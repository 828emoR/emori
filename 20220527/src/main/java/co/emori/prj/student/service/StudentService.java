package co.emori.prj.student.service;

import java.util.List;

import co.emori.prj.student.vo.StudentVO;

public interface StudentService {
	List<StudentVO> studentSelectList();
	StudentVO studentSelect(StudentVO vo); // 한명 데이터 조회 or login
	int studentInsert(StudentVO vo);
	int studentUpdate(StudentVO vo);
	int studentDelete(StudentVO vo);
	
	boolean studentIdCheck(String id); // id 중복체크
}
