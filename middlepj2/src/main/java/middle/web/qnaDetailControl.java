package middle.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import middle.service.qnaService;
import middle.vo.qnaVO;

public class qnaDetailControl implements Control{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String path = "view/qnaDetail.jsp";
	int qnaNo = Integer.parseInt(request.getParameter("qnaNo"));
	
	qnaService dservice = new qnaService();
	qnaVO detail = dservice.qnaDetail(qnaNo);
	
	request.setAttribute("qnadetail", detail);
	request.getRequestDispatcher(path).forward(request, response);
	
	}
}
