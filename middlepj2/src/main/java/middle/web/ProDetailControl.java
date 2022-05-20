package middle.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import middle.service.ProductService;
import middle.vo.ProductVO;

public class ProDetailControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 한 건 상세보기
		
		String pcode = request.getParameter("productCode");
		
		// 상품
		ProductService service = new ProductService();
		ProductVO vo = service.DetailProduct(pcode);
		
		if (vo == null) {
			request.setAttribute("result", "상품을 찾을 수 없습니다.");
		}
		request.setAttribute("product", vo);
		
		
		request.getRequestDispatcher("result/ProDetailOut.jsp").forward(request, response);
		
		
		// 해당 상품 리뷰
		
	}

}
