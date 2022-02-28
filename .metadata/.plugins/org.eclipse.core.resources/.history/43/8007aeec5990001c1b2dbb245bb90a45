<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<c:if test="${not empty msg}">
	<script>
/* 		var msg = "<c:out value='${msg}'/>";  */
		$(document).ready(function(){
	    	alert(${msg});
	    });
	</script>
</c:if>

 
<div class="tab" style="top: 100px; width:400px; height:450px; background-color:#eef5eb">
    <ul>
        <li style="width:50%;" data-id="userLogin" class="on">회원</li>
        <li style="width:50%;" data-id="nonmemberLogin">비회원 주문확인</li>
    </ul>
    <div id="login">
	    <div id="userLogin" class="conBox on">
		   <form style="top:30px;" action="bs.do" method="post" name="loginFrm">
			<input type="hidden" name="cmd" value="login" />
				<div><input class="logininput" type="text" name="id" placeholder="아이디"></div>
				<div><input class="logininput" type="password" name="pwd" placeholder="비밀번호"></div>
				<div class="checkbox">
					<input type="checkbox" name="maintainLogin">
					로그인 상태 유지
					<input type="checkbox" name="remember_id">
					아이디 저장
				</div>
				<div><input class="login_btn" type="submit" value="로그인" onClick="loginCheck()"></div>
				<br><br>
				<div class="login_a">
					<a href="bs.do?cmd=contract">회원가입</a>
					<a href="bs.do?cmd=findId">아이디 찾기</a>
					<a href="bs.do?cmd=findPwd">비밀번호 찾기</a>
				</div>
		   </form>
	    </div>
	    <div id="nonmemberLogin" class="conBox">
	    	<form action="bs.do" method="post" name="nonmemloginFrm">
    			<div><input class="logininput" type="text" name="phone" placeholder="전화번호"></div>
    			<div><input class="logininput" type="text" name="od_pass" placeholder="주문번호"></div>
				<div><input class="login_btn" type="submit" value="확인" onClick="nonmemCheck()"></div>
				<br><br>
				<div><a href="#">주문번호 찾기</a></div>
	    	</form>
	    </div>
    </div>
</div>

<%@ include file="../footer.jsp" %>