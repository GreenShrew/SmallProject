<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>

<%@ include file="sub_menu.jsp" %>

<div id="bodyFrame">
	<div class="mypageBox" style="top:20px; ">
		<h2>프로필</h2>
		<div>아이디 : ${loginUser.id}</div>
		<div>이름 : ${loginUser.name}</div>
		<div>성별 : ${loginUser.gender}</div>
		<div>가입날짜 : <fmt:formatDate value="${loginUser.indate}" type="date"/></div>
	</div>
	<div class="mypageBox" style="top:20px; left:340px; ">
		<h2>연락처 및 알림</h2>
		<div>이메일 : ${loginUser.email}</div>
		<div>전화번호 : ${loginUser.phone}</div>
	</div>
	<div class="mypageBox" style="top:350px; ">
		<h2>배송지 관리</h2>
		<div>지번 : ${loginUser.zip_num}</div>
		<div>주소 : ${loginUser.address}</div>
	</div>
	<div class="mypageBox" style="top:350px; left:340px;">
		<h2>주문 관리</h2>
		<div><a href="#">주문 목록 / 배송 조회</a></div>
		<div><a href="#">취소/반품/교환/환불 내역</a></div>
		<div><a href="#">문의하기</a></div>
	</div>
</div>


<%@ include file="../footer.jsp"%>