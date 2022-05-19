package co.test.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.test.service.BookService;
import co.test.vo.BookVO;

public class ModifyBookControl implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String book_Code = request.getParameter("book_Code");
		String book_Title = request.getParameter("book_Title");
		String book_Author = request.getParameter("book_Author");
		String book_Press = request.getParameter("book_Press");
		String book_Price = request.getParameter("book_Price");
		

		BookVO vo = new BookVO();
		vo.setBookCode(book_Code);
		vo.setBookTitle(book_Title);
		vo.setBookAuthor(book_Author);
		vo.setBookPress(book_Press);
		vo.setBookPrice(Integer.parseInt(book_Price));
		
		
		BookService service = new BookService();
		service.modifyBook(vo);
		
		request.setAttribute("modify", vo);
		request.getRequestDispatcher("result/modifyOutput.jsp").forward(request, response);
		
		
	}

}
