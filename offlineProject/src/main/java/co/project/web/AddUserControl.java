package co.project.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.project.service.UserService;
import co.project.vo.UserInfoVO;

public class AddUserControl implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		
		UserInfoVO vo = new UserInfoVO();
		vo.setId(id);
		vo.setPw(pw);
		vo.setName(name);
		vo.setTel(tel);
		vo.setEmail(email);
		vo.setAddress(address);

		UserService service = new UserService();
		service.addUser(vo);
		
		request.setAttribute("id", id);
		request.setAttribute("name", name);
		
		request.getRequestDispatcher("result/addOutput.jsp").forward(request, response);

	}

}
