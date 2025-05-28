<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form role="from" action="<c:url value="/board/register"/>" method="post">
	<!-- <form role="from" action="register" method="post"> -->
		<div class="form-group">
			<label>title</label> <input class="form-control" name="title">
		</div>
		<div class="form-group">
			<label>Text area</label> <textarea class="form-control" rows="3" name="content"></textarea>
		</div>
		<div class="form-group">
			<label>Writer</label> <input class="form-control" name="writer">
		</div>
		<button type="submit" class="btn btn-default">Submit Button</button>
		<button type="reset" class="btn btn-default">Reset Button</button>
	</form>
</body>
</html>