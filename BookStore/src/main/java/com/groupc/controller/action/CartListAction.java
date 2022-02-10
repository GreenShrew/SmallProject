package com.groupc.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.dao.CartDao;
import com.groupc.dto.CartVO;
import com.groupc.dto.MemberVO;

public class CartListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "mypage/cartList.jsp"; //최종 목적지
		
		HttpSession session = request.getSession();
		MemberVO mvo = (MemberVO)session.getAttribute("loginUser");
	
		if(mvo==null) {
			url = "bs.do?cmd=loginForm";
		}else {
			CartDao cdao = CartDao.getInstance();
			ArrayList<CartVO> list = cdao.selectCart(mvo.getId());
			request.setAttribute("cartList", list); 
			
			int totalPrice=0;
			for(CartVO cvo:list)
				totalPrice += cvo.getPrice() * cvo.getQuantity(); 
			request.setAttribute("totalPrice", totalPrice); 
		}
		request.getRequestDispatcher(url).forward(request, response);
		
	}

}
