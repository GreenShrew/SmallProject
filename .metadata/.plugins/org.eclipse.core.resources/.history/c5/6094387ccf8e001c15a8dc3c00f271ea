<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../header.jsp"%>
<%@ include file="product_left.jsp"%>

<br><br><br>
<div id="product_Area">
	<div style="height:20px;"></div>
	<c:forEach items="${globalviewList}" var = "pvo" varStatus="stat">
		<form class="bookbox" name="frm">
			<input type="hidden" value="${pvo.bseq }">
			<div class="bookboximg" onClick="">
				<img alt="" src="images/book/${pvo.image}">
			</div>
			<div class="bookboxright">
				<div class="bookboxlist">
					<div>[${pvo.genre}]&nbsp;${pvo.bname}</div>
				</div>
				<div class="bookboxlist">
					<div>${pvo.writer}&nbsp;저&nbsp;|&nbsp;${pvo.publisher}</div>
				</div>
				<div class="bookboxlist"><fmt:formatNumber value="${pvo.price}" type="currency"/></div>
				<div class="bookboxlist"><%-- ${pvo.reviewcnt } --%>reviewcnt</div>
				<div class="bookboxlist"><%-- ${pvo.score} --%>score</div>
			</div>
			<div class="bookboxbtn">
				<div><a href="#" onClick="">상세보기</a></div>
				<div><a href="#" onClick="">바로구매</a></div>
				<div><a href="bs.do?cmd=cartInsert&bseq=${pvo.bseq}&quantity=1" onClick="">장바구니</a></div>
			</div>
		</form>
	</c:forEach>
</div>


<%@ include file="../footer.jsp"%>