<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../adminHeader.jsp" %>

<div id="adminBox" style="width:1100px;">
	<h3>비회원목록</h3>
	<form name="form" method="post">
		<input type="button" name="button_search" value="전체보기" onClick="go_ListTotal('adminNonMemberList')">
		<input type="text" name="key" value="${key}" placeholder="비회원 ID 검색">
		<input type="button" name="button_search" value="검색" onClick="">
	</form>
	
	<table id="productList" style="width:1000px;">
		<tr>
			<th>No.</th>
			<th>주문번호</th>
			<th>이름</th>
			<th>이메일</th>
			<th>전화번호</th>
			<th>주소</th>
		</tr>
		<c:forEach items="${nonmemberList }" var="nmvo" varStatus="status">
			<tr>
				<td style="text-align:center;">${status.count }</td>
				<td style="text-align:center;">${nmvo.od_pass }</td>
				<td style="text-align:center;">${nmvo.name }</td>
				<td style="text-align:center;">${nmvo.email }</td>
				<td style="text-align:center;">${nmvo.phone }</td>
				<td style="text-align:center;">${nmvo.zip_num } ${nmvo.address }</td>
			</tr>
		</c:forEach>
	</table>

	<jsp:include page="/admin/paging/admin_paging.jsp">
	 	<jsp:param name="cmd" value="bs.do?cmd=adminNonMemberList" />
	 </jsp:include>
</div>


<%@ include file="../adminFooter.jsp" %>