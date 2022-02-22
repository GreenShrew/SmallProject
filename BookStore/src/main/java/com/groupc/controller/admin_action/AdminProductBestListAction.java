package com.groupc.controller.admin_action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.controller.action.Action;
import com.groupc.dao.AdminDao;
import com.groupc.dto.AdminVO;
import com.groupc.dto.ProductVO;
import com.groupc.util.Paging;

public class AdminProductBestListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "admin/product/admin_bestproductList.jsp";
		
		HttpSession session = request.getSession();
		AdminVO avo = (AdminVO)session.getAttribute("loginAdmin");
				
		if(avo == null) {
			url = "bs.do?cmd=admin";
		}else {
			String sub = request.getParameter("sub");
			
			if(sub != null) {
				session.removeAttribute("page");
			}
			
			int page = 1;
			
			if(request.getParameter("page") != null) {
				page = Integer.parseInt(request.getParameter("page"));
				session.setAttribute("page", page);
			}else if(session.getAttribute("page") != null) {
				page = (int)session.getAttribute("page");
			}else {
				page = 1;
				session.removeAttribute("page");
			}
			
			Paging paging = new Paging();
			paging.setPage(page);
			
			AdminDao adao = AdminDao.getInstance();
			
			
			int count = adao.getAdminCount("bookproduct", "bestyn", "y");
			
			paging.setTotalCount(count);
			request.setAttribute("paging", paging);
			
			ArrayList<ProductVO> bestproductList = adao.getBestProductList(paging);
			request.setAttribute("bestproductList", bestproductList);
		}
		request.getRequestDispatcher(url).forward(request, response);
	}

}
