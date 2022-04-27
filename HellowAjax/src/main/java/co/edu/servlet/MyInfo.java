package co.edu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/edu/828emoR.do")

public class MyInfo extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setCharacterEncoding("UTF-8");
	resp.setContentType("text/plain;charset=UTF-8");
	//content type =>default.
	//plain=텍스트 형식 그대로 출력
	
	PrintWriter out = resp.getWriter();
	out.print("<h3>컨텐트 타입이 기본</h3>");
	out.print("<a href=\"../index.html\">처음으로 돌아가기</a>");
	out.print("<a href=\"../edu/emori.do\">Info 보러가기</a>");
	}

}
