package co.project.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.project.service.UserService;
import co.project.vo.UserInfoVO;

public class RemoveUserControl implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String UserSel = request.getParameter("UserSel");

		UserInfoVO delUser = new UserInfoVO();
		
		delUser.setId(UserSel);
		
		UserService service = new UserService();
		service.removeUser(UserSel);
		
		request.setAttribute("UserSel", delUser);

		request.getRequestDispatcher("result/removeOutput.jsp").forward(request, response);
	}

}
