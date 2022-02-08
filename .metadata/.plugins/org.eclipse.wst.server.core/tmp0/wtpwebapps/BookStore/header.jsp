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
<script src="css/test.js"></script>
<script src="member/member.js"></script>
<script src="mypage/mypage.js"></script>
</head>
<body>
<div id="wrap">
	<header>
		<div>
			<nav id="top_menu">
				<ul>
					<li><a href="bs.do?cmd=qna" style="border:0px;">고객센터</a></li>
					<li><a href="bs.do?cmd=orderView" style="width:80px;">주문/배송조회</a></li>
					<li><a href="bs.do?cmd=cart">장바구니</a></li>
					<li><a href="bs.do?cmd=joinForm">회원가입</a></li>
					<li><a href="bs.do?cmd=loginForm">로그인</a></li>
					<li><a href="bs.do?cmd=mypage">마이페이지</a></li>
				</ul>
			</nav>
		</div>
		<br><br>
		
		<!-- 검색창 -->
		<div id="top">
			<div id="logo">
				<a href="bs.do?cmd=index"><img alt="" src="images/main/logo.png"></a>
			</div>
			<div id="search">
			<!--
				<div id="drop">
					<a href="#" class="dbutton">통합검색</a>
					<ul>
						<li><a href="#">통합검색</a></li>
						<li><a href="#">국내도서</a></li>
						<li><a href="#">외국도서</a></li>
						<li><a href="#">리뷰</a></li>
					</ul>
				</div>  -->
				
				<!-- 
				<div class="dropdown">
			      <span class="dropbtn">drop down</span>
			      <div class="dropdown-content">
			        <a href="#">link 1</a>
			        <a href="#">link 2</a>
			        <a href="#">link 3</a>
			      </div>
			    </div>
			     -->
			     
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
		
		<div>
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