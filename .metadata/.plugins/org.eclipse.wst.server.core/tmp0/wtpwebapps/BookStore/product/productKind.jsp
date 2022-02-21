<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>  
<%@ include file="sub_img.html"%> 
<%@ include file="sub_menu.html" %>

<article>
<h2> Item</h2>   
<c:forEach items="${productKindList}"  var="productVO" >
	<div id="item">
		<a href="bs.do?cmd=productDetail&bseq=${productVO.bseq}">
			<img src="product_images/${productVO.image}" />
			<h3>${productVO.bname} </h3>        
			<p>${productVO.price} </p>
		</a>
   	</div>
</c:forEach>
<div class="clear"></div>
</article>

<%@ include file="../footer.jsp" %>