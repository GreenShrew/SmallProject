<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ include file="findHeader.jsp" %>
<body>
<div id="findMain">
	<div class="result">
		<div class="resultBox">
			<span class="resultText">${MemberVO.id}</span>님의 비밀번호는<br>
			<span class="resultText">${MemberVO.pwd}</span> 입니다.
		</div>
		<div class="resultBox1">
			<input type="button" value="로그인" onClick="location.href='bs.do?cmd=loginForm'">
		</div>
	</div>
</div>
</body>

