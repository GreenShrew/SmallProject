<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<style rel="stylesheet" type="text/css">
#product_Area{position:relative; width:800px; height:6000px; left:16%;border:1px solid black; }

.bookbox {position:relative; width:330px; height:160px; margin-right:20px;float:left;}
.bookbestcount{position:absolute; width: 30px; height:30px; color: white; background-color:red; line-height:30px; 
box-shadow:1px 1px 1px 1px gray; border:1px solid black; text-align:center; font-weight:bold; font-size:110%;}
.bookboximg {position:relative; float:left; overflow:hidden;} 
.bookboximg img{width:80px; height:110px; border:1px solid green; margin:0px; padding:0px; overflow:hidden;}

.bookboxright{position:relative; width:240px; height:70px;float:left; }
.bookboxlist{position:relative; width:200px; height:19px;margin:0px;float:left;
font-size:90%;float:left;padding-left:5px;}
.bookboxlist div{width: 30%;font-size:90%;float:left; margin-right:5px;}

.bookboxbtn{position:relative; width:300px; height:24px; top:10px; margin:2px; overflow:hidden;}
.bookboxbtn a{color: white; margin-right:10px; width:80px; background-color:green; 
line-height:20px; text-align:center; float:left; text-decoration:none; border:1px solid black;}
.bookboxbtn a:hover{text-decoration:underline; font-weight:bold; font-size:102%}

</style>

<br><br><br>
<div id="product_Area">
	<div style="height:20px;"></div>
		<div class="bookbox">
			<div class="bookboximg" onClick="">
				<img alt="" src="images/book/${pvo.image}" >
			</div>
			<div class="bookbestcount">1</div>
			<div class="bookboxright">
				<div class="bookboxlist">
					<div>123</div>
					<div>qwe</div>
				</div>
				<div class="bookboxlist">
					<div>qwer 저 |</div>
					<div>eeeee</div>
				</div>
				<div class="bookboxlist">10000</div>
				<div class="bookboxlist">33</div>
				<div class="bookboxlist">3</div>
			</div>
			<div class="bookboxbtn">
				<div><a href="#" onClick="">상세보기</a></div>
				<div><a href="#" onClick="">바로구매</a></div>
				<div><a href="#" onClick="">장바구니</a></div>
			</div>
		</div>
		<div class="bookbox">
			<div class="bookboximg" onClick="">
				<img alt="" src="images/book/${pvo.image}" >
			</div>
			<div class="bookbestcount">2</div>
			<div class="bookboxright">
				<div class="bookboxlist">
					<div>123</div>
					<div>qwe</div>
				</div>
				<div class="bookboxlist">
					<div>qwer 저 |</div>
					<div>eeeee</div>
				</div>
				<div class="bookboxlist">10000</div>
				<div class="bookboxlist">33</div>
				<div class="bookboxlist">3</div>
			</div>
			<div class="bookboxbtn">
				<div><a href="#" onClick="">상세보기</a></div>
				<div><a href="#" onClick="">바로구매</a></div>
				<div><a href="#" onClick="">장바구니</a></div>
			</div>
		</div>
		<div class="bookbox">
			<div class="bookboximg" onClick="">
				<img alt="" src="images/book/${pvo.image}" >
			</div>
			<div class="bookbestcount">3</div>
			<div class="bookboxright">
				<div class="bookboxlist">
					<div>123</div>
					<div>qwe</div>
				</div>
				<div class="bookboxlist">
					<div>qwer 저 |</div>
					<div>eeeee</div>
				</div>
				<div class="bookboxlist">10000</div>
				<div class="bookboxlist">33</div>
				<div class="bookboxlist">3</div>
			</div>
			<div class="bookboxbtn">
				<div><a href="#" onClick="">상세보기</a></div>
				<div><a href="#" onClick="">바로구매</a></div>
				<div><a href="#" onClick="">장바구니</a></div>
			</div>
		</div>
</div>