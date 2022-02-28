package com.groupc.controller.admin_action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.controller.action.Action;
import com.groupc.dao.AdminDao;
import com.groupc.dao.MemberDao;
import com.groupc.dto.AdminVO;
import com.groupc.dto.MemberVO;

public class AdminMemberUpdateUseynAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "";
		
		HttpSession session = request.getSession();
		AdminVO avo = (AdminVO)session.getAttribute("loginAdmin");
		
		if(avo == null) {
			url = "bs.do?cmd=admin";
		}else {
			String id = request.getParameter("id");
			
			MemberDao mdao = MemberDao.getInstance();
			MemberVO mvo = mdao.getMember(id);
			AdminDao adao = AdminDao.getInstance();
			adao.updateMemberUseyn(id, mvo.getUseyn());
			
			url = "bs.do?cmd=adminMemberList";
		}
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}
