package com.groupc.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.groupc.dao.MemberDao;
import com.groupc.dto.MemberVO;

public class IdCheckFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "member/idcheck.jsp";
		String id = request.getParameter("id");
		MemberDao mdao = MemberDao.getInstance();
		MemberVO mvo = mdao.getMember(id);
		
		if(mvo==null) request.setAttribute("result", -1);
		else request.setAttribute("result", 1);
		
		request.setAttribute("id", id);
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}
