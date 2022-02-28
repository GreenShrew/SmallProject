package com.groupc.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.dto.MemberVO;

public class EditFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		HttpSession session = request.getSession();
		MemberVO mvo = (MemberVO)session.getAttribute("loginUser");
		String addr = mvo.getAddress();
		
		if(addr !=null) {
			int k1 = addr.indexOf(" ");
			int k2 = addr.indexOf(" ", k1+1);
			int k3 = addr.indexOf(" ", k2+1);
			
			String addr1 = addr.substring(0, k3);
			String addr2 = addr.substring(k3+1);
			
			request.setAttribute("addr1", addr1);
			request.setAttribute("addr2", addr2);
		}
		
		RequestDispatcher dp = request.getRequestDispatcher("member/updateForm.jsp");
		dp.forward(request, response);
	}

}
