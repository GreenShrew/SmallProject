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
<article>
<h1>Login</h1>
<form method="post" action="bs.do" name="loginFrm">
	<input type="hidden" name="cmd" value="login">
	
	<fieldset>
		<legend></legend>
			<label>User ID</label><input name="id" type="text"><br> 
	        <label>Password</label><input name="pwd" type="password"><br>
	</fieldset>
	<div id="buttons">
            <input type="submit" value="로그인" class="submit" 	onclick="return loginCheck()">
            <input type="button" value="회원가입" class="cancel" onclick="location.href='bs.do?cmd=contract'">
            <input type="button" value="아이디 비밀번호 찾기" class="submit" onclick="find_account()">     
    </div><br><br>
    <div>&nbsp;&nbsp;&nbsp;${message}</div>
</form>
</article>

<%@ include file="../footer.jsp" %>