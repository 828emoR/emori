package middle.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import middle.service.ProductService;
import middle.vo.ProductVO;

public class NewListControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 최신상품목록 (4*3)
		
		ProductService service = new ProductService();
		List<ProductVO> list = service.newList();
		
		request.setAttribute("list", list);
		
		
		request.getRequestDispatcher("main.jsp").forward(request, response);
	}

}
