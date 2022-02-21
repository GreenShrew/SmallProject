package com.groupc.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.dao.OrderDao;
import com.groupc.dto.MemberVO;
import com.groupc.dto.NonMemberVO;
import com.groupc.dto.OrderVO;

public class OrderDetailAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "mypage/orderDetail.jsp";
		
		HttpSession session = request.getSession();
		MemberVO mvo = (MemberVO) session.getAttribute("loginUser");
		NonMemberVO nmvo = (NonMemberVO) session.getAttribute(null);	// 일단 null값으로 고정
		
		int oseq = Integer.parseInt(request.getParameter("oseq"));	// oseq를 가져와서 그 안의 odseq를 나열해야한다.
		
		if(mvo==null && nmvo==null) {
			url = "bs.do?cmd=loginForm";
		}else if(nmvo != null) {
			// 여기에 nonMember 에서 정보 긁어오는 내용을 써야한다.
		}else {
			OrderDao odao = OrderDao.getInstance();
			ArrayList<OrderVO> list = odao.listOrderByOseq( oseq );
			request.setAttribute("orderList", list);
		}
		request.getRequestDispatcher(url).forward(request, response);
			
	    
		
	}

}
