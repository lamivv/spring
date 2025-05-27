<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>mvc 패턴</h3>
	<table border="1">
		<tr>
			<td><%=request.getAttribute("name") %></td> 
			<td>${dept}</td> <!-- el방식 -->
		</tr>
	</table>
</body>
</html>