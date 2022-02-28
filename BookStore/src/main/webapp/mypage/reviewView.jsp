<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<%@ include file="sub_menu.jsp" %>

<div id="reviewView">
<article>
<h2 style="color:green;">&nbsp;<b>나의 리뷰</b></h2><hr>
<form name="formm" method="post">
<table id="View2">
	<tr><th>id</th><td width="600" style="text-align:left;">${reviewVO.id}</td></tr>
	<tr><th>작성일</th><td align="left" style="text-align:left;">
		<fmt:formatDate value="${reviewVO.rindate}" type="date"/></td></tr>
	<tr><th>별점</th><td align="left" style="text-align:left;">${reviewVO.score}</td></tr>
	<tr><th>내용</th><td align="left" style="text-align:left; font-size:115%;">
		<pre>${reviewVO.rcontent}</pre></td></tr>	
</table>
<div class="clear"></div>
<div id="buttons5" style="float:right">
	<input type="button" value="목록보기" class="submit" onclick="location.href='bs.do?cmd=reviewList'">
	<input type="button" value="쇼핑 계속하기" class="cancel" onclick="location.href='bs.do?cmd=index'">
</div>
</form>
</article>
</div>


<%@ include file="../footer.jsp" %>