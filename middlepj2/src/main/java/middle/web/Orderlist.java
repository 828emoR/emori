package middle.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import middle.service.Markservice;
import middle.vo.UserOrderVO;
import middle.web.Control;

public class Orderlist implements Control {

   @Override
   public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
      HttpSession session=request.getSession(true);
      String Uid = (String) session.getAttribute("Uid");
      Markservice service = new Markservice();
      List<UserOrderVO> list = service.listOrder(Uid);
      System.out.println(list.toString());
      request.setAttribute("list", list);
      request.getRequestDispatcher("/view/mypage.jsp").forward(request, response);
      
      
   }

}