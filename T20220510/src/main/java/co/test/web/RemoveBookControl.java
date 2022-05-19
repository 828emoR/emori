package co.test.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.test.service.BookService;
import co.test.vo.BookVO;

public class RemoveBookControl implements Controller {

	   @Override
	   public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   String book_Code = request.getParameter("book_Code");
		      
		      BookVO vo = new BookVO();
		      vo.setBookCode(book_Code);
		      
		      BookService service = new BookService();
		      service.removeBook(book_Code);
		      
		      request.setAttribute("remove", book_Code);
		      
		      request.getRequestDispatcher("result/removeOutput.jsp").forward(request, response);
	   }
}