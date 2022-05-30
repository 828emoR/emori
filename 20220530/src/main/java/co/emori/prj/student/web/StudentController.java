package co.emori.prj.student.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import co.emori.prj.student.service.StudentService;
import co.emori.prj.student.vo.StudentVO;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentDao;
	
	@RequestMapping("/studentList.do")// 전체회원 목록 보기
	public String studentList(Model model) {
		model.addAttribute("students", studentDao.studentSelectList());
		return"student/studentList";
	}
	@RequestMapping("/studentJoinForm.do")
	public String studentJoinForm() {
		return "student/studentJoinForm";
	}
	@PostMapping("/studentJoin.do")
	public String studentJoin(StudentVO vo, Model model) {
		int n = studentDao.studentInsert(vo);
		if(n != 0) {
			model.addAttribute("message", "교수님 쉬는시간 한참 지났어요");
		}else {
			model.addAttribute("message", "회원가입에 실패하였습니다.");
		}
		return "student/studentJoin";
		
	}
	
	@GetMapping("/ajaxIdCheck.do")
	@ResponseBody
	public String ajaxIdCheck(String id) {
		boolean b = studentDao.idCheck(id);
		String data = "N"; //사용 가능한 아이디
		if(!b) {
			data = "Y";
			
		}
		return data;
	}
	
}
