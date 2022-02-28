package com.groupc.controller.admin_action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.controller.action.Action;
import com.groupc.dao.ProductDao;
import com.groupc.dto.AdminVO;
import com.groupc.dto.ProductVO;

public class AdminProductDetailAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		AdminVO avo = (AdminVO)session.getAttribute("loginAdmin");
		
		int bseq = Integer.parseInt(request.getParameter("bseq"));
		String url = "admin/product/admin_productDetail.jsp";
		if(avo == null) {
			url = "bs.do?cmd=admin";
		}else {
			ProductDao pdao = ProductDao.getInstance();
			ProductVO pvo = pdao.getProduct(bseq);
			
			request.setAttribute("productVO", pvo);
		}
		request.getRequestDispatcher(url).forward(request, response);
	}

}
