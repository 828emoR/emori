package middle.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import middle.service.qnaService;
import middle.vo.qnaVO;

public class qnaUpdateControl implements Control{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int qnaNo = Integer.parseInt(request.getParameter("qnaNo"));
		String qnaCategory = request.getParameter("qnaCategory");
		String qnaTitle = request.getParameter("qnaTitle");
		String qnaContent = request.getParameter("qnaContent");
		
		qnaVO upVO = new qnaVO();
		upVO.setQnaNo(qnaNo);
		upVO.setQnaCategory(qnaCategory);
		upVO.setQnaTitle(qnaTitle);
		upVO.setQnaContent(qnaContent);
		
		qnaService updateservice = new qnaService();
		updateservice.updateQna(upVO);
		
		request.getRequestDispatcher("view/qnaUpdate.jsp").forward(request, response);
	}

}
