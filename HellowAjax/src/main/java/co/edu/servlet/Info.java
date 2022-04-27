package co.edu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/edu/emori.do")
public class Info extends HttpServlet{
	
	//Info 페이지 요청 ->Init() -> Service() -> Destroy()
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		out.print("<h3>서블릿페이지</h3>");
		out.print("<h3>ㅎㅇ</h3>");
		out.print("<a href=\"../index.html\">처음으로 돌아가기</a>");
		out.print("<a href=\"../edu/828emoR.do\">MyInfo 보러가기</a>");
		
		
	}
	
	
}	