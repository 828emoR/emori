<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>removeBook.jsp</title>
</head>

<body>
	${error }
    <h3>도서삭제조회</h3>
    <form action="../searchBook.do" method="get">
        <input type="text" name="bookCode" id=""><br>
        <input type="hidden" name="job" value="remove">
        <input type="submit" value="조회">
    </form>

<form action="${pageContext.servletContext.contextPath }/removeBook.do" method="post">

		코드: <input type="text" name="book_Code" id = "" readonly value="${book.bookCode }"><br>
        제목: <input type="text" name="book_Title" id ="" readonly value="${book.bookTitle }"><br>
        저자: <input type="text" name="book_Author" id ="" readonly value="${book.bookAuthor }"><br>
        출판사: <input type="text" name="book_Press" id ="" readonly value="${book.bookPress }"><br>
        가격: <input type="text" name="book_Price" id = "" readonly value="${book.bookPrice }"><br>
        <input type="submit" value="삭제 확인">
    
</form>

    <a href="${pageContext.servletContext.contextPath }/index.jsp">첫페이지</a>

</body>

</html>