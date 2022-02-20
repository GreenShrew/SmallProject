
function toDetail(bseq){
	window.location.href = "bs.do?cmd=productDetail&bseq=" + bseq;
}

/* 220218 */
function writeReview(){
	var textarea = document.getElementById("review_content");
	if(textarea.value == ""){
		alert("독자서평을 작성해주세요");
		textarea.focus();
	}else if(textarea.value.length < 10){
		alert("독자서평은 10글자 이상 작성해주세요");
		textarea.focus();
	}else if($('input:radio[name=radio_review]').is(':checked') == false){
		alert("평점을 정해주세요");
	}else{
		document.pdfrm2.action = "bs.do?cmd=writeReview";
		document.pdfrm2.submit();
	}
	
}


function go_top(){
	window.scrollTo({top: 0, behavior: 'smooth'});
}