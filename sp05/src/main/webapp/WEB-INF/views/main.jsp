<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
메인
<hr>
${sampleDTO }<br>
${sampleDTO.name }<br>
<hr>
<!-- request.getParameter("") -->
${param.name }<br> 
${param.age }<br>
<hr>
${dept }
<hr>
name: ${param.name }<br>
msg: ${msg }<br>

</body>
</html>