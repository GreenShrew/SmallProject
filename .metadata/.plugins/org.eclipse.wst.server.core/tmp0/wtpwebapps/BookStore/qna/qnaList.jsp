<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<%@ include file="sub_img.html"%> 
<%@ include file="sub_menu.jsp" %>

<div id="qna">
	<article>
	<h2>고객센터</h2><hr>
	<h3>청년문고 <span style="color:green;">온라인 고객센터</span> 입니다.</h3>
	<form name="formm" method="post">
	<h3><span style="color:green;">■</span> 공지사항<input type="button" value="+더보기" id="plus" style="background-color:white; border: 1px solid #fff;" onClick="location.href='bs.do?cmd=noticeList'"></h3> 	
		<ul>
			<li><a href="bs.do?cmd=noticeList">청년문고 공지사항</a></li>
		</ul>
		<hr><br>
	<h3><span style="color:green;">■</span> 1:1 고객상담</h3>
	<div class="mybox" style="border:2px solid #AAAAAA; padding:10px;">
		<h4>질문해주시면 신속하게 답변해드립니다.<br><span style="color:green;">근무시간(월~금 9:00 ~ 18:00)이후의 문의사항은 근무시간 중에 답변되오니 양해 부탁드립니다.</span></h4>
		<table id="qnaList">
			<tr><th>번호</th><th>제목</th><th>등록일</th><th>답변여부</th>
			<c:forEach items="${qnaList}" var = "qnaVO" >
				<tr><td>${qnaVO.qseq}</td>
					<td><a href="bs.do?cmd=qnaView&qseq=${qnaVO.qseq}">${qnaVO.subject}</a></td>
					<td><fmt:formatDate value="${qnaVO.indate}" type="date"/></td>
					<td><c:choose>
						<c:when test="${qnaVO.rep==1}">no</c:when>
						<c:when test="${qnaVO.rep==2}">yes</c:when>
					</c:choose></td>
				</tr>
			</c:forEach>
		</table>
		<div class="clear"></div>
		<div id="buttons2" style="float:right">
			<input type="button" value="1:1 질문하기" id="submit" onClick="location.href='bs.do?cmd=qnaWriteForm'">
			<input type="button" value="쇼핑 계속하기" id="cancel" onclick="location.href='bs.do?cmd=index'">
		</div>
	</div>
	<br><br><br>
<!-- 	<img src="images/qna/customer1.png" style="width:700px; height:300px;"> -->
	</form>
	</article>



	
<%@ include file="../footer.jsp" %>