<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/includes/header.jsp"%>
<div class="row">
	<div class="col-lg-12">
		<div class="panel pandel-default">
			<div class="panel-heading">Board Read Page</div>
			<div class="panel-body">
				<div class="form-group">
					<label>Bno</label><input class="form-control" name="bno"
						value=${board.bno } readonly="readonly">
				</div>
				<div class="form-group">
					<label>Title</label><input class="form-control" name="title"
						value="${board.title }" readonly="readonly">
				</div>
				<div class="form-group">
					<label>Text area</label>
					<textarea class="form-control" rows="3" name="content"
						readonly="readonly"> ${board.content }</textarea>
				</div>
				<div class="form-group">
					<label>Writer</label><input class="form-control" name="writer"
						value="${board.writer }" readonly="readonly">
				</div>
				<a href="modify?bno=${board.bno }">수정</a> <a href="list">목록</a>
				<!-- <button data-oper='modify' class="btn btn-default">Modify</button>
					<button data-oper='list' class="btn btn-default">List</button> -->
			</div>
			<hr>
			<div class="mt-5">
				<!-- 댓글 입력 폼 -->
				<div class="mb-3">
					<textarea id="txtReply" class="form-control mb-2" rows="3"
						placeholder="댓글을 입력하세요..."></textarea>
					<button id="btnReplyAdd" class="btn btn-primary">댓글 작성</button>
				</div>

				<hr />

				<!-- 댓글 리스트 -->
				<div class="reply mb-4">
					<div class="d-flex justify-content-between">
						<strong>user123</strong> <small class="text-muted">2025-05-22</small>
					</div>
					<p class="mb-1">좋은 글이네요!</p>
					<div>
						<button class="btn btn-sm btn-outline-secondary">수정</button>
						<button class="btn btn-sm btn-outline-danger">삭제</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<script src="/resources/js/get.js"></script>
<script>
	document.querySelector("#btnReplyAdd").addEventListener("click",()=>{
		console.log("클릭함");
		const reply = document.querySelector("#txtReply").value;
		const data = { reply, replyer: "김땅콩" };
		register(data);
	});
</script>
<%@ include file="/WEB-INF/views/includes/footer.jsp"%>