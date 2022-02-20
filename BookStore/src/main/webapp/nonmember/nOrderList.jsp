<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>  
<%@ include file="sub_img.html"%> 
<%@ include file="sub_menu.jsp" %>  


<article>
<form>
<h2> Order List </h2> 
<table id="cartList">  <!-- 동일한 css 적용을 위한 id사용 -->
	<tr><th>상품명</th><th>수 량</th><th>가 격</th><th>주문일</th><th>진행상태</th></tr>
		<tr><td>
			<a href="bs.do?cmd=productDetail&bseq=${novo.bseq}">
			<h3>${novo.bname}</h3></td>
			<td> ${novo.quantity}</td>
       		<td><fmt:formatNumber value="${novo.price*novo.quantity}" type="currency"/></td>      
       		<td><fmt:formatDate value="${novo.indate}" type="date"/></td>
      		<td> 처리 진행 중 </td></tr>
	<tr><th colspan="2"> 총 액 </th>
       	<th colspan="2"><fmt:formatNumber value="${totalPrice}" type="currency"/></th>
       	<th>주문 처리가 완료되었습니다. </th></tr> 	
</table>
</form>	
</article>



<%@ include file="../footer.jsp" %>
