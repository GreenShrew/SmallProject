<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="header.jsp"%>
<br><br><br>
<div id="mainFrame">
	<div id="view">
        <div id="imgs">
            <a href="#1"><img src="images/main/main_s1.png"></a><a href="#2"><img src="images/main/main_s2.png"></a><a href="#3"><img src="images/main/main_s3.png"></a><a href="#4"><img src="images/main/main_s4.png"></a><a href="#5"><img src="images/main/main_s5.png"></a><a href="#6"><img src="images/main/main_s6.png"></a>
        </div>
        <div id="lbutton" onClick="moveLeft();"></div>
        <div id="rbutton" onClick="moveRight();"></div>
    </div>
	<div class="main_paging"></div>
	<br><br>
	<div class="tab">
	    <ul>
	        <li data-id="con1" class="on">베스트셀러</li>
	        <li data-id="con2">신간도서</li>
	        <li data-id="con3">추천도서</li>
	    </ul>
	    <div id="con1" class="conBox on">
			<div id="bestProduct">
				<c:forEach items="${bestList}" var = "productVO" >
					<div class="book">
						<div class="bookimgs" onClick="toDetail(${productVO.bseq})">
							<img alt="" src="images/book/${productVO.image}" style="width:162px; height:230px;">
						</div>
						<div class="booktitle" onClick="toDetail(${productVO.bseq})">${productVO.bname}</div>
						<div class="bookwrite" onClick="toDetail(${productVO.bseq})">${productVO.writer}</div>
						<div class="bookprice" onClick="toDetail(${productVO.bseq})"><fmt:formatNumber value="${productVO.price}" type="currency"/></div>
						<div class="overview">
							<div class="tocart" onClick="cartyn(${productVO.bseq})">cart</div>
							<div class="tobuy" onClick="buyyn(${productVO.bseq})">buy now</div>
						</div>
					</div>
				</c:forEach>
			</div>
	    </div>
	    <div id="con2" class="conBox">
			<div id="bestProduct">
				<c:forEach items="${newList}" var = "productVO" >
					<div class="book">
						<div class="bookimgs" onClick="toDetail(${productVO.bseq})">
							<img alt="" src="images/book/${productVO.image}" style="width:162px; height:230px;">
						</div>
						<div class="booktitle" onClick="toDetail(${productVO.bseq})">${productVO.bname}</div>
						<div class="bookwrite" onClick="toDetail(${productVO.bseq})">${productVO.writer}</div>
						<div class="bookprice" onClick="toDetail(${productVO.bseq})"><fmt:formatNumber value="${productVO.price}" type="currency"/></div>
						<div class="overview">
							<div class="tocart" onClick="cartyn(${productVO.bseq})">cart</div>
							<div class="tobuy" onClick="buyyn(${productVO.bseq})">buy now</div>
						</div>
					</div>
				</c:forEach>
			</div>
	    </div>
	    <div id="con3" class="conBox">
			<div id="bestProduct">
				<c:forEach items="${recommandList}" var = "productVO" >
					<div class="book">
						<div class="bookimgs" onClick="toDetail(${productVO.bseq})">
							<img alt="" src="images/book/${productVO.image}" style="width:162px; height:230px;">
						</div>
						<div class="booktitle" onClick="toDetail(${productVO.bseq})">${productVO.bname}</div>
						<div class="bookwrite" onClick="toDetail(${productVO.bseq})">${productVO.writer}</div>
						<div class="bookprice" onClick="toDetail(${productVO.bseq})"><fmt:formatNumber value="${productVO.price}" type="currency"/></div>
						<div class="overview">
							<div class="tocart" onClick="cartyn(${productVO.bseq})">cart</div>
							<div class="tobuy" onClick="buyyn(${productVO.bseq})">buy now</div>
						</div>
					</div>
				</c:forEach>
			</div>
	    </div>
	</div>
</div>



<%@ include file="footer.jsp"%>