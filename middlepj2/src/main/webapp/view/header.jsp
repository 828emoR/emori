<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dobby marCat</title>
<style>
#head {
   width: 1000px;
   margin: 0 auto;
}
nav ul {
   list-style: none;
}
#home {
   float: left;
}
.log {
   float: right;
   margin-right: 10px;
}
.cate {
   float: left;
   margin: 0 5px;
}
</style>
</head>
<body>

      <%

         String Uid = (String) session.getAttribute("Uid");
      
         if(Uid==null) {
            Uid="guest";

         }
      %>
      
      <div id="head">
      
         <nav id="info">
            <ul>

               <li id="home"><a href="<%=request.getContextPath() %>/index.jsp" style="text-decoration:none">홈</a></li>
                  <%
                     if(Uid.equals("guest")) {
                  %>
                     <li class="log"><a href="qna.do" style="text-decoration:none">고객센터</a></li>
                     <li class="log"><a href="<%=request.getContextPath() %>/view/add.jsp" style="text-decoration:none">회원가입</a></li>
                     <li class="log"><a href="<%=request.getContextPath() %>/view/login.jsp" style="text-decoration:none">로그인</a></li>
                  <%
                     } else {
                  %>   
                     <li class="log"><%=Uid %> 님 반갑습니다.</li>

                     <li class="log"><a href="<%=request.getContextPath() %>/mypage.do" style="text-decoration:none">마이페이지</a></li>
                     <li class="log"><a href="<%=request.getContextPath() %>/logout.do" style="text-decoration:none">로그아웃</a><li>
                     <li class="log"><a href="qna.do" style="text-decoration:none">고객센터</a><li>

                  <%
                     }
                  %>
            </ul>
         </nav>
         <br>
         
         <nav id="category">
            <ul>
               <li class="cate"><a href="${pageContext.request.contextPath}/SnackList.do" style="text-decoration:none; color:black">간식</a></li>
               <li class="cate"><a href="${pageContext.request.contextPath}/ToyList.do" style="text-decoration:none; color:black">장난감</a></li>
               <li class="cate"><a href="${pageContext.request.contextPath}/GoodsList.do" style="text-decoration:none; color:black">실내용품</a></li>
               <li class="cate"><a href="${pageContext.request.contextPath}/WashList.do" style="text-decoration:none; color:black">목욕/미용</a></li>
            </ul>
         </nav>
      

      </div>

