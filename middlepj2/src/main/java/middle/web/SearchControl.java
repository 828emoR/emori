package middle.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import middle.service.Markservice;
import middle.vo.UserVO1;


public class SearchControl implements Control {

   @Override
   public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      String path = null;

      String Uid = request.getParameter("Uid");
      String job = request.getParameter("job");
      Markservice service = new Markservice();
      UserVO1 vo = service.ussear(Uid);
      System.out.println(vo.toString());
      
      if(job.equals("modify")) {
         request.setAttribute("Uid", Uid);
         path = "result/modify.jsp";
      }else if(job.equals("delete")) {
         request.setAttribute("Uid", Uid);
         path = "result/delete.jsp";
      }
      request.setAttribute("vo", vo);

      request.getRequestDispatcher(path).forward(request, response);

   }

}