<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main.jsp</title>
</head>
<body>
	<%
	String id = (String) session.getAttribute("id");

	if (id == null) {

		//out.print("<button onclick='location.href=\"session.jsp'\"'>로그인</button>");
	%>
	<button onclick='location.href="session.jsp"'>로그인</button>
	<%
	} else {
	//out.print("<h3>로그인 한 아이디는 "+ id +"입니다.</h3 ><button onclick='location.href=\'logout.do\''>");
	%>
	<h3>
		로그인 한 아이디는<%=id%>입니다.
	</h3>
	<button onclick='location.href="logout.do"'>로그아웃</button>

	<%
	}
	%>

</body>
</html>