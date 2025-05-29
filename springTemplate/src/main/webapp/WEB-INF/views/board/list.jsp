<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="my" tagdir="/WEB-INF/tags" %>
<%@ include file="/WEB-INF/views/includes/header.jsp"%>
<H3>게시글목록</H3>

<a href="register">등록</a>
<table class="table table-striped table-bordered table-bover">
	<thead>
		<tr>
			<th>#번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>수정일</th>
		</tr>
	</thead>
	<c:forEach items="${list }" var="board">
		<tr>
			<td>${board.bno}</td>
			<td><a href='get?bno=${board.bno}'>${board.title}</a></td>
			<td>${board.writer}</td>
			<td><fmt:formatDate pattern="yyyy-MM-dd"
					value="${board.regdate}" /></td>
			<td><fmt:formatDate pattern="yyyy-MM-dd"
					value="${board.updateDate}" /></td>
		</tr>
	</c:forEach>
</table>
<!-- 검색 폼 -->
<form id="searchForm" action="/board/list" method="get">
	<select name="type">
		<option value="">선택하세요</option>
		<option value="T">제목</option>
		<option value="C">내용</option>
		<option value="W">작성자</option>
		<option value="TC">제목 or 내용</option>
		<option value="TW">제목 or 작성자</option>
		<option value="TWC">제목 or 내용 or 작성자</option>
	</select> <input type="text" name="keyword" value="${pageMaker.cri.keyword}" />

	<button class="btn btn-outline-primary">Search</button>

	<input type="hidden" name="pageNum" value="1" /> <input type="hidden"
		name="amount" value="10" />
	<%--   <input type="hidden" name="pageNum" value="${pageMaker.cri.pageNum}" />
  <input type="hidden" name="amount" value="${pageMaker.cri.amount}" /> --%>
</form>

<nav aria-label="Page navigation example">
	<ul class="pagination">
		<c:if test="${pageMaker.prev}">
			<li class="page-item previous"><a class="page-link"
				href="${pageMaker.startPage -1}">Previous</a></li>
		</c:if>

		<c:forEach var="num" begin="${pageMaker.startPage}"
			end="${pageMaker.endPage}">
			<li class="page-item  ${pageMaker.cri.pageNum == num ? "active":""} ">
				<a class="page-link" href="${num}">${num}</a>
			</li>
		</c:forEach>

		<c:if test="${pageMaker.next}">
			<li class="page-item next"><a class="page-link"
				href="${pageMaker.endPage +1 }">Next</a></li>
		</c:if>
	</ul>
</nav>
<!-- 모달 -->
<div class="modal" tabindex="-1" id="myModal">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title">Modal title</h5>
				<button type="button" class="btn-close" data-bs-dismiss="modal"
					aria-label="Close"></button>
			</div>
			<div class="modal-body">
				<p>Modal body text goes here.</p>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-secondary"
					data-bs-dismiss="modal">Close</button>
				<button type="button" class="btn btn-primary">Save changes</button>
			</div>
		</div>
	</div>
</div>
<%@ include file="/WEB-INF/views/includes/footer.jsp"%>
<script>
	$(document).ready(
			function() {
				
				$('[name=type]').val('${pageMaker.cri.type}');

				let searchForm = $("#searchForm");

				/* -------------- 
				// 등록 후 모달 열기
				----------------*/
				var result = "${result}";
				checkModal(result);

				function checkModal(result) {
					if (result === "") {
						return;
					}

					if (parseInt(result) > 0) {
						$(".modal-body").html(
								"게시글 " + parseInt(result) + " 번이 등록되었습니다.");
					}

					const options = {
						backdrop : false,
						focus : false,
						keyboard : true
					};
					const myModal = document.getElementById("myModal");
					const myModalAlternative = new bootstrap.Modal("#myModal",
							options);
					myModalAlternative.show(myModal);
				}

				/* -------------- 
				// 페이징 핸들러 
				----------------*/

				$(".pagination a").on(
						"click",
						function(e) {
							e.preventDefault();
							searchForm.find("input[name='pageNum']").val(
									$(this).attr("href"));
							searchForm.submit();
						});
			});

	/* -------------- 
	// 검색 버튼 핸들러 
	----------------*/
	$(document).ready(function() {
		$("#searchForm button").on("click", function(e) {
			if (!searchForm.find("option:selected").val()) {
				alert("검색종류를 선택하세요");
				return false;
			}

			if (!searchForm.find("input[name='keyword']").val()) {
				alert("키워드를 입력하세요");
				return false;
			}

			searchForm.find("input[name='pageNum']").val("1");
			e.preventDefault();
			searchForm.submit();
		});
	});
</script>
