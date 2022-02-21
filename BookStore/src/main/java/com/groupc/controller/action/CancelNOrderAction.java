package com.groupc.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.dao.OrderDao;
import com.groupc.dto.MemberVO;

public class CancelNOrderAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberVO mvo = (MemberVO)session.getAttribute("loginUser");
		String od_pass = request.getParameter("od_pass");
		System.out.println(od_pass);
		String url = "bs.do?cmd=index";
		String message = "";
		
		if(mvo!=null) {
			message = "잘못된 접근입니다.";
		}else {
			OrderDao odao = OrderDao.getInstance();
			odao.cancelNOrder(od_pass);
		}
		request.setAttribute("message", message);
		request.getRequestDispatcher(url).forward(request, response);
	}

}
