package com.groupc.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.dao.OrderDao;
import com.groupc.dao.ProductDao;
import com.groupc.dto.MemberVO;
import com.groupc.dto.ProductVO;

public class OrderOneAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "";
		
		HttpSession session = request.getSession();
		MemberVO mvo = (MemberVO)session.getAttribute("loginUser");
		int bseq = Integer.parseInt(request.getParameter("bseq"));
		int quantity = Integer.parseInt( request.getParameter("quantity") );
		
		// 여기서는 비회원의 경우 해당 책의 정보를 가지고 loginForm으로 가서 비회원구매 버튼을 누를시 이를 가지고 가서 주문할 수 있도록 만든다.
		if(mvo==null) {
			url = "bs.do?cmd=loginForm";
			request.setAttribute("bseq", bseq);
			request.setAttribute("quantity", quantity);
		}else {
			ProductDao pdao = ProductDao.getInstance();
			ProductVO pvo = pdao.getProduct(bseq);
			// OrderDao 에  insertOrderOne 메서드 만들어서   아이디와  상품객체를 보내서 주믄을 완료 합니다.
			OrderDao odao = OrderDao.getInstance();
			int oseq = odao.insertOrderOne( pvo, mvo.getId() , quantity );
			// oseq 를 리턴받아  orderList.jsp 로 가서 주문내역을 화면에 표시합니다.
			url = "bs.do?cmd=orderList&oseq="+oseq;
		}
		
		
	}

}
