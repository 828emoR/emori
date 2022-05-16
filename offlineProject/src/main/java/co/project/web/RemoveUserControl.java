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

	      if(UserSel.isBlank()) {
	         request.setAttribute("error", "올바른 정보를 입력해주세요");
	         request.getRequestDispatcher("view/remove.jsp").forward(request, response);
	         return;
	      }
	      
	      UserService service = new UserService();
	      service.removeUser(UserSel);
	      
	      request.setAttribute("UserSel", UserSel);
	      
	      request.getRequestDispatcher("result/removeOutput.jsp").forward(request, response);
	   }
}