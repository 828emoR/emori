package middle.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import middle.service.qnaService;

public class qnaDeleteControl implements Control{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int qnaNo = Integer.parseInt(request.getParameter("qnaNo"));
		
		qnaService qnadeleteservice = new qnaService();
		qnadeleteservice.deleteQna(qnaNo);
		request.setAttribute("delete", "삭제되었습니다");
		request.getSession().setAttribute("delete", "삭제되었습니다");
		response.sendRedirect("qna.do");
		
	}

}
