package com.groupc.controller.admin_action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.controller.action.Action;
import com.groupc.dao.MemberDao;
import com.groupc.dao.ProductDao;
import com.groupc.dto.AdminVO;
import com.groupc.dto.MemberVO;
import com.groupc.dto.ProductVO;

public class AdminMemberUpdateFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "admin/member/admin_memberUpdateForm.jsp";
		
		HttpSession session = request.getSession();
		AdminVO avo = (AdminVO)session.getAttribute("loginAdmin");
		
		if(avo == null) {
			url = "bs.do?cmd=admin";
		}else {
			String id = request.getParameter("id");
			
			MemberDao mdao = MemberDao.getInstance();
			MemberVO mvo = mdao.getMember(id);
			request.setAttribute("memberVO", mvo);
		}
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}
