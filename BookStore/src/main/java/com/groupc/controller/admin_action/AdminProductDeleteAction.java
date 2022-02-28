package com.groupc.controller.admin_action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.controller.action.Action;
import com.groupc.dao.AdminDao;
import com.groupc.dto.AdminVO;
import com.groupc.dto.ProductVO;

public class AdminProductDeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "bs.do?cmd=adminProductList&sub=y";
		
		HttpSession session = request.getSession();
		AdminVO avo = (AdminVO)session.getAttribute("loginAdmin");
		
		if(avo == null) {
			url = "bs.do?cmd=admin";
		}else {
			int bseq = Integer.parseInt(request.getParameter("bseq"));
			AdminDao adao = AdminDao.getInstance();
			adao.deleteProduct(bseq);
		}
		request.getRequestDispatcher(url).forward(request, response);
	}

}
