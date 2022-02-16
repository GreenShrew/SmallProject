<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BookStore</title>
<link rel="stylesheet" href="css/book.css">
<script src="script/jquery-3.6.0.js"></script>
<script src="script/main.js"></script>
<script src="member/member.js"></script>
<script src="mypage/mypage.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<div id="wrap">
	<header>
		<div>
			<nav id="top_menu">
				<ul>
					<li><a href="bs.do?cmd=qnaList" style="border:0px;">고객센터</a></li>
					<li><a href="bs.do?cmd=orderAll" style="width:80px;">주문/배송조회</a></li>
					<li><a href="bs.do?cmd=cartList">장바구니</a></li>
					<c:choose>
						<c:when test="${empty loginUser}">
							<li><a href="bs.do?cmd=contract">회원가입</a></li>
							<li><a href="bs.do?cmd=loginForm">로그인</a></li>
						</c:when>
						<c:otherwise>
							<li><a href="bs.do?cmd=editForm">정보수정</a></li>
							<li> &nbsp; ${loginUser.name}(${loginUser.id}) </li> 
							<li><a href="bs.do?cmd=logout">로그아웃</a></li>
						</c:otherwise>
					</c:choose>
					<li><a href="bs.do?cmd=mypage">마이페이지</a></li>
				</ul>
			</nav>
		</div>
		<br><br>
		
		<!-- 검색창 -->
		<div id="top">
			<div id="logo">
				<a href="bs.do?cmd=index"><img alt="" src="images/main/logo.png" style="width:248px; height:100%;"></a>
			</div>
			<div id="search">
			    <div class="day_box">
					<select id="day_font">
					   <option>통합검색</option>
					   <option>국내도서</option>
					   <option>외국도서</option>
					   <option>리뷰</option>
					</select>
					<input type="text" id="searchbox" placeholder="검색어입력"/>
					<input type="button" id="button1" onClick=""/>
				</div>	
			</div>
		</div>
		<br><br>
		<br><br>
		
		<div id="main_menu">
			<nav id="index_menu">
				<ul class="menu">
					<li><a href="bs.do?cmd=menu&kind=1">베스트도서</a></li>
					<li><a href="bs.do?cmd=menu&kind=2">신간도서</a></li>
					<li><a href="bs.do?cmd=menu&kind=3">국내도서</a></li>
					<li><a href="bs.do?cmd=menu&kind=4">외국도서</a></li>
					<li><a href="bs.do?cmd=menu&kind=5">이벤트</a></li>
				</ul>
			</nav>
		</div>
	</header>




<!-- </div> -->