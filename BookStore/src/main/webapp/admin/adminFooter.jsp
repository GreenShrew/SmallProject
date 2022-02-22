<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- admin side bar -->
<div id="adminSideBar">
	<ul>
		<li class="sideList">
			<div class="sideTitle">
				<span>대시보드</span>
				<div class="listbutton"></div>
			</div>
			<ul>
				<li><a href="bs.do?cmd=adminMain">Main</a></li>
				<li><a href="bs.do?cmd=adminNoticeList">공지사항 목록</a></li>
				<li><a href="bs.do?cmd=adminAdminMemUpdate">관리자계정수정</a></li>
			</ul>
		</li>
		<li class="sideList">
			<div class="sideTitle">
				<span>회원 관리</span>
				<div class="listbutton"></div>
			</div>
			<ul>
				<li><a href="bs.do?cmd=adminMemberList">회원목록</a></li>
				<li><a href="bs.do?cmd=adminMemberList&key=n">휴면계정</a></li>
				<li><a href="bs.do?cmd=adminMemberUpdate">회원수정</a></li>
			</ul>
		</li>
		<li class="sideList">
			<div class="sideTitle">
				<span>상품 관리</span>
				<div class="listbutton"></div>
			</div>
			<ul>
				<li><a href="bs.do?cmd=adminProductList&sub=y">상품목록</a></li>
				<li><a href="bs.do?cmd=adminProductBestList">베스트상품</a></li>
				<li><a href="bs.do?cmd=adminProductUpload">상품등록</a></li>
			</ul>
		</li>
		<li class="sideList">
			<div class="sideTitle">
				<span>주문 관리</span>
				<div class="listbutton"></div>
			</div>
			<ul>
				<li><a href="bs.do?cmd=adminOrderList&kind=1">회원 미처리 주문목록</a></li>
				<li><a href="bs.do?cmd=adminOrderList&kind=2">회원 처리 주문목록</a></li>
				<li><a href="bs.do?cmd=adminOrderList&kind=3">비회원 미처리 주문목록</a></li>
				<li><a href="bs.do?cmd=adminOrderList&kind=4">비회원 처리 주문목록</a></li>
			</ul>
		</li>
		<li class="sideList">
			<div class="sideTitle">
				<span>qna 관리</span>
				<div class="listbutton"></div>
			</div>
			<ul>
				<li><a href="bs.do?cmd=adminQnaList">qna 목록</a></li>
			</ul>
		</li>
	</ul>
</div>


 <!-- adminFrame -->
<!--  -->
</div>
</body>
</html>