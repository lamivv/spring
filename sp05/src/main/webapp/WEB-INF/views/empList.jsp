<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>empList.jsp</title>
</head>
<body>
<h3>스프링 컨트롤러 연습</h3>
${servertime }
<!-- 절대경로 -->
<img src="/sp05/image/3.PNG" >
<!-- 절대경로 c:url태그 사용 -->
<img src="<c:url value="/image/3.PNG"/>">

<!-- 상대경로 -->
<img src="../image/3.PNG" > 
<img src="../resources/3.PNG" >
</body>
</html>