package com.groupc.controller.admin_action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.controller.action.Action;
import com.groupc.dao.AdminDao;
import com.groupc.dto.AdminVO;

public class ChangeOrderAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "bs.do?cmd=adminOrderList";
		HttpSession session = request.getSession();
		AdminVO avo = (AdminVO)session.getAttribute("loginAdmin");
		
		String [] checkboxArr = request.getParameterValues("orderCheck");
		int result = Integer.parseInt(request.getParameter("result"));
		
		if(avo==null) {
			url="bs.do?cmd=admin";
		}else {
			AdminDao adao = AdminDao.getInstance();
			for(String odseq : checkboxArr) {
				adao.changeResult(Integer.parseInt(odseq), result);
			}
		}
		response.sendRedirect(url);
	}

}