<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../adminHeader.jsp" %>

<div id="adminBox">
	<h3 style="padding:0px 0px 0px 30px;">ProductList Upload</h3>
	<form method="post" name="form" enctype="multipart/form-data">
		<ul id="admin_ProductDetail">
			<li>제목 : 
				<input type="text" name="bname"></li>
			<li>작가 : 
				<input type="text" name="writer"></li>
			<li>출판년도 : 
				<input type="text" name="byear"></li>
			<li>종류 : 
				<input type="radio" name="kind_radio" value="l" checked="checked">국내도서
				<input type="radio" name="kind_radio" value="g">외국도서
			</li>
			<li>가격 : 
				<input type="text" name="price"></li>
			<li>출판사 : 
				<input type="text" name="publisher"></li>
			<li>장르 : 
				<input type="radio" name="genre_radio" value="history" checked="checked">history
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
				<input type="text" name="content" size="40"></li>
			<li>사용여부 : 
				<input type="radio" name="useyn_radio" value="y" checked="checked">y
				<input type="radio" name="useyn_radio" value="n">n
			</li>
			<li>베스트여부 :
				<input type="radio" name="bestyn_radio" value="y" checked="checked">y
				<input type="radio" name="bestyn_radio" value="n">n
			</li>
			<li>표지</li>
			<li style="list-style:none;">
				<input type="file" name="image"></li>
			<li style="list-style:none;">
				<input type="button" value="목록으로" onClick="go_productList()">
				<input type="button" value="상품등록" onClick="go_productUpload()">
			</li>
		</ul>
	</form>
</div>

<%@ include file="../adminFooter.jsp" %>