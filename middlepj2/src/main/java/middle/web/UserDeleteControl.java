package middle.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import middle.service.Markservice;
import middle.web.Control;

public class UserDeleteControl implements Control {

   @Override
   public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      HttpSession session = request.getSession(true); 
      String Uid = (String) session.getAttribute("Uid");
      
      System.out.println(Uid);
      Markservice service = new Markservice();
      service.Userdelete(Uid);
      session.invalidate();
      request.getRequestDispatcher("/index.jsp").forward(request, response);
   }

}