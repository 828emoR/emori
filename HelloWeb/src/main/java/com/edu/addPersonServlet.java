package com.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addPersonServlet
 */
@WebServlet("/addPersonServlet")
public class addPersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addPersonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		doGet(request, response);
		String id = request.getParameter("uid");//섹쑤!
		String name = request.getParameter("uname");
		String score = request.getParameter("uscore");
		String age = request.getParameter("uage");
		
		System.out.println("아이디: "+ id);
		System.out.println("이름: "+ name);
		System.out.println("점수: "+ score);
		System.out.println("나이: "+ age);
		
		//db insert/update/delete/select
		
		PrintWriter out = response.getWriter();//InputStream, OutputStream, Reader, Writer
		out.println("<h3>응답결과</h3>");
		out.println("<h4> 입력아이디:" + id + "</h4>");
		out.println("<h4> 입력이름:" + name + "</h4>");
		out.println("<h4> 입력점수:" + score + "</h4>");
		out.println("<h4> 입력나이:" + age + "</h4>");
		
		
	}
	

}
