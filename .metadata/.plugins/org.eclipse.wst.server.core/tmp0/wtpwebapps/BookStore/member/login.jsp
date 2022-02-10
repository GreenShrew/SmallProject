<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<c:if test="${not empty message}">
	<script>
		var message = "<c:out value='${message}'/>"; 
		$(document).ready(function(){
	    	alert(message);
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
		   <form style="top:30px;">
				<div><input class="logininput" type="text" name="id" placeholder="아이디"></div>
				<div><input class="logininput" type="text" name="password" placeholder="비밀번호"></div>
				<div class="checkbox">
					<input type="checkbox" name="maintainLogin">
					로그인 상태 유지
					<input type="checkbox" name="remember_id">
					아이디 저장
				</div>
				<div><input class="login_btn" type="button" value="로그인" onClick=""></div>
				<div>
					<a href="#">아이디 찾기</a>
					<a href="#">회원가입</a>
					<a href="#">비밀번호 찾기</a>
				</div>
		   </form>
	    </div>
	    <div id="nonmemberLogin" class="conBox">
	    	<form>
    			<div><input class="logininput" type="text" name="phone" placeholder="전화번호"></div>
    			<div><input class="logininput" type="text" name="od_pass" placeholder="주문번호"></div>
				<div><input class="login_btn" type="button" value="확인" onClick=""></div>
				<div><a href="#">주문번호 찾기</a></div>
	    	</form>
	    </div>
    </div>
</div>

<%@ include file="../footer.jsp" %>