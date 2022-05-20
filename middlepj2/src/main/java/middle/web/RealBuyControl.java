package middle.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import middle.service.Markservice;
import middle.vo.UserOrderVO;
import middle.vo.UserVO1;

public class RealBuyControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Markservice service = new Markservice();
		HttpSession session = request.getSession(true);
		String Uid = (String) session.getAttribute("Uid");
		String paypcode = request.getParameter("paycode");
		String productname = request.getParameter("productname");
		int amount = Integer.parseInt(request.getParameter("amount"));
		int productprice = Integer.parseInt(request.getParameter("productprice"));
		String address = request.getParameter("address");
		String ordername = request.getParameter("uordername");
		String utel = request.getParameter("uordertel");
		
		
		
		UserOrderVO voo = new UserOrderVO();
		voo.setUid(Uid);
		voo.setProductCode(Integer.parseInt(paypcode));
		voo.setProductPrice(productprice);
		voo.setProductName(productname);
		voo.setAmount(amount);
		voo.setUorderName(ordername);
		voo.setUorderAddress(address);
		voo.setUorderTel(utel);
		
		service.Userbuy(voo);		
		
		request.getRequestDispatcher("result/buyoutput.jsp").forward(request, response);
	}

}
