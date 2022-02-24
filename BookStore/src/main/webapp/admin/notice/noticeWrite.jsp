<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/admin/adminHeader.jsp"%>
<article>
<br><br><br>
<h1 style="text-align: center;">공지사항</h1>
<div id="write">
	<form name="formm" method="post" action="adminNoticeWrite">
		<input type="hidden" name="cmd" value="adminNoticeWrite">
			<fieldset>
				<legend>공지사항 작성</legend>
				<label>Title</label><input type="text" name="subject" size="60"><br>
				<label>Content</label><textarea rows="8" cols="65" name="content"></textarea>
			</fieldset>
		<div class="clear"></div>
		<div id="btn1" style="float:right">
			<input type="submit"  value="글쓰기"   class="button" onclick="go_notice()"> 
			<input type="button"  value="공지사항 홈"  class="submit" onclick="location.href='bs.do?cmd=adminNoticeList'">
		</div>
	</form>
</div>
</article>





<%@ include file="/admin/adminFooter.jsp"%>