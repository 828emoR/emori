package middle.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import JB.AdminService;
import middle.vo.UserVO1;

public class AdminUserListControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 AdminService service = new AdminService();
		 List<UserVO1> list = service.Userlist();
		 
		 request.setAttribute("list", list);
		 
		 request.getRequestDispatcher("/result/adminListOutput.jsp").forward(request, response);

	}

}
