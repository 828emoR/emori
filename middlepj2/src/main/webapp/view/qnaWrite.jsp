<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>qnaWrite.jsp</title>
</head>
<body>
  <form method="post" action="writeAction.jsp">
	<table border="1">
		<thead>
			<tr>
				<th>고객센터 문의하기</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td><input type="text" placeholder="글 제목" class="form-control" name="qnaTitle" maxlength="50"></td>
			</tr>
			<tr>
				<td><textarea placeholder="글 내용" class="form-control" name="qnaContent"  style="width:400px;" maxlength="200"></textarea></td>
			</tr>
		</tbody>
	</table>
		<input type="submit" value="글쓰기">
  </form>
</body>
</html>