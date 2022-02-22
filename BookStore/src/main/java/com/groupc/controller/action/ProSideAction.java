package com.groupc.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.dao.ProductDao;
import com.groupc.dto.ProductVO;
import com.groupc.util.Paging;

public class ProSideAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "product/viewProduct.jsp";
		
		// 220218
		HttpSession session = request.getSession();
		
		String sub = request.getParameter("sub");
		if(sub!=null && sub.equals("y")) {
			session.removeAttribute("genre");
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
		
		String genre="";
		if( request.getParameter("genre") != null ) {
			genre = request.getParameter("genre");
			session.setAttribute("genre", genre);
		} else if( session.getAttribute("genre")!= null ) {
			genre = (String)session.getAttribute("genre");
		} else {
			session.removeAttribute("genre");
			genre = "";
		}
		String kind="";
		if( request.getParameter("kind") != null ) {
			kind = request.getParameter("kind");
			session.setAttribute("kind", kind);
		} else if( session.getAttribute("kind")!= null ) {
			kind = (String)session.getAttribute("kind");
		} else {
			session.removeAttribute("kind");
			kind = "";
		}
		
		ProductDao pdao = ProductDao.getInstance();
		
		int count = pdao.getProductCount(kind, genre);
		paging.setTotalCount(count);
		request.setAttribute("paging", paging);
		ArrayList<ProductVO> pro_viewList = pdao.getViewList(paging, genre);
		request.setAttribute("productViewList", pro_viewList);
		
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}
