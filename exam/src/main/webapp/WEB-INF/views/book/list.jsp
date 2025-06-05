<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ include file="/WEB-INF/views/includes/header.jsp"%>
<b>도서 조회/ 수정</b>

<table class="table table-striped table-bordered table-bover">
	<thead>
		<tr>
			<th>도서번호</th>
			<th>도서명</th>
			<th>표지</th>
			<th>출판일자</th>
			<th>금액</th>
			<th>출판사</th>
			<th>도서소개</th>
		</tr>
	</thead>
	<c:forEach items="${list }" var="book">
		<tr>
			<td>${book.book_no}</td>
			<td>${book.book_name}</td>
			<td><img width="50px" alt="" src="/resources/${book.book_coverimg}"></td>
			<td><fmt:formatDate pattern="yyyy/MM/dd" value="${book.book_date}" /></td>
			<td><fmt:formatNumber pattern="#,###" value="${book.book_price}" /></td>
			<td>${book.book_publisher}</td>
			<td>${book.book_info}</td>
		</tr>
	</c:forEach>
</table>
<%@ include file="/WEB-INF/views/includes/footer.jsp"%>
