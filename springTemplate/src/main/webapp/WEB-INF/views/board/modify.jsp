<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ include file="/WEB-INF/views/includes/header.jsp"%>
Board Modify
	<form role="from" action="<c:url value="/board/modify"/>" method="post">
	<!-- <form role="from" action="register" method="post"> -->
		<input type="hidden" name="bno" value="${board.bno }">
		<div class="form-group">
			<label>title</label> <input class="form-control" name="title" value="${board.title }">
		</div>
		<div class="form-group">
			<label>Text area</label> <textarea class="form-control" rows="3" name="content">${board.content }</textarea>
		</div>
		<div class="form-group">
			<label>Writer</label> <input class="form-control" name="writer" value="${board.writer }">
		</div>
		<button type="submit" class="btn btn-default">Submit Button</button>
		<button type="reset" class="btn btn-default">Reset Button</button>
	</form>
<%@ include file="/WEB-INF/views/includes/footer.jsp"%>