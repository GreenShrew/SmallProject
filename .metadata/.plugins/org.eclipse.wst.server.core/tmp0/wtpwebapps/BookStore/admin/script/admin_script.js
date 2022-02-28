/**
 * 
 */

/* admin login */
function adminCheck(){
	  if(document.frm.adminId.value==""){
	      	alert("아이디를 입력하세요.");
	      	document.frm.adminId.focus();
	      	return false;
	  }else if(document.frm.adminPwd.value==""){
	     	alert("비밀번호를 입력하세요.");
	      	document.frm.adminPwd.focus();
	      	return false;
	  }
	  return true;  
}


/* admin side bar action */
$(function(){
	$(".sideList").click(function(){
		var num = $(this).index(".sideList");
		$(".sideList").css({"height":"50px"});
		$(".sideList ul").css({"height":"1px","visibility":"hidden"});
		$(".sideList .listbutton").css({"transform":"rotate(0deg)"});
		$(".sideList").eq(num).css({"height":"200px"});
		$(".sideList ul").eq(num).css({"height":"130px","visibility":"visible"});
		$(".sideList .listbutton").eq(num).css({"transform":"rotate(90deg)"});
	});
});
	