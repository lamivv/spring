<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ include file="/WEB-INF/views/includes/header.jsp"%>
<b>도서별 대여매출현황</b>

<table class="table table-striped table-bordered table-bover">
	<thead>
		<tr>
			<th>도서번호</th>
			<th>도서명</th>
			<th>대여총계</th>
			<th>대여횟수</th>
		</tr>
	</thead>
	<c:forEach items="${list }" var="book">
		<tr>
			<td>${book.book_no}</td>
			<td>${book.book_name}</td>
			<td><fmt:formatNumber pattern="#,###" value="${book.price}" /></td>
			<td><fmt:formatNumber pattern="#,###" value="${book.count}" /></td>
		</tr>
	</c:forEach>
</table>
<%@ include file="/WEB-INF/views/includes/footer.jsp"%>
