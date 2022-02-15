<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="adminHeader.jsp" %>

<div id="adminBox">
	<h2>dash board</h2>
	<div class="mainNotice">
		<label>공지사항<a href="#">Edit</a></label>
		<span>공지사항1 contentqwerqwerqwerqwerqwerqwerqwer</span>
		<span>공지사항2 contentqwerqwerqwerqwerqwerqwerqwer</span>
		<span>공지사항3 contentqwerqwerqwerqwerqwerqwerqwer</span>
		<span>공지사항4 contentqwerqwerqwerqwerqwerqwerqwer</span>
	</div>
	<div class="mainTotal">
		<label>회원수<a href="#">Edit</a></label>
		<span>${cnt.get(0)}</span>
	</div>
	<div class="mainTotal">
		<label>상품수<a href="#">Edit</a></label>
		<span>${cnt.get(1)}</span>
	</div>
	<div class="mainTotal">
		<label>미처리 주문수<a href="#">Edit</a></label>
		<span>${cnt.get(2)}</span>
	</div>
	<div class="mainTotal">
		<label>미처리 QnA<a href="#">Edit</a></label>
		<span>${cnt.get(3)}</span>
	</div>
</div>

<%@ include file="adminFooter.jsp" %>