<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="header.jsp" %>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Feedback Form</h2>
<form action="feedbackSummary.jsp" method="post">
    <p>Select the facilities you want to provide feedback on:</p>

    <label><input type="checkbox" name="facilities" value="Library"> Library</label><br>
    <label><input type="checkbox" name="facilities" value="Cafeteria"> Cafeteria</label><br>
    <label><input type="checkbox" name="facilities" value="Lab"> Lab</label><br>
    <label><input type="checkbox" name="facilities" value="Sports Complex"> Sports Complex</label><br>

    <br><label>Enter your name: <input type="text" name="username" required></label><br><br>
    
    <input type="submit" value="Submit Feedback">
</form>

</body>
</html>

<%@ include file="footer.jsp" %>