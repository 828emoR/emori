package middle.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import JB.AdminService;
import middle.vo.ProductVO;

public class AdminProDelControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String productCode = request.getParameter("productCode");
		
		ProductVO vo = new ProductVO();
		vo.setProductCode(Integer.parseInt(productCode));
		
		AdminService service = new AdminService();
		service.adminProDel(productCode);
		
		request.setAttribute("remove", productCode);
		
		request.getRequestDispatcher("result/adminProRemoveOutput.jsp").forward(request, response);
	}

}
