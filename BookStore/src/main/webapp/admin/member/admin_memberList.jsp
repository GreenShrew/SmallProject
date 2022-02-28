<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../adminHeader.jsp" %>

<div id="adminBox" style="width:1100px;">
	<c:choose>
		<c:when test="${useyn == 'n' }">
			<h3>휴면계정목록</h3></c:when>
		<c:otherwise>
			<h3>회원목록</h3></c:otherwise>
	</c:choose>
	<form name="form" method="post">
		<input type="button" name="button_search" value="전체보기" onClick="go_ListTotal('adminMemberList')">
		<input type="text" name="key" value="${key}" placeholder="회원 ID 검색">
		<input type="button" name="button_search" value="검색" onClick="">
	</form>
	
	<table id="productList" style="width:1000px;">
		<tr>
			<th>No.</th>
			<th>ID</th>
			<th>이름</th>
			<th>이메일</th>
			<th>전화번호</th>
			<th>주소</th>
			<th>휴면계정여부</th>
			<th>성별</th>
			<th>포인트</th>
			<th>등록일</th>
		</tr>
		<c:forEach items="${memberList }" var="mvo" varStatus="status">
			<tr>
				<td>${status.count }</td>
				<td>${mvo.id }</td>
				<td>${mvo.name }</td>
				<td>${mvo.email }</td>
				<td>${mvo.phone }</td>
				<td>${mvo.zip_num } ${mvo.address }</td>
				<td>
					<c:choose>
						<c:when test="${mvo.useyn == 'y'}">일반계정</c:when>
						<c:otherwise>휴면계정</c:otherwise>
					</c:choose>
				</td>
				<td>${mvo.gender}</td>
				<td>${mvo.point}</td>
				<td><fmt:formatDate value="${mvo.indate }" type="date"/></td>
				<td><input type="button" value="수정하기" onClick="location.href='bs.do?cmd=adminMemberUpdateForm&id=${mvo.id}'"></td>
				<td>
					<c:choose>
						<c:when test="${mvo.useyn == 'y'}">
							<input type="button" value="휴면계정으로 전환" onClick="go_member_useyn('${mvo.id}')">
						</c:when>
						<c:otherwise>
							<input type="button" value="일반계정으로 전환" onClick="go_member_useyn('${mvo.id}')">
						</c:otherwise>
					</c:choose>
				</td>
			</tr>
		</c:forEach>
	</table>

	<jsp:include page="/admin/paging/admin_paging.jsp">
	 	<jsp:param name="cmd" value="bs.do?cmd=adminMemberList" />
	 </jsp:include>
</div>


<%@ include file="../adminFooter.jsp" %>