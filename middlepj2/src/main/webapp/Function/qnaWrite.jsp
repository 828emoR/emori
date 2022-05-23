<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>qnaWrite.jsp</title>
</head>
<body>
  <h3>문의하기</h3>
  <form  action="../qnaAdd.do" method="post">
	<table border="1">
		<thead>
		</thead>
		<tbody>
			<tr>
				<td>카테고리</td>
				<td>
					<select name="category">
					<option value="상품">상품문의</option>
					<option value="배송">배송문의</option>
					<option value="기타">기타문의</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" placeholder="제목입력" name="qnaTitle"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><input type="text" placeholder="주문번호:" name="qnaContent" style= "height:350px"></td>
			</tr>
			<tr>
				<td>작성자</td>
				<td><input type="text" placeholder="작성자 입력" name="qnaWriter"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="text" name="qnaPw"></td>
			</tr>
		</tbody>
	</table>
		<input type="submit" value="글 저장">
  </form>
</body>
</html>