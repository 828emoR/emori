package co.project.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.project.service.UserService;
import co.project.vo.UserInfoVO;

public class ModifyUserControl implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String id = "";
		String pw = "";
		String name = "";
		String tel = "";
		String email = "";
		String address = "";
		
		if(id.isEmpty() || pw.isBlank() || name.isBlank() || tel.isBlank() || email.isBlank() || address.isBlank()) {
			request.setAttribute("error", "모든 항목을 입력하세요");
			request.getRequestDispatcher("view/modify.jsp").forward(request, response);
			return;
		}
		
		UserInfoVO vo = new UserInfoVO();
		vo.setId(id);
		vo.setPw(pw);
		vo.setName(name);
		vo.setTel(tel);
		vo.setEmail(email);
		vo.setAddress(address);
		
		
		UserService service = new UserService();
		service.modifyUser(null);
		
		request.setAttribute("id", id);
		
		request.getRequestDispatcher("result/modifyOutput.jsp").forward(request, response);
		

	}


}
