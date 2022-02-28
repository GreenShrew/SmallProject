package com.groupc.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.dao.CartDao;
import com.groupc.dao.MemberDao;
import com.groupc.dao.OrderDao;
import com.groupc.dto.MemberVO;

public class WithdrawalAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberVO mvo = (MemberVO)session.getAttribute("loginUser");
		
		String url = "";
		
		if(mvo==null) {
			url="bs.do?cmd=index";
		}else {
			// 계정 날려버리기
			MemberDao mdao = MemberDao.getInstance();
			mdao.withdrawal(mvo.getId());
			// 카트 날려버리기
			CartDao cdao = CartDao.getInstance();
			cdao.deleteCart(mvo.getId());
			// 주문했던 내역 날려버리기
			OrderDao odao = OrderDao.getInstance();
			ArrayList<Integer> oseqList = odao.selectOseqOrderAll(mvo.getId());
			for(Integer oseq : oseqList) {
				odao.deleteOrders(oseq);
				odao.deleteOrder_detail(oseq);
			}
			session.removeAttribute("loginUser");
			url = "mypage/withdrawal.jsp";
		}
		request.getRequestDispatcher(url).forward(request, response);
	}

}
