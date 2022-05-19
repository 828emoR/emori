package middle.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import middle.service.Markservice;
import middle.vo.UserVO1;
import middle.web.Control;

public class UserModifyControl implements Control {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Uid = request.getParameter("Uid");
		String Upw = request.getParameter("Upw");
		String Uname = request.getParameter("Uname");
		String Utel = request.getParameter("Utel");
		String Uemail = request.getParameter("Uemail");
		String Uadress = request.getParameter("Uadress");
		
		UserVO1 vo1 = new UserVO1();
		Markservice service = new Markservice();
		service.Userupdate(vo1);
		
		request.getRequestDispatcher("result/modifyOutPut.jsp").forward(request, response);
		
		
		
	}

}
