package com.groupc.controller.admin_action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.controller.action.Action;
import com.groupc.dao.AdminDao;
import com.groupc.dto.AdminVO;

public class AdminMainAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		AdminVO avo = (AdminVO)session.getAttribute("loginAdmin");
		
		String url = "";
		if(avo == null) {
			url = "bs.do?cmd=admin";
		}else {
			url = "admin/adminMain.jsp";
			AdminDao adao = AdminDao.getInstance();
			session.setAttribute("mainNoticeList", adao.getMainNoticeList());
		}
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}
