<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div id="sidemenu">
	<h1 style="padding-left:20px;">MyPage</h1>
	<div>쇼핑
		<ul>
			<li><a href="bs.do?cmd=orderAll">주문목록</a></li>
			<li><a href="bs.do?cmd=tracking">배송조회</a></li>
			<li><a href="bs.do?cmd=cancelList">취소내역</a></li>
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
			<li><a href="bs.do?cmd=qnaList">문의하기</a></li>
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
