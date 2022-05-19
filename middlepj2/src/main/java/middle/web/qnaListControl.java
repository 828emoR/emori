package middle.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import middle.service.qnaService;
import middle.vo.qnaVO;

public class qnaListControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.print("aa");
		qnaService service = new qnaService();
		List<qnaVO> list = service.qnaList();
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("view/qna.jsp").forward(request, response);
	}
	
}
