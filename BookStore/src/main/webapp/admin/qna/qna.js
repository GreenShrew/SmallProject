function go_search(comm){
	if(document.frm.key.value==""){
	alert("검색버튼 사용시에는 검색어 입력이 필수입니다.");
	return;
	}
	var url = "bs.do?cmd=" + comm + "&page=1";
	document.frm.action = url;
	document.frm.submit();
}

function go_total(comm){
	document.frm.key.value="";
	document.frm.action = "bs.do?cmd"+ comm + "&page=1";
	document.frm.submit();
}

function go_view(qseq){
	location.href="bs.do?cmd=adminQnaDetail&qseq=" + qseq;
}



function go_rep(qseq){
	document.frm.action="bs.do?cmd=adminQnaRepSave";
	document.frm.submit();
}



function go_save(nseq){
	document.frm.action="bs.do?cmd=adminNoticeSave";
	document.frm.submit();
}




