package middle.web;

import java.awt.print.Printable;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import middle.service.Markservice;
import middle.vo.UserOrderVO;
import middle.vo.UserVO1;

public class BuyControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Markservice service = new Markservice();
		HttpSession session = request.getSession(true);
		String Uid = (String) session.getAttribute("Uid");
		String paypcode = request.getParameter("paypcode");
		String payname = request.getParameter("paypname");
		int paycount = Integer.parseInt(request.getParameter("paycount"));
		int allpay = Integer.parseInt(request.getParameter("allpay"));
		
		UserVO1 vo = service.ussear(Uid);
		String address = vo.getUaddress();
		String name = vo.getUname();
		String tel = vo.getUtel();
		
		
		UserOrderVO voo = new UserOrderVO();
		voo.setUid(Uid);
		voo.setProductCode(Integer.parseInt(paypcode)); //상품번호
		voo.setProductPrice(allpay); // 총결제금액
		voo.setProductName(payname); // 싱픔이름
		voo.setAmount(paycount); // 상품수량
		voo.setUorderName(name); // 주문자이름
		voo.setUorderAddress(address); // 주소
		voo.setUorderTel(tel); //전화번호
		request.setAttribute("voo", voo);
		request.getRequestDispatcher("result/pay.jsp").forward(request, response);
		 
	}

}
