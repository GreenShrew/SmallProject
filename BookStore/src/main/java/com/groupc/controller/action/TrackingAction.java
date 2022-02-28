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

public class TrackingAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberVO mvo = (MemberVO)session.getAttribute("loginUser");
		
		String url ="mypage/trackingList.jsp";
		
		if(mvo==null) {
			url = "bs.do?cmd=loginForm";
		}else {
			OrderDao odao = OrderDao.getInstance();
			ArrayList<OrderVO> tList = new ArrayList<OrderVO>();
			ArrayList<Integer> oseqList = odao.trackingOseq(mvo.getId());
			
			for(int oseq : oseqList) {
	    		ArrayList<OrderVO> orderListByOseq = odao.listOrderByOseq(oseq);
	    		OrderVO ovo = orderListByOseq.get(0);
	    		ovo.setBname( ovo.getBname() + " 포함 " + orderListByOseq.size() + " 건");
	    		int totalPrice = 0;
	            for (OrderVO ovo1 : orderListByOseq)  
	            	totalPrice += ovo1.getPrice() * ovo1.getQuantity();
	            ovo.setPrice(totalPrice);
	            tList.add(ovo);
			}
			request.setAttribute("tList", tList);
		}
		request.getRequestDispatcher(url).forward(request, response);
		
	}

}
