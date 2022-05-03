package co.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestServlet")
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public RequestServlet() {
        super();

    }


	public void init(ServletConfig config) throws ServletException {
System.out.println("init() call.");
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service() call");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.print("<h3>홍길동<>/h3");
		out.print("<h3>네트워크 정보</h3>");
		out.print("Request Scheme : "+request.getScheme()+"<br>");
		out.print("server Name : "+request.getServerName()+"<br>");
		out.print("server Address : "+request.getServerName()+"<br>");
		out.print("client Address : "+request.getRemoteAddr()+"<br>");
		out.print("client port : "+request.getRemotePort()+"<br>");
		
		
		out.print("<h3>요청 프로토콜<>/h3");
		out.print("request URI: " + request.getRequestURI()+"<br>");
		out.print("request URL: " + request.getRequestURL()+"<br>");
		out.print("context Path: " + request.getRequestURI()+"<br>");
		out.print("request Protocol: " + request.getRequestURI()+"<br>");
		out.print("server Path: " + request.getRequestURI()+"<br>");
		
		out.print("queryString: "+request.getQueryString()+"<br>");
		out.print("queryString: "+request.getParameter("id")+"<br>");
		out.print("queryString: "+request.getParameter("passwd")+"<br>");
		out.print("queryString: "+request.getParameter("userName")+"<br>");
		out.close();
	}

}
