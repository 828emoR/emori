package co.project.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.project.service.UserService;
import co.project.vo.UserInfoVO;

public class ListUserControl implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

		UserService service = new UserService();
		List<UserInfoVO> list = service.UserList();

		request.setAttribute("all", list);
		
		request.getRequestDispatcher("result/listOutput.jsp").forward(request, response);

	}

}
