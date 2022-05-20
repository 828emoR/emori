package middle.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import JB.AdminService;
import middle.vo.ProductVO;

public class AdminProSearchControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String productcode = null;
		
		productcode = request.getParameter("productCode");
		String job = request.getParameter("job");
		
		String path = "";
		
		if (job.equals("search")) {
			path = "/view/adminProductSearch.jsp";
		} else if (job.equals("modify")) {
			path = "/view/adminProductInfoMod.jsp";
		} else if (job.equals("remove")) {
			path = "/view/adminProductDel.jsp";
		}
		
		
		if(productcode.isBlank()) {
			request.setAttribute("error", "상품코드를 입력하세요.");
			request.getRequestDispatcher(path).forward(request, response);
			return;
		}

		AdminService service = new AdminService();
		ProductVO vo = service.adminProSearch(productcode);
		
		if(vo == null) {
			request.setAttribute("result", "조회된 정보 없음");
		}
		if (job.equals("search")) {
			request.setAttribute("result", vo);
			path = "result/adminProSearchOutput.jsp"; 
			
		}
		request.setAttribute("vo", vo);
		
		
		

		request.getRequestDispatcher(path).forward(request, response);
		
		
	}

}
