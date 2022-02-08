<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="header.jsp"%>



<!-- 신상품 <-> 베스트상품 
	class on <-> class -->
<!-- <hr> -->

<div id="product">
	<h3>베스트셀러</h3>   
		<div id="bestProduct">
			<c:forEach items="${bestList}" var = "productVO" >
				<div id="item"> 
					<a href="bs.do?cmd=productDetail&bseq=${productVO.bseq}">
						<img src="images/${productVO.image}" />
						<h3> ${productVO.bname} - <fmt:formatNumber value="${productVO.price}" type="currency" /></h3>
					</a>
				</div>
			</c:forEach>
		</div>
	<h3>신간</h3>   
	<div id="bestProduct">
		<c:forEach items="${newList}"  var = "productVO" >
			<div id="item"> 
				<a href="bs.do?cmd=productDetail&bseq=${productVO.bseq}">
					<img src="images/${productVO.image}" />
					<h3> ${productVO.bname} - <fmt:formatNumber value="${productVO.price}" type="currency" /></h3>
				</a>
			</div>
		</c:forEach>
	</div>
</div>
		<!-- 
	<div id="tabs">
		<ul>
			<li>베스트 셀러</li>
			<li>신간 도서</li>
		</ul>
	</div>
	<div>
		<div>
			<c:forEach items="${bestList }" var="productVO">
				<div id="item">
					<a href="bs.do?cmd=">
						<img src="images/${productVO.image }">
					</a>
				</div>
			</c:forEach>
		</div>
	</div>
	 -->
	 
	 
<%@ include file="footer.jsp"%>