package co.test.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.test.service.BookService;
import co.test.vo.BookVO;

public class AddBookControl implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String book_Title = request.getParameter("book_Title");
		String book_Author = request.getParameter("book_Author");
		String book_Press = request.getParameter("book_Press");
		int book_Price = Integer.parseInt(request.getParameter("book_Price"));
		
		
		BookVO vo = new BookVO();
		vo.setBookTitle(book_Title);
		vo.setBookAuthor(book_Author);
		vo.setBookPress(book_Press);
		vo.setBookPrice(book_Price);
		
		
		BookService service = new BookService();
		service.addBook(vo);
		
		//db 입력처리 시작
		//addBook.do -> addoutput.jsp 로 공유하겠습니다.,
		
		request.setAttribute("bookCode", vo);
		request.getRequestDispatcher("result/addOutput.jsp").forward(request, response);//입력된 결과값을 addOutput으로 넘겨준다

	}

}
