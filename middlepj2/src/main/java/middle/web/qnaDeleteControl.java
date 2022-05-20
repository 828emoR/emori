package middle.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import middle.service.qnaService;

public class qnaDeleteControl implements Control{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		qnaService qnadeleteservice = new qnaService();
		qnadeleteservice.deleteQna(id);
		
		request.getRequestDispatcher("view/qnaDelete.jsp").forward(request, response);
		
	}

}
