<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/admin/adminHeader.jsp"%>
<article>
<br><br><br>
<h1 style="text-align: center;">Q&amp;A 게시글 리스트</h1>
<form name="frm" method="post">
<table id="searchbox1" style="float:right;">
	<tr><td>제목+내용 검색
		<input type="text" name="key" value="${key}">
			<input class="btn1" type="button" value="검색"   onClick="go_search('adminQnaList');">
			<input class="btn1" type="button" value="전체보기 "  onClick="go_total('adminQnaList');">
	</td></tr>
</table>
<table id="qqnaList">
	<tr><th>번호(답변여부)</th><th>제목</th><th>작성자</th><th>작성일</th></tr>
	<c:forEach items="${qnaList}" var="qnaVO">
		<tr><td>${qnaVO.qseq}
			<c:choose>
				<c:when test='${qnaVO.rep=="1"}'>(미처리)</c:when>
				<c:otherwise>(답변처리완료)</c:otherwise>
			</c:choose></td>
			<td><a href="bs.do?cmd=adminQnaDetail&qseq=${qnaVO.qseq}">${qnaVO.subject}</a></td>
			<td>${qnaVO.id}</td><td><fmt:formatDate value="${qnaVO.indate}"/></td></tr>
	</c:forEach>
</table><br>
	<jsp:include page="/admin/paging/admin_paging.jsp">
		<jsp:param name="cmd" value="bs.do?cmd=adminQnaList" />
	</jsp:include>


</form>


</article>




<%@ include file="/admin/adminFooter.jsp"%>