<%@page import="co.test.vo.BookVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%String name = "Hong"; %>

 <c:set var="name" value="Hong"></c:set> <!--변수의 이름은 "name". "name"에 담기는 값은 "Hong"  -->
 <c:set var="pi" value="3.14"></c:set>
 <c:out value="${pi }"></c:out>
 <h3>${pi }</h3>
 
 <%
 	BookVO vo = new BookVO("20220501001", "이것이.. 자바?", "오정임", "루비페이퍼", 2500);
 	request.setAttribute("vo", vo);
 %>
 	<c:if test="${vo eq null }">
 		<h3>저장값이 없습니다.</h3>
 	</c:if>
 	<c:choose>
 		<c:when test="${vo.bookTitle eq '이것이자바다' }"><h3>비쌉니다</h3></c:when>
 		<c:when test="${vo.bookPrice > 2000 }"><h3>비쌉니다</h3></c:when>
 		<c:when test="${vo.bookPrice > 1000  }"><h3>쥰내 비쌉니다</h3></c:when>
 		<c:otherwise><h3>북코드: ${vo.BookCode }, 저자: ${vo.bookAuthor }</h3></c:otherwise>
 	</c:choose>
 	
 	<!--반복문 사용  -->
 	<!-- for(int i=1; i<10; i++) -->
 	<c:forEach begin="1" end="10" var="cnt"><!--상기 for 값과 같다.  -->
 		<p>2 * ${cnt } = ${cnt *2 }</p>
 	</c:forEach>
 	
 	<c:forEach items="${list }" var="book">
 		<p>${book.bookCode }, ${book.bookTitle }</p>
 	</c:forEach>
 	
 	<c:forTokens items="소설/역사/인문/정치" delims="/" var="token">
 		<p>token: ${token }</p>
 	</c:forTokens>
 	
 	
</body>
</html>