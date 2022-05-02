<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>
	//Asynchronous Javascript And Xml.
let url = 'StudentGetServlet';//<-- get 방식 요청(브라우저 url 안에 들어감)
	fetch(url)
		.then(result => {
			return result.json();//{"id": 23, "name": "hong"}
		})
		.then(result =>{
			console.log(result);
		})
		.catch(error => {
			console.log(error);
		})
	
	</script>
</body>
</html>