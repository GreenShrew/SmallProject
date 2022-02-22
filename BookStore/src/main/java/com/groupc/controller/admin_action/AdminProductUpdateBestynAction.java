package com.groupc.controller.admin_action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.controller.action.Action;
import com.groupc.dao.AdminDao;
import com.groupc.dao.ProductDao;
import com.groupc.dto.AdminVO;
import com.groupc.dto.ProductVO;

public class AdminProductUpdateBestynAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "";
		
		HttpSession session = request.getSession();
		AdminVO avo = (AdminVO)session.getAttribute("loginAdmin");
		
		if(avo == null) {
			url = "bs.do?cmd=admin";
		}else {
			int bseq = Integer.parseInt(request.getParameter("bseq"));
			
			ProductDao pdao = ProductDao.getInstance();
			ProductVO pvo = pdao.getProduct(bseq);
			AdminDao adao = AdminDao.getInstance();
			adao.updateProductBestyn(bseq, pvo.getBestyn());
			
			url = "bs.do?cmd=adminProductBestList";
		}
		
		request.getRequestDispatcher(url).forward(request, response);

	}

}
