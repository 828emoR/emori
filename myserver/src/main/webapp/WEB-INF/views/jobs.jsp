<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tlqkf</title>
  <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
  <script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
  <script >
  $(function(){
	  $("#accordion").accordion({
	    collapsible : true,
	    active : 0,
	    activate: function( event, ui ) {
	      console.log(ui.newHeader.text())
	    }
	  });
  </script>
</head>

<body>
<div id="accordion">
<c:forEach var="item" items="${jobs}" >
	<h3>${item.job_title}</h3>
	
	<c:forEach var="emp" items="${item.employees}">
	<div>
	${emp.employee_id }: ${emp.first_name }
	</div>
	</c:forEach>	
</c:forEach>
</div>
</body>
</html>