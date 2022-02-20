<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<script src="../script/jquery-3.6.0.js"></script>
<style type="text/css">
	
	#sidemenu{float:left; width:150px; border:1px solid black;}
	#sidemenu div{position:relative; float:left; width:120px; height:40px; padding-left:20px; font-size:120%; line-height:30px; }
	#sidemenu ul{position:relative; width:100%; height:1px; padding:0px 0px 0px 10px; /* border:1px solid black; */
	visibility:hidden;}
	#sidemenu ul li{height:1px; list-style:none; padding:4px; position:relative;
	font-size:65%;}
	
</style>


<div id="sidemenu">
	<h1 style="padding-left:20px;">MyPage</h1>
	<div>쇼핑
		<ul>
			<li><a href="#">주문목록</a></li>
			<li><a href="#">배송조회</a></li>
			<li><a href="#">취소/반품/<br>교환/환불내역</a></li>
		</ul>
	</div>
	<div>혜택
		<ul>
			<li><a href="#">포인트 조회</a></li>
			<li><a href="#">포인트 사용내역</a></li>
		</ul>
	</div>
	<div>활동
		<ul>
			<li><a href="#">문의하기</a></li>
			<li><a href="#">문의목록</a></li>
			<li><a href="#">리뷰관리</a></li>
		</ul>
	</div>
	<div>정보
		<ul>
			<li><a href="#">정보 수정</a></li>
			<li><a href="#">결제 수단</a></li>
			<li><a href="#">배송지 관리</a></li>
		</ul>
	</div>
</div>

<script type="text/Javascript">
$(function test(){
	$("#sidemenu div").hover(
		function(){
			var i = $(this).index("#sidemenu div");
			$("#sidemenu div").eq(i).css({"height":"150px"});
			$("#sidemenu ul").eq(i).css({"visibility":"visible", "heigth":"140px"});
			$("#sidemenu ul li").css({"height":"30px"});
		},
		function(){
			$("#sidemenu div").css({"height":"40px"});
			$("#sidemenu ul").css({"visibility":"hidden", "heigth":"1px"});
			$("#sidemenu ul li").css({"height":"1px"});
		}
	);
});
</script>
