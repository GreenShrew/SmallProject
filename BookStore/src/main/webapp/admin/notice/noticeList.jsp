<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/admin/adminHeader.jsp"%>
<article>
<br><br><br>
<h1 style="text-align: center;">공지사항 리스트</h1>
<form name="frm" method="post">
<table id="searchbox1" style="float:right;">
	<tr><td>제목+내용 검색
		<input type="text" name="key" value="${key}">
			<input class="btn1" type="button" value="검색"   onClick="go_search('adminNoticeList');">
			<input class="btn1" type="button" name="btn_total" value="전체보기 "  onClick="go_total('adminNoticeList');">
			<input class="btn1" type="button" name="write" value="작성 "  onClick="location.href='bs.do?cmd=adminNoticeWriteForm'">
	</td></tr>
</table>
<table id="qqnaList">
	<tr><th>번호</th><th>제목</th><th>작성자</th><th>작성일</th></tr>
	<c:forEach items="${noticeList}" var="noticeVO">
		<tr><td>${noticeVO.nseq}
			<td><a href="bs.do?cmd=adminNoticeDetail&nseq=${noticeVO.nseq}">${noticeVO.subject}</a></td>
			<td>${noticeVO.id}</td><td><fmt:formatDate value="${noticeVO.indate}"/></td></tr>
	</c:forEach>
</table><br>
	<jsp:include page="/admin/paging/admin_paging.jsp">
		<jsp:param name="cmd" value="bs.do?cmd=adminNoticeList" />
	</jsp:include>
</form>

</article>




<%@ include file="/admin/adminFooter.jsp"%>