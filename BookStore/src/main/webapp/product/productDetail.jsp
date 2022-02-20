<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../header.jsp"%>
<%@ include file="product_left.jsp"%>


<br><br><br>
<div id="product_Area">
	<div style="height:20px;"></div>
	<div style="width: 700px;"></div>
		<form class="detailbox" name="pdfrm1">
			<input type="hidden" value="${productVO.bseq }">
			<div class="pdLeft">
				<img alt="" src="images/book/${productVO.image }">
			</div>
			<div class="pdRight">
				<div class="pdRightList" style="font-size:140%; font-weight:bold;">[${productVO.genre}]&nbsp;${productVO.bname }</div>
				<div class="pdRightList"style="font-size:90%; color:gray;">
					<div>저자 : ${productVO.writer}</div>
					<div>&nbsp;|&nbsp;</div>
					<div>출판사 : ${productVO.publisher }</div>
				</div>
				<div class="pdRightList" style="font-size:90%; color:gray;">
					<fmt:formatDate value="${productVO.indate }" type="date"/></div>
				<div class="pdRightList" style="font-size:120%; color:red; font-weight:bold;">
					<fmt:formatNumber value="${productVO.price }" type="currency"/></div>
				<div class="pdRightList" style="font-size:90%; color:gray;">적립금 : 
					<fmt:formatNumber value="${point}" type="currency"/></div>
				<div class="pdRightList" style="font-size:90%; color:gray;">
					<div class="pdRightreview">평점 평균&nbsp;</div>
					<div class="pdRightreview" style="top:14px;">
						<c:choose>
							<c:when test="${scoreAVG == 1}">
								<div class="starimg"></div></c:when>
							<c:when test="${scoreAVG == 2}">
								<div class="starimg"></div>
								<div class="starimg"></div></c:when>
							<c:when test="${scoreAVG == 3}">
								<div class="starimg"></div>
								<div class="starimg"></div>
								<div class="starimg"></div></c:when>
							<c:when test="${scoreAVG == 4}">
								<div class="starimg"></div>
								<div class="starimg"></div>
								<div class="starimg"></div>
								<div class="starimg"></div></c:when>
							<c:when test="${scoreAVG == 5}">
								<div class="starimg"></div>
								<div class="starimg"></div>
								<div class="starimg"></div>
								<div class="starimg"></div>
								<div class="starimg"></div></c:when>
						</c:choose>
					</div>
					<div class="pdRightreview">
						&nbsp;| &nbsp;리뷰수 <fmt:formatNumber value="${reviewCnt }"/>
					</div>
				</div>
			</div>
			<div class="list_in" style="width:130px; padding:100px 0px 0px 0px; ">
				수량
				<input type="text" id="quantity" name="quantity" maxlength="2" value="1">
				개
			</div>
			<div class="list_in" style="width:140px; padding:40px 0px 0px 0px;">
				<a href="javascript:cartpyn(${productVO.bseq});">장바구니</a>
				<a href="javascript:buypyn(${productVO.bseq});">바로구매</a>
			</div>
		</form>
		<div class="pdbott">
			<ol>
				<li id="pd1">
					<a href="#pd1">이책의 분류</a>
					<a href="#pd2" style="background-color:white; color: green;">도서 정보</a>
					<a href="#pd3" style="background-color:white; color: green;">독자 서평</a></li>
				<li>
					<div class="pdcontent">[ 종류 : ${productVO.kind} ] | [ 장르 : ${productVO.genre } ]</div>
				</li>
				<li id="pd2">
					<a href="#pd1" style="background-color:white; color: green;">이책의 분류</a>
					<a href="#pd2">도서 정보</a>
					<a href="#pd3" style="background-color:white; color: green;">독자 서평</a></li>
				<li>
				<li>
					<div class="pdcontent" style="padding-right:20px;">
						${productVO.content }
					</div>
				</li>
				<li id="pd3">
					<a href="#pd1" style="background-color:white; color: green;">이책의 분류</a>
					<a href="#pd2" style="background-color:white; color: green;">도서 정보</a>
					<a href="#pd3">독자 서평</a></li>
				<li>
				<li>
					<form name="pdfrm2" method="post" style="padding:60px 0px 0 20px;">
						<input type="hidden" name="cmd" value="writeReview">
						<input type="hidden" name="id" value="${loginUser.id }">
						<input type="hidden" name="bseq" value="${productVO.bseq }">
						<div>독자서평 쓰기</div>
						<c:choose>
							<c:when test="${empty loginUser}">
								<br>
								<p>로그인을 하시면 독자서평을 작성할 수 있습니다</p>
								<a href="bs.do?cmd=loginForm" class="pdto_login">로그인하기</a>
								<br><br><br>
							</c:when>
							<c:otherwise>
								<br>
								<div>도서평점</div>
								<div id="radio_score">
									<input type="radio" value="1" name="radio_review">
									<div class="starimg"></div>
									<input type="radio" value="2" name="radio_review">
									<div class="starimg"></div>
									<div class="starimg"></div>
									<input type="radio" value="3" name="radio_review">
									<div class="starimg"></div>
									<div class="starimg"></div>
									<div class="starimg"></div>
									<input type="radio" value="4" name="radio_review">
									<div class="starimg"></div>
									<div class="starimg"></div>
									<div class="starimg"></div>
									<div class="starimg"></div>
									<input type="radio" value="5" name="radio_review">
									<div class="starimg"></div>
									<div class="starimg"></div>
									<div class="starimg"></div>
									<div class="starimg"></div>
									<div class="starimg"></div>
								</div>
								<br>
								<div>
									내용
									<br>
									<textarea id="review_content" name="review_content" cols="70" rows="6"
									placeholder="독자서평은 열 글자 이상 입력하셔야 합니다."></textarea>
									<a onClick="writeReview()" class="pd_review_btn">등록하기</a>
								</div>
							</c:otherwise>
						</c:choose>
					</form>
					<br>
					<br>
					<c:forEach items="${reviewList }" var="rvo" varStatus="stat">
						<div id="reviewbox" style="border: 0.5px dashed gray;">
							<ul>
								<li>${rvo.id }</li>
								<li>&nbsp;|&nbsp;</li>
								<li style="padding-top:2px;">
									<c:choose>
										<c:when test="${rvo.score == 1}">
											<div class="starimg"></div></c:when>
										<c:when test="${rvo.score == 2}">
											<div class="starimg"></div>
											<div class="starimg"></div></c:when>
										<c:when test="${rvo.score == 3}">
											<div class="starimg"></div>
											<div class="starimg"></div>
											<div class="starimg"></div></c:when>
										<c:when test="${rvo.score == 4}">
											<div class="starimg"></div>
											<div class="starimg"></div>
											<div class="starimg"></div>
											<div class="starimg"></div></c:when>
										<c:when test="${rvo.score == 5}">
											<div class="starimg"></div>
											<div class="starimg"></div>
											<div class="starimg"></div>
											<div class="starimg"></div>
											<div class="starimg"></div></c:when>
									</c:choose>
								</li>
								<li>&nbsp;|&nbsp;</li>
								<li style="margin-right:60px;">${rvo.rindate }</li>
							</ul>
							<textarea cols="50" rows="4" readonly>${rvo.rcontent }</textarea>
						</div>
					</c:forEach>
				</li>
			</ol>
		</div>
</div>


<%@ include file="../footer.jsp"%>