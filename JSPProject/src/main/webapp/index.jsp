<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
</head>
<body>
   <h3>반갑습니다.</h3>
   <p> 지금 가나다라 배우는중 </p>
   <!-- 실제 html 형식이 아님. -->
   <!--java를 쓰기 위해서는 %를 쓰면 됨. -->
   <%
      String name = "홍길동";
      out.println("<h3>" + name + "</h3>"); 
      // out = pageContext.getOut(); 로 값을 재정의
      //C:\Dev\workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\Catalina\localhost\JSPProject\org\apache\jsp 에서 확인 가능.
      
      // user_id,name 의 input(name) 값 받음. 
      String id = request.getParameter("user_id");
      String name2 = request.getParameter("user_name");
      out.println("<h4> 입력값: " + id + ", name : " + name2);
      // form method = "get"
      //http://localhost/JSPProject/index.jsp?user_id=hong&user_name=%ED%99%8D%EA%B8%B8%EB%8F%99
      // URL 값을 통해 정보 전달 -> 보안 취약
      
      // form method = "post"
      // header를 통해 정보가 전송되어 상대적으로 보안에 강함.
   %>
   
   <a href="student.do">Student Servlet</a>
</body>
</html>