package com.groupc.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.dao.OrderDao;
import com.groupc.dto.MemberVO;

public class CancelOrderAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberVO mvo = (MemberVO)session.getAttribute("loginUser");
		
		String [] checkboxArr = request.getParameterValues("checkbox");
		
		String url = "bs.do?cmd=orderList";
		
		if(mvo==null) {
			url = "bs.do?cmd=index";
		}else {
			OrderDao odao = OrderDao.getInstance();
			for(String oseq : checkboxArr) {
				odao.cancelOrder(Integer.parseInt(oseq));
			}
		}
		response.sendRedirect(url);
	}

}
