package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dev.service.MemberService;
import co.dev.vo.MemberVO;

public class MemberUpdateControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("수정처리");
		
		
		String id = "";
		String name = "";
		String passwd = "";
		String email = "";
		
		if(id.isEmpty() || name.isBlank() || passwd.isBlank() || email.isBlank()) {
			request.setAttribute("error", "모든 항목을 입력하세요");
			request.getRequestDispatcher("memberView/memberUpdate.jsp").forward(request, response);
			return;
		}
		
		MemberVO member = new MemberVO();
		member.setId(id);
		member.setName(name);
		member.setPasswd(passwd);
		member.setEmail(email);
		
		
		MemberService service = new MemberService();
		service.memberUpdate(null);
		
		request.setAttribute("id", id);
		
		request.getRequestDispatcher("memberResult/memberUpdateOutput.jsp").forward(request, response);
		

	}

}
