//function go_order_insert(){
//		var count = 0;
//	var checkbox = document.getElementsByName('cseq');
//
//	if(checkbox.length==undefined){
//		if(checkbox.checked==true) {count++;}
//	}else{
//		for(var i=0; i<checkbox.length; i++){
//			if(checkbox[i].checked==true){
//				count++;
//			}
//		}
//	}
//	
//	if(count==0){
//		alert("장바구니에서 주문할 항목을 선택해주세요.");
//	}else{
//		var a = confirm("선택하신 상품들을 주문하시겠습니까?");
//		if(a){
//			document.formm.action="bs.do?cmd=orderInsert";
//			document.formm.submit();
//		}else{
//			return false;
//		}
//	}
//}

function go_order_insert(){
	var cnt = 0;
	var f = document.formm;
	if(f.cseq.length == undefined){
		if(f.cseq.checked == true){
			cnt++;
		}
	}else{
		for(var i = 0; i < f.cseq.length; i++){
			if(f.cseq[i].checked == true){
				cnt++;
			}
		}
	}
	
	if(cnt == 0){
		alert("주문할 항목을 체크해주세요");
	}else{
<<<<<<< HEAD
		f.action = "bs.do?cmd=orderInsert";
		f.submit();
=======
		if(confirm("선택하신 상품을 구매하시겠습니까?")){
			f.action = "bs.do?cmd=orderInsert";
			f.submit();
		}
>>>>>>> MJ
	}
}





function buyyn(bseq){
	var a = confirm("상품을 바로 구매하시겠습니까?");
	if(a){
		if(document.getElementById('checking').value){
			location.href="bs.do?cmd=orderOne&bseq="+bseq+"&quantity=1";
			return true;
		}else{
			if(confirm("비회원으로 구매하시겠습니까?")){
				location.href="bs.do?cmd=nmemberBuyForm&bseq="+bseq+"&quantity=1";
			}else{
				alert("로그인 후 이용해주세요.");
				return false;
			}
		}
	}else{
		return false;
	}
}




function buypyn(bseq){
	var a = confirm("상품을 바로 구매하시겠습니까?");
	if(a){
		if(document.getElementById('checking').value){
			location.href="bs.do?cmd=orderOne&bseq="+bseq+"&quantity="+document.getElementById('quantity').value;
			return true;
		}else{
			if(confirm("비회원으로 구매하시겠습니까?")){
				location.href="bs.do?cmd=nmemberBuyForm&bseq="+bseq+"&quantity="+document.getElementById('quantity').value;
			}else{
				alert("로그인 후 이용해주세요.");
				return false;
			}
		}
	}else{
		return false;
	}
}



function orderCancel(){
	var count = 0;
	var checkbox = document.getElementsByName('checkbox');

	if(checkbox.length==undefined){
		if(checkbox.checked==true) {count++;}
	}else{
		for(var i=0; i<checkbox.length; i++){
			if(checkbox[i].checked==true){
				count++;
			}
		}
	}
	
	
	if(count==0){
		alert("주문을 취소하실 항목을 선택해주세요.");
	}else{
		var a = confirm("선택하신 상품들의 주문을 취소하시겠습니까?");
		if(a){
			document.frm.action="bs.do?cmd=cancelOrder";
			document.frm.submit();
		}else{
			return false;
		}
	}
}



function norderCancel(od_pass){
	var a = confirm("상품 주문을 취소하시겠습니까?");
	if(a){
		location.href = "bs.do?cmd=cancelNOrder&od_pass="+od_pass;
	}else{
		return false;
	}
}




function go_cart_delete(){
	var count = 0;
	var checkbox = document.getElementsByName('cseq');

	if(checkbox.length==undefined){
		if(checkbox.checked==true) {count++;}
	}else{
		for(var i=0; i<checkbox.length; i++){
			if(checkbox[i].checked==true){
				count++;
			}
		}
	}
	
	if(count==0){
		alert("장바구니에서 삭제할 항목을 선택해주세요.");
	}else{
		var a = confirm("선택하신 상품들을 장바구니에서 삭제하시겠습니까?");
		if(a){
			document.formm.action="bs.do?cmd=cartDelete";
			document.formm.submit();
		}else{
			return false;
		}
	}
}