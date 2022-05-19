package middle.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import middle.service.Markservice;
import middle.vo.UserVO1;

public class AdminUserSearchControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid = null;
		System.out.println("dddd");
		uid = request.getParameter("id");
		

		String path = "/result/adminSearchOutput.jsp"; // /result/adminSearchOutput.jsp
		
		
		
		if (uid.isBlank()) {
			request.setAttribute("error", "아이디를 입력하세요.");
			request.getRequestDispatcher(path).forward(request, response);
			return;
		}
		
		Markservice service = new Markservice();
		UserVO1 vo = service.ussear(uid);
		
		if(vo == null) {
			request.setAttribute("result", "조회된 정보 없음");
		}
		
		request.setAttribute("vo", vo);
		
		
		

		request.getRequestDispatcher(path).forward(request, response);
	}

}
