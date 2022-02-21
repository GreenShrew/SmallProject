<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<%@ include file="sub_img.html"%> 
<%@ include file="sub_menu.jsp" %>


<article>
<h2> Order List </h2>
<form name="formm" method="post">
	<c:choose>
		<c:when test="${orderList.size() == 0}">
			<h3 style="color: red;text-align: center;">조회된 주문내역이 없습니다.</h3> 
		</c:when>
		<c:otherwise>
			<table id="orderList">
				<tr><th>상품명</th><th>수 량</th><th>가 격</th><th>주문일</th><th>삭 제</th></tr>
					<c:forEach items="${orderList}" var="orderVO">
						<tr><td><a href="bs.do?cmd=productDetail&bseq=${orderVO.bseq}" target="_blank" >
							<h3> ${orderVO.bname} </h3></a></td><td> ${orderVO.quantity} </td>
						<td><fmt:formatNumber value="${orderVO.price*orderVO.quantity}"	type="currency"/></td>
						<td><fmt:formatDate value="${orderVO.indate}" type="date" /></td>
						<td><input type="checkbox" name="cseq" value="${orderVO.cseq}"></td></tr>
					</c:forEach>
				<tr><th colspan="2"> 총 액 </th><th colspan="2">
       				<fmt:formatNumber value="${totalPrice}" type="currency" /></th>
       				<th><a href="#" onClick="go_order_delete();"><h3>삭제하기</h3></a></th></tr> 
			</table>
		</c:otherwise>
	</c:choose>
<div id="buttons" style="float: right">
    <input type="button" value="계속 쇼핑" class="cancel" onclick="location.href='bs.do?cmd=index'">    
    <c:if test= "${orderList.size() != 0}">
   		<input type="button" value="주문하기"  class="submit" onclick="go_order_insert();">
    </c:if>
</div>
</form>
</article>




<%@ include file="../footer.jsp" %>