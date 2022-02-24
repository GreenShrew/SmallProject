<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../adminHeader.jsp" %>

<div id="adminBox">
	<h3 style="padding:0px 0px 0px 30px;">ProductDetail</h3>
	<input type="hidden" value="${productVO.bseq }">
	<ul id="admin_ProductDetail">
		<li>등록번호 : ${productVO.bseq }</li>
		<li>제목 : ${productVO.bname }</li>
		<li>작가 : ${productVO.writer }</li>
		<li>출판년도 : ${productVO.byear }</li>
		<li>종류 : 
			<c:choose>
				<c:when test="${productVO.kind == 'l'}">국내도서</c:when>
			<c:otherwise>외국도서</c:otherwise>
			</c:choose>
		</li>
		<li>가격 : <fmt:formatNumber value="${productVO.price}" type="currency"/></li>
		<li>출판사 : ${productVO.publisher}</li>
		<li>장르 : ${productVO.genre }</li>
		<li>내용 : ${productVO.content}</li>
		<li>사용여부 : 
			<c:choose>
				<c:when test="${productVO.useyn == 'y'}">use y</c:when>
				<c:otherwise>use n</c:otherwise>
			</c:choose>
		</li>
		<li>베스트여부 : 
			<c:choose>
				<c:when test="${productVO.bestyn == 'y'}">best y</c:when>
				<c:otherwise>best n</c:otherwise>
			</c:choose>
		</li>
		<li>등록날짜 : <fmt:formatDate value="${productVO.indate}" type="date"/></li>
		<li>표지</li>
		<li style="list-style:none;"><img src="images/book/${productVO.image }" style="width:155px; height:200px;"></li>
		<li style="list-style:none;">
			<input type="button" value="목록으로" onClick="go_productList()">
			<input type="button" value="수정하기" onClick="go_update_product(${productVO.bseq})">
		</li>
	</ul>
</div>

<%@ include file="../adminFooter.jsp" %>