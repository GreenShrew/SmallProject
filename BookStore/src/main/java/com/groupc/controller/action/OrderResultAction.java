package com.groupc.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.dao.OrderDao;
import com.groupc.dto.MemberVO;
import com.groupc.dto.OrderVO;

public class OrderResultAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "mypage/orderResult.jsp";
		int oseq = Integer.parseInt(request.getParameter("oseq"));
		
		HttpSession session = request.getSession();
		MemberVO mvo = (MemberVO)session.getAttribute("loginUser");
		
		if(mvo == null) {
			url = "bs.do?cmd=loginForm";
		}else {
			OrderDao odao = OrderDao.getInstance();
			ArrayList<OrderVO> orderList = odao.listOrderResult(oseq);
			
			int totalPrice = 0;
			
			for(OrderVO ovo : orderList) {
				totalPrice += ovo.getPrice()* ovo.getQuantity();
			}
			
			request.setAttribute("orderList", orderList);
			request.setAttribute("totalPrice", totalPrice);
		}
		request.getRequestDispatcher(url).forward(request, response);
	}

}
