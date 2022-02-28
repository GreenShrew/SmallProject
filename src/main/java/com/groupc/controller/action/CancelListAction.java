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

public class CancelListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberVO mvo = (MemberVO)session.getAttribute("loginUser");
		
		String url = "mypage/cancelList.jsp";
		
		if(mvo==null) {
			url = "bs.do?cmd=loginForm";
		}else {
			OrderDao odao = OrderDao.getInstance();
			ArrayList<OrderVO> cList = new ArrayList<OrderVO>();
			ArrayList<Integer> oseqList	= odao.cancelListOseq(mvo.getId());
			for(int oseq : oseqList) {
				ArrayList<OrderVO> orderListByOseq = odao.listOrderByOseq(oseq);
	    		OrderVO ovo = orderListByOseq.get(0);
	    		ovo.setBname( ovo.getBname() + " 포함 " + orderListByOseq.size() + " 건");
	    		int totalPrice = 0;
	            for (OrderVO ovo1 : orderListByOseq)  
	            	totalPrice += ovo1.getPrice() * ovo1.getQuantity();
	            ovo.setPrice(totalPrice);
	            cList.add(ovo);
			}
			request.setAttribute("cList", cList);
		}
		request.getRequestDispatcher(url).forward(request, response);
	}

}
