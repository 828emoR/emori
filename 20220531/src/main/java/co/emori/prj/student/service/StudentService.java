package co.emori.prj.student.service;

import java.util.List;

import co.emori.prj.student.vo.StudentVO;

public interface StudentService { //dao 사용 인터페이스
	List<StudentVO> studentSelectList();  //전체 회원
	StudentVO studentSelect(StudentVO vo); // 한명조회or로그인 처리
	int studentInsert(StudentVO vo); // 회원추가
	int studentUpdate(StudentVO vo); // 정보수정
	int studentDelete(StudentVO vo); // 회원삭제

	boolean idCheck(String id); // 아이디 중복체크
}
