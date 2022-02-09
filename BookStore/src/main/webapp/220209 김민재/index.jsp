<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <title>JS Bin</title>

<div class="product">


<!-- 상단 배너 -->
 <button onclick="banner2()">확인</button>
	<div class="banner">
			<img src="images/banner/1.jpg" id="abc" value='1'>
		<!-- 하단은 jQuery로 할 예정이라면...? -->
		<!--
 		<div class="banner" id="2" value="2">
			<img src="images/banner/4.jpg"><img src="images/banner/5.jpg"><img src="images/banner/6.jpg">
		</div>
		 
		<div value="3">
			<img src="images/banner/7.jpg" id="abc"><img src="images/banner/8.jpg" id="abc"><img src="images/banner/9.jpg" id="abc">
		</div>
	 -->

	</div>
	<div id="lbutton" onClick="move(-1);"></div>
    <div id="rbutton" onClick="move(1);"></div>



	<div class="tab">
	    <ul>
	        <li data-id="con1" class="on">베스트셀러</li>
	        <li data-id="con2">신간도서</li>
	        <li data-id="con3">추천도서</li>
	    </ul>
	    <div id="con1" class="conBox on">
	        <h3>베스트셀러</h3>   
		<div id="bestProduct">
			<c:forEach items="${bestList}" var = "productVO" >
				<div id="item"> 
					<a href="bs.do?cmd=productDetail&bseq=${productVO.bseq}">
						<img src="images/book/${productVO.image}" />
						<h3> ${productVO.bname} - <fmt:formatNumber value="${productVO.price}" type="currency" /></h3>
					</a>
				</div>
			</c:forEach>
		</div>
	    </div>
	    <div id="con2" class="conBox">
	        <h3>신간</h3>   
	<div id="bestProduct">
		<c:forEach items="${newList}"  var = "productVO" >
			<div id="item"> 
				<a href="bs.do?cmd=productDetail&bseq=${productVO.bseq}">
					<img src="images/book/${productVO.image}" />
					<h3> ${productVO.bname} - <fmt:formatNumber value="${productVO.price}" type="currency" /></h3>
				</a>
			</div>
		</c:forEach>
	</div>
	    </div>
	    <div id="con3" class="conBox">
	        cont3
	    </div>
	</div>
</div>

<script>
    $(function(){
        $(".tab ul li").click(function(){
            $(".tab ul li").removeClass('on');
            $(".tab .conBox").removeClass('on');
            $(this).addClass('on');
            $("#"+$(this).data('id')).addClass('on');
        });
    });
    
    
</script>


<%@ include file="footer.jsp" %>
