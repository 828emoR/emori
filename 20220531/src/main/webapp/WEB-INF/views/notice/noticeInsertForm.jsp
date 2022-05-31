<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div>
			<h1>게시글 등록</h1>
		</div>
		<form id="frm" action="noticeInsert.do" method="post" enctype="multipart/form-data">
			<div>
				<table border="1">
					<tr>
						<th width="70">작성자</th>
						<td width="100"><input type="text" id="noticeName" name="noticeName"></td>
						<th width="70">작성일자</th>
						<td width="100"><input type="date" id="noticeDate" name="noticeDate"></td>
					<tr>
					<tr>
						<th width="70">제목</th>
						<td width="130"><input type="text" id="noticeTitle" name="noticeTitle"></td>
					</tr>
					<tr>
						<th width="70">본문</th>
						<td colspan="3"><textarea rows="15" cols="50" id="noticeContents" name="noticeContents">
						</textarea></td>
					</tr>
					<tr>
						<th width="70">첨부파일</th>
						<td colspan="3"><input type="file" id="file" name="file" multiple="multiple"></td>
					</tr>
				</table>
				<div>
					<br>
					<div>
						<input type="submit" value="저장">&nbsp;&nbsp; 
						<input type="reset" value="취소">&nbsp;&nbsp;
						<button type="button" onclick="location.href='noticeList.do'">글 등록</button>
					</div>
				</div>
			</div>
		</form>
	</div>
</body>
</html>