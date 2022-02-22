<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../adminHeader.jsp" %>

<div id="adminBox">
	<h3 style="padding:0px 0px 0px 30px;">ProductList</h3>
	<form method="post" name="form" enctype="multipart/form-data">
	<input type="hidden" name="bseq" value="${productVO.bseq }">
		<ul id="admin_ProductDetail">
			<li>등록번호 : ${productVO.bseq }</li>
			<li>제목 : 
				<input type="text" name="bname" value="${productVO.bname }"></li>
			<li>작가 : 
				<input type="text" name="writer" value="${productVO.writer }"></li>
			<li>출판년도 : 
				<input type="text" name="byear" value="${productVO.byear }"></li>
			<li>종류 : 
				<c:choose>
					<c:when test="${productVO.kind ==  'l'}">
						<input type="radio" name="kind_radio" value="l" checked="checked">국내도서
						<input type="radio" name="kind_radio" value="g">외국도서
					</c:when>
					<c:otherwise>
						<input type="radio" name="kind_radio" value="l">국내도서
						<input type="radio" name="kind_radio" value="g" checked="checked">외국도서
					</c:otherwise>
				</c:choose>
			</li>
			<li>가격 : 
				<input type="text" name="price" value="${productVO.price}" ></li>
			<li>출판사 : 
				<input type="text" name="publisher" value="${productVO.publisher}" ></li>
			<li>장르 : 
				<input type="hidden" name="oldGenre" value="${productVO.genre }">
				<input type="radio" name="genre_radio" value="${productVO.genre }" checked="checked">기존 ${productVO.genre }
				<input type="radio" name="genre_radio" value="history">history
				<input type="radio" name="genre_radio" value="economy" >economy
				<input type="radio" name="genre_radio" value="hobby" >hobby
				<input type="radio" name="genre_radio" value="essay" >essay
				<input type="radio" name="genre_radio" value="travel" >travel
				<input type="radio" name="genre_radio" value="art" >art
				<input type="radio" name="genre_radio" value="science" >science
				<input type="radio" name="genre_radio" value="it" >it
				<input type="radio" name="genre_radio" value="fiction" >fiction
			</li>
			<li>내용 : 
				<input type="text" name="content" value="${productVO.content}"  size="40"></li>
			<li>사용여부 : 
				<c:choose>
					<c:when test="${productVO.useyn ==  'y'}">
						<input type="checkbox" name="useyn" value="y" checked="checked">
					</c:when>
					<c:otherwise>
						<input type="checkbox" name="useyn" value="n">
					</c:otherwise>
				</c:choose>
			</li>
			<li>베스트여부 :
				<c:choose>
					<c:when test="${productVO.bestyn ==  'y'}">
						<input type="checkbox" name="bestyn" value="y" checked="checked">
					</c:when>
					<c:otherwise>
						<input type="checkbox" name="bestyn" value="n">
					</c:otherwise>
				</c:choose>
			</li>
			<li>등록날짜 : <fmt:formatDate value="${productVO.indate}" type="date"/></li>
			<li>표지</li>
			<li style="list-style:none;">
				<input type="hidden" name="oldImage" value="${productVO.image }">
				<img src="images/book/${productVO.image }" style="width:155px; height:200px;">
				<input type="file" name="image"></li>
			<li style="list-style:none;">
				<input type="button" value="목록으로" onClick="go_productList()">
				<input type="button" value="수정취소" onClick="go_prodcutListDetail(${productVO.bseq})">
				<input type="button" value="수정하기" onClick="go_update()">
			</li>
		</ul>
	</form>
</div>

<%@ include file="../adminFooter.jsp" %>