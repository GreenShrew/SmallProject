<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<%@ include file="sub_menu.jsp" %>

<div id="qna">
	<article>
	<h2>공지사항&nbsp;</h2>
	<hr>
	<h3><span style="color:green;">■</span> 공지사항</h3>
	<form name="formm" method="post">
		<table id="noticeList">
			<tr><th>번호</th><th>제목</th><th>등록일</th><th>&nbsp;</th>
			<c:forEach items="${noticeList}" var = "noticeVO">
				<tr><td>${noticeVO.nseq}</td>
					<td><a href="bs.do?cmd=noticeView&nseq=${noticeVO.nseq}">${noticeVO.subject}</a></td>
					<td><fmt:formatDate value="${noticeVO.indate}" type="date"/></td>
				</tr>
			</c:forEach>
		</table>
		<div class="clear"></div>
		<div id="buttons3" style="float:right">
			<input type="button" value="쇼핑 계속하기" id="cancel" style=""onclick="location.href='bs.do?cmd=index'">
			<input type="button" value="이전으로" id="submit" onclick="location.href='bs.do?cmd=qnaList'">
			
		</div>
	</form>
	</article>
</div>


<%@ include file="../footer.jsp" %>