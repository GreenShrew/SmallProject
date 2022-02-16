<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>  
<%@ include file="sub_img.html"%> 
<%@ include file="sub_menu.jsp" %>  


<article>
<h2>${title}</h2>
<form>
<table id="cartList">
	<tr><th>주문일자</th><th>주문번호</th><th>상품명</th><th>결제 금액</th><th>주문 상세</th><th>처리상태</th></tr>
	<c:forEach items="${orderList}" var="orderDetail">
		<tr><td><fmt:formatDate value="${orderDetail.indate}" type="date"/></td>
			<td>${orderDetail.oseq}</td><td>${orderDetail.bname}</td>
			<td><fmt:formatNumber value="${orderDetail.price}" type="currency"/></td></tr>
	</c:forEach>
</table><div class="clear"></div>
<div id="buttons" style="float:right">
	<input type="button" value="쇼핑 계속하기" class="cancel" onclick="location.href='bs.do?cmd=index'">
</div>
</form>
</article>



<%@ include file="../footer.jsp" %>
