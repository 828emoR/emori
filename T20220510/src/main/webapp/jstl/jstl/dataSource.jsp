<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	// JNDI 서버 객체 생성.
	InitialContext ic = new InitialContext();
	// Lookup 조회.
	DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/myoracle");
	// Connection 객체.
	Connection conn = ds.getConnection();
	Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery("select * from book_info order by 1");
	while (rs.next()) {
		out.print("<br>도서코드: " + rs.getString("book_code") + ", 도서제목: " + rs.getString("book_title"));
	}
%>
