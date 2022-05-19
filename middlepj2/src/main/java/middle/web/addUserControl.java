package middle.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import middle.service.Markservice;
import middle.vo.UserVO1;

public class addUserControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Markservice service = new Markservice();
		String Uid = request.getParameter("Uid");
		String Upw = request.getParameter("Upw");
		String Uname = request.getParameter("Uname");
		String Utel = request.getParameter("Utel");
		String Uemail = request.getParameter("Uemail");
		String Uaddress = request.getParameter("Uaddress");
		
		UserVO1 vo = new UserVO1();
		vo.setUid(Uid);
		vo.setUpw(Upw);
		vo.setUname(Uname);
		vo.setUtel(Utel);
		vo.setUemail(Uemail);
		vo.setUadress(Uaddress);
		
		

		
		service.addUser(vo);
		System.out.println(vo.toString());
		request.setAttribute("Uid", Uid);
		
		request.getRequestDispatcher("result/addoutput.jsp").forward(request, response);
	}

}
