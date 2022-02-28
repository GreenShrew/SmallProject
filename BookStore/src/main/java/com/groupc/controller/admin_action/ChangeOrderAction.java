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
		String url = "";
		HttpSession session = request.getSession();
		AdminVO avo = (AdminVO)session.getAttribute("loginAdmin");
		String kind = request.getParameter("kind");
		
		System.out.println(kind);
		
		String [] checkboxArr = request.getParameterValues("orderCheck");
		int result = Integer.parseInt(request.getParameter("result"));
		int mem = 1;
		if(kind.equals("1")||kind.equals("2")) {
			if(avo==null) {
				url="bs.do?cmd=admin";
			}else {
				url = "bs.do?cmd=adminOrderList&kind="+kind;
				AdminDao adao = AdminDao.getInstance();
				for(String odseq : checkboxArr) {
					adao.changeResult(Integer.parseInt(odseq), result, mem);
				}
			}
		}else {
			mem = 2;
			if(avo==null) {
				url="bs.do?cmd=admin";
			}else {
				url = "bs.do?cmd=adminOrderList&kind="+kind;
				AdminDao adao = AdminDao.getInstance();
				for(String odseq : checkboxArr) {
					adao.changeResult(Integer.parseInt(odseq), result, mem);
				}
			}
		}
		
		response.sendRedirect(url);
	}

}
