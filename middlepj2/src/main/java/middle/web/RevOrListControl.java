package middle.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import middle.service.ReviewService;
import middle.vo.UserOrderVO;

public class RevOrListControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 세션 아이디가 구매한 상품 찾을 수 있도록 컨트롤

		System.out.println("구매한상품조회");
		
		HttpSession session = request.getSession();
		String Uid = (String) session.getAttribute("Uid");
		
		ReviewService service = new ReviewService();
		List<UserOrderVO> list = service.orderSearch(Uid);
		
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("view/reviewAdd.jsp").forward(request, response);
		
		
		
	}

}
