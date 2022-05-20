package middle.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import JB.AdminService;
import middle.vo.ProductVO;

public class AdminProModControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String productCode = request.getParameter("productCode");
		String productCate = request.getParameter("productCate");
		String productName = request.getParameter("productName");
		String productPrice = request.getParameter("productPrice");
		String productAmount = request.getParameter("productAmount");
		String productExp = request.getParameter("productExp");
		
		
		
		if(productCode.isEmpty() || productCate.isEmpty() || productName.isEmpty() 
				|| productPrice.isEmpty() || productAmount.isEmpty() || productExp.isEmpty() ) {
			request.setAttribute("error", "모든 항목을 입력하세요!");
			request.getRequestDispatcher("result/adminProModifyOutput.jsp").forward(request, response);
			return;
		}
		System.out.println("비어잇는거통과");
		ProductVO vo = new ProductVO();
		vo.setProductCode(Integer.parseInt(productCode));
		vo.setProductCate(productCate);
		vo.setProductName(productName);
		vo.setProductPrice(Integer.parseInt(productPrice));
		vo.setProductAmount(Integer.parseInt(productAmount));
		vo.setProductExp(productExp);
		
		
		AdminService service = new AdminService();
		service.adminProMod(vo);
		
		request.setAttribute("productCode", productCode);
		request.getRequestDispatcher("result/adminProModifyOutput.jsp").forward(request, response);
		
		
	}

}
