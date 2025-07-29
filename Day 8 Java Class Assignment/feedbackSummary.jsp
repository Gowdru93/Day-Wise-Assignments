<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="header.jsp" %> 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Feedback Summary</h2>

<c:choose>
    <c:when test="${empty paramValues.facilities}">
        <p>No feedback submitted.</p>
    </c:when>
    <c:otherwise>
        <p>Thank you <b>${param.username}</b> for your feedback on:</p>
        <ul>
            <c:forEach var="facility" items="${paramValues.facilities}">
                <li>${facility}</li>
            </c:forEach>
        </ul>
    </c:otherwise>
</c:choose>

<form action="thankyou.jsp" method="get">
    <input type="hidden" name="username" value="${param.username}">
    <input type="submit" value="Finish">
</form>

</body>
</html>