package middle.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import JB.AdminService;
import middle.vo.ProductVO;

public class AdminProListControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AdminService service = new AdminService();
		List<ProductVO> list = service.Prolist();
		
		request.setAttribute("list", list);
		 
		 request.getRequestDispatcher("/result/adminProListOutput.jsp").forward(request, response);

	}

}
