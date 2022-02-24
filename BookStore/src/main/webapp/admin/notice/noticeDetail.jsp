<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/admin/adminHeader.jsp"%>
<article>
<br><br><br>
<h1 style="text-align: center;">공지사항</h1>
<form name="frm" method="post">
<input type="hidden" name="nseq" value="${noticeVO.nseq}">
<table id="qqnaList1"> <!-- 게시물의 내용 -->
	<tr><th width="20%">제목</th><td align="left">${noticeVO.subject}</td></tr>
	<tr><th>등록일</th><td align="left"><fmt:formatDate value="${noticeVO.indate}"/></td></tr>
	<tr><th>내용</th><td align="left">${noticeVO.content}</td></tr>
</table>

<input type="button" class="btn2" value="목록" onClick="location.href='bs.do?cmd=adminNoticeList'">
</form>
</article>


<%@ include file="/admin/adminFooter.jsp"%>