<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ include file="/WEB-INF/views/includes/header.jsp"%>
<b>도서 등록</b>
<hr>
<form role="from" action="<c:url value="/book/register"/>" method="post">
	<!-- <form role="from" action="register" method="post"> -->
	<div class="form-group row mb-3">
		<label class="col-md-2">도서번호</label>
		<div class="col-md-10">
			<input class="form-control" name="book_no" value="${bookNo }" readonly>
		</div>
	</div>
	<div class="form-group row mb-3">
		<label class="col-md-2">도서명</label>
		<div class="col-md-10">
			<input class="form-control" name="book_name">
		</div>
	</div>
	<div class="form-group row mb-3">
		<label class="col-md-2">도서표지</label>
		<div class="col-md-10">
			<input class="form-control" name="book_coverimg">
		</div>
	</div>
	<div class="form-group row mb-3">
		<label class="col-md-2">출판일자</label>
		<div class="col-md-10">
			<input type="date" class="form-control" name="book_date">
		</div>
	</div>
	<div class="form-group row mb-3">
		<label class="col-md-2">금액</label>
		<div class="col-md-10">
			<input type="number" class="form-control" name="book_price">
		</div>
	</div>
	<div class="form-group row mb-3">
		<label class="col-md-2">출판사</label>
		<div class="col-md-10">
			<input class="form-control" name="book_publisher">
		</div>
	</div>
	<div class="form-group row mb-3">
		<label class="col-md-2">도서소개</label>
		<div class="col-md-10">
			<textarea class="form-control" rows="3" name="book_info"></textarea>
		</div>
	</div>
	<button type="submit" class="btn btn-primary">등록</button>
	<a href="/book/list" class="btn btn-secondary">조회</a> 
</form>
<%@ include file="/WEB-INF/views/includes/footer.jsp"%>