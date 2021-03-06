<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../adminHeader.jsp" %>

<div id="adminBox" style="width:1100px;">
	<h3>ProductList</h3>
	<form name="form" method="post">
		<input type="button" name="button_search" value="전체보기" onClick="go_ListTotal('adminProductList')">
		<input type="text" name="key" value="${key}" placeholder="책이름 검색">
		<input type="button" name="button_search" value="검색" onClick="">
		<input type="button" name="button_search" value="상품등록" onClick="go_productUploadForm()">
	</form>
	
	<table id="productList" style="width:1000px;">
		<tr>
			<th>No.</th>
			<th>표지</th>
			<th>책</th>
			<th>작가</th>
			<th>가격</th>
			<th>종류 | 장르</th>
			<th>등록일</th>
		</tr>
		<c:forEach items="${productList }" var="pvo">
			<tr>
				<td>${pvo.bseq }</td>
				<td><img src="images/book/${pvo.image }" style="width:42px; height:60px;"></td>
				<td><a href="bs.do?cmd=adminProductDetail&bseq=${pvo.bseq }">${pvo.bname }</a></td>
				<td>${pvo.writer }</td>
				<td><fmt:formatNumber value="${pvo.price }" type="currency"/></td>
				<td>
					<c:choose>
						<c:when test="${productVO.kind == 'l'}">국내도서</c:when>
						<c:otherwise>외국도서</c:otherwise>
					</c:choose>&nbsp;|&nbsp;${pvo.genre }</td>
				<td><fmt:formatDate value="${pvo.indate }" type="date"/></td>
				<td><input type="button" value="수정하기" onClick="go_update_product(${pvo.bseq})"></td>
				<td><input type="button" value="삭제하기" onClick="go_delete_product(${pvo.bseq})"></td>
			</tr>
		</c:forEach>
	</table>

	<jsp:include page="/admin/paging/admin_paging.jsp">
	 	<jsp:param name="cmd" value="bs.do?cmd=adminProductList" />
	 </jsp:include>
</div>


<%@ include file="../adminFooter.jsp" %>