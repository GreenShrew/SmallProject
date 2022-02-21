<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>

<%@ include file="sub_img.jsp" %>
<%@ include file="sub_menu.jsp" %>

<div id="bodyFrame">
	<div>
		<div>
			<div>프로필</div>
			<div>아이디 : ${loginUser.id}</div>
			<div>이름 : ${loginUser.name}</div>
			<div>성별 : ${loginUser.gender}</div>
			<div>가입날짜 : ${loginUser.indate}</div>
		</div>
		<div>
			<div>연락처 및 알림</div>
			<div>이메일 : ${loginUser.email}</div>
			<div>전화번호 : ${loginUser.phone}</div>
			<div>가입날짜 : ${loginUser.indate}</div>
		</div>
		<div>
			<div>배송지 관리</div>
			<div>지번 : ${loginUser.zip_num}</div>
			<div>주소 : ${loginUser.address}</div>
		</div>
		<div>
			<div>주문 관리</div>
			<div>주문 목록 / 배송 조회</div>
			<div>취소/반품/교환/환불 내역</div>
			<div>문의하기</div>
		</div>
	</div>
</div>


<%@ include file="../footer.jsp"%>