<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<<<<<<< HEAD
<%@ include file="../header.jsp" %>
<%@ include file="sub_img.html"%>
<%@ include file="sub_menu.jsp" %>  

<div id="qna">
<article>
<h2>총 주문 내역</h2><hr>
<form name="frm" method="post">
<table id="orderList">
	<tr><th width="100px">주문일자</th><th width="65px">주문번호</th><th width="200px">상품명</th><th width="100px">결제 금액</th><th width="70px">주문 상세</th><th width="70px">처리상태</th><th width="60px">주문 취소</th></tr>
=======
<%@ include file="../header.jsp" %>  
<%@ include file="sub_img.html"%> 
<%@ include file="sub_menu.jsp" %>  


<article>
<h2>${title}</h2>
<form>
<table id="cartList">
	<tr><th>주문일자</th><th>주문번호</th><th>상품명</th><th>결제 금액</th><th>주문 상세</th><th>처리상태</th></tr>
>>>>>>> MJ
	<c:forEach items="${orderList}" var="orderVO">
		<tr><td><fmt:formatDate value="${orderVO.indate}" type="date"/></td>
			<td>${orderVO.oseq}</td><td>${orderVO.bname}</td>
			<td><fmt:formatNumber value="${orderVO.price}" type="currency"/></td>
			<td><a href="bs.do?cmd=orderDetail&oseq=${orderVO.oseq}">조회</a></td>
			<td>
<<<<<<< HEAD
				<c:if test="${orderVO.result=='1'}">주문 접수</c:if>
				<c:if test="${orderVO.result=='2'}">배송 준비</c:if>
				<c:if test="${orderVO.result=='3'}">배송중</c:if>
				<c:if test="${orderVO.result=='4'}">배송 완료</c:if>
				<c:if test="${orderVO.result=='5'}">주문 취소</c:if>
			</td>
			<td>
			<c:choose>
				<c:when test="${orderVO.result=='1'||orderVO.result=='2'}">
					<input type="checkbox" name="checkbox" value="${orderVO.oseq}"></c:when>
				<c:when test="${orderVO.result=='5'}">
					<input type="checkbox" name="checkbox" disabled="disabled"></c:when>
				<c:otherwise>
					취소불가
				</c:otherwise>
			</c:choose>
			</td>
			</tr>
	</c:forEach>
</table>
<hr>
<div class="clear"></div>
<div id="orders" style="float:right">
	<input type="button" value="쇼핑 계속하기" id="cancel" onclick="location.href='bs.do?cmd=index'">
	<input type="submit" value="주문 취소하기" id="cancelorder" onclick="orderCancel();">
</div>
</form>

</article>
</div>
=======
				<c:if test="${orderVO.result=='1'}">미처리</c:if>
				<c:if test="${orderVO.result=='2'}">완료</c:if>
			</td></tr>
	</c:forEach>
</table><div class="clear"></div>
<div id="buttons" style="float:right">
	<input type="button" value="쇼핑 계속하기" class="cancel" onclick="location.href='bs.do?cmd=index'">
</div>
</form>
</article>

>>>>>>> MJ


<%@ include file="../footer.jsp" %>
