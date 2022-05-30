package co.emori.prj.student.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.emori.prj.student.service.StudentService;
import co.emori.prj.student.vo.StudentVO;

@Controller
public class StudentController {
	@Autowired
	StudentService studentDao; // DAO 객체를 자동주ㄱ입
	
	
	
 @RequestMapping("/studentList.do")
 public String studentList(Model model) {
	 //model = 결과를 page에 돌려주기위해 사용하는 객체
	 model.addAttribute("students",studentDao.studentSelectList());
	 //
	 //"students = 페이지에서 사용할 변수 명(객체 명)"
	 
	 return "student/studentList";
	 //"studentList"= 표현해줄 jsp. /WEB-INF/views/student/studentList.
 }
 @RequestMapping("/studentSelect.do")//한놈조회
 public String studentSelect(StudentVO vo, Model model) {
	 model.addAttribute("student", studentDao.studentSelect(vo));
	 return "student/studentSelect";
 }
}
