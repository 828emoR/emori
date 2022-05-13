package co.project.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.project.service.UserService;
import co.project.vo.UserInfoVO;

public class SearchUserControl implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

		String path = "result/searchOutput.jsp";
		String UserSel = request.getParameter("id");
		String job = request.getParameter("job");
		
	
		
		
		 
		System.out.println("므요1");
		// 조회 Id가 없을 경우 결과를 보여주는 페이지 지정.
		if (job.equals("search")) {
			path = "view/search.jsp";
		} else if (job.equals("modify")) {
			path = "view/modify.jsp";
		} else if (job.equals("remove")) {
			path = "view/remove.jsp";
		}

		if (UserSel.isBlank()) {
			request.setAttribute("error", "Id를 입력하세요.");
			request.getRequestDispatcher(path).forward(request, response);
			return;
		}


	UserService service = new UserService();
		UserInfoVO vo = service.findUser(UserSel);
		
		// 정상적인 처리가 진행될 경우 페이지 지정.
		System.out.println("므요2");
		request.setAttribute("", vo);
		
		if (job.equals("search")) {
			request.setAttribute("result", vo);
			path = "result/searchOutput.jsp";
		}
		System.out.println("므요3");
		request.getRequestDispatcher(path).forward(request, response);

	}

}
