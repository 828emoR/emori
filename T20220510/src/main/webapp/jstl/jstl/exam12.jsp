<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:set var="balance" value="123456.7890" />
<fmt:setLocale value="ko_KR"></fmt:setLocale>
<fmt:formatNumber type="currency" value="${balance }"></fmt:formatNumber>
<br>
<fmt:formatNumber type="number" maxIntegerDigits="3" value="${balance }"></fmt:formatNumber>
<br>
<fmt:formatNumber type="number" maxFractionDigits="3" value="${balance }"></fmt:formatNumber>
<br>
<fmt:formatNumber type="number" groupingUsed="false" value="${balance }"></fmt:formatNumber>
<br>
<fmt:formatNumber type="percent" maxIntegerDigits="3" value="${balance }"></fmt:formatNumber>
<br>
<fmt:formatNumber type="percent" minFractionDigits="10" value="${balance }"></fmt:formatNumber>
<br>
<fmt:formatNumber type="percent" maxIntegerDigits="3" value="${banacle }"></fmt:formatNumber>
<br>
<fmt:formatNumber type="number" pattern="###.###E0" value="${balance }"></fmt:formatNumber>

<p>
	Currency in USA
	<fmt:setLocale value="en_US"></fmt:setLocale>
	<fmt:formatNumber value="${balance }" type="currency"></fmt:formatNumber>
</p>

<fmt:parseNumber value="1,234.56" pattern="0,000.000" var="num1"></fmt:parseNumber>
<fmt:parseNumber value="123" var="num2"></fmt:parseNumber>
${num1 + num2 }
<br>
<a href="examList.jsp">리스트</a>