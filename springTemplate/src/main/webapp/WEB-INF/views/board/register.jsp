<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ include file="/WEB-INF/views/includes/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container my-5">
		<form role="from" action="<c:url value="/board/register"/>"
			method="post">
			<!-- <form role="from" action="register" method="post"> -->
			<div class="form-group row mb-3">
				<label class="col-md-2">title</label>
				<div class="col-md-10">
					<input class="form-control" name="title">
				</div>
			</div>
			<div class="form-group row mb-3">
				<label class="col-md-2">Text area</label>
				<div class="col-md-10">
					<textarea class="form-control" rows="3" name="content"></textarea>
				</div>
			</div>
			<div class="form-group row mb-3">
				<label class="col-md-2">Writer</label>
				<div class="col-md-10">
					<input class="form-control" name="writer">
				</div>
			</div>
			<button type="submit" class="btn btn-primary">Submit Button</button>
			<button type="reset" class="btn btn-secondary">Reset Button</button>
		</form>
	</div>
	<%@ include file="/WEB-INF/views/includes/footer.jsp"%>