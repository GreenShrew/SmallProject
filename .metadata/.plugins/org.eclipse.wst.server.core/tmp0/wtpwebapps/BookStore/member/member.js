function go_next(){
	var chk = document.contractFrm.okon.checked;
	if(!chk)  {
		alert("회원 약관에 동의하셔야 회원가입이 가능합니다.");
  	}else {
    	document.contractFrm.action = "bs.do?cmd=joinForm";
		document.contractFrm.submit();
  	}
}


function idcheck(){
	if(document.joinForm.id.value==""){
		alert("아이디를 입력하세요");
		document.joinForm.id.focus();
		return;
	}
	var url = "bs.do?cmd=idCheckForm&id=" + document.joinForm.id.value;
	var opt = "toolbar=no, menubar=no, resizable=no, width=500, height=250, scrollbars=no";
	window.open(url, "IdCheck", opt);
}

function idok(userid){
	opener.joinForm.id.value = userid;
	opener.joinForm.reid.value = userid;
	self.close();
}


function post_zip(){
	var url = "bs.do?cmd=findZipNum";
	var opt = "toolbar=no, menubar=no, resizable=no, width=550, height=300, top=300, left=300, scrollbars=no";
	window.open(url, "우편번호 찾기", opt);
}

function result(zip_num, sido, gugun, dong){
	opener.document.joinForm.zip_num.value=zip_num;
	opener.document.joinForm.addr1.value=sido+" "+gugun+" "+dong;
	self.close();
}


function go_save(){
	if(document.joinForm.id.value == ""){
		alert("아이디를 입력해주세요.");
		document.joinForm.id.focus();
	} else if(document.joinForm.reid.value != document.joinForm.id.value){
		alert("아이디 중복확인을 하지 않았습니다.");
		document.joinForm.id.focus();
	} else if(document.joinForm.pwd.value == ""){
		alert("비밀번호를 입력해주세요.");
		document.joinForm.pwd.focus();
	} else if(document.joinForm.pwd.value != document.joinForm.pwdCheck.value){
		alert("비밀번호와 비밀번호 확인이 일치하지 않습니다.");
		document.joinForm.pwdCheck.focus();
		document.joinForm.pwdCheck.value='';
	} else if(document.joinForm.name.value == ""){
		alert("이름을 입력해주세요.");
		document.joinForm.name.focus();
	} else if(document.joinForm.email.value == "") {
	    alert("이메일을 입력해 주세요.");	   
	   	document.joinForm.email.focus();
	} else if(document.joinForm.phone.value == "") {
	    alert("전화번호를 입력해 주세요.");	   
	   	document.joinForm.phone.focus();
	} else{
		document.joinForm.action = "bs.do";
		document.joinForm.submit();
	}
}


function main(){
	document.joinForm.action="bs.do?cmd=index";
	document.joinForm.submit();
}


function joincheck(message){
	if(message!=null){
		alert(message);
	}
}