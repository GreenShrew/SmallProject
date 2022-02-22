<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>  
<%@ include file="sub_img.html"%> 
<%@ include file="sub_menu.jsp" %>  

<div id="qna">
<article>
<h2>주문 취소 내역 조회</h2><hr>
<form>
<table id="orderList">  <!-- 동일한 css 적용을 위한 id사용 -->
	<c:if test="${not empty cList}">
	<tr><th width="100px">주문일자</th><th width="70px">주문번호</th><th width="265px">상품명</th><th width="100px">결제 금액</th><th width="70px">주문 상세</th><th width="65px">처리상태</th></tr>
	<c:forEach items="${cList}" var="cList">
		<tr>
       		<td><fmt:formatDate value="${cList.indate}" type="date"/></td>
			<td>${cList.oseq}</td>
			<td>${cList.bname}</td>
       		<td><fmt:formatNumber value="${cList.price}" type="currency"/></td>
			<td><a href="bs.do?cmd=orderDetail&oseq=${cList.oseq}">조회</a></td>
			<td>주문 취소</td></tr>
	</c:forEach>
	
	</c:if>
	<c:if test="${empty cList}">
		취소 내역이 없습니다.
	</c:if>
</table>
<hr>
</form>	
</article>
<div id="qna">


<%@ include file="../footer.jsp" %>
