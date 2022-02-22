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
import com.groupc.dto.OrderVO;
import com.groupc.util.Paging;

public class AdminOrderListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "admin/order/adminOrderList.jsp";
		HttpSession session = request.getSession();
		AdminVO avo = (AdminVO)session.getAttribute("loginAdmin");
		
		String kind = request.getParameter("kind");
		
		if(avo==null) {
			url="bs.do?cmd=admin";
		}else {
			
			String sub = request.getParameter("sub");
			if(sub != null) {
				session.removeAttribute("key");
				session.removeAttribute("page");
			}
			
			int page = 1;
			if(request.getParameter("page") != null) {
				page = Integer.parseInt(request.getParameter("page"));
				session.setAttribute("page", page);
			}else if(session.getAttribute("page") != null){
				page = (int) session.getAttribute("page");
			}else {
				session.removeAttribute("page");
			}
			
			String key = "";
			if(request.getParameter("key") != null) {
				key = request.getParameter("key");
				session.setAttribute("key", key);
			}else if(session.getAttribute("key") != null) {
				key = (String) session.getAttribute("key");
			}else {
				session.removeAttribute("key");
				key="";
			}
			
			Paging paging = new Paging();
			paging.setPage(page);

			
			AdminDao adao = AdminDao.getInstance();
			int count = 0;
			if(kind.equals("1")){
				count = adao.getOrderCount("order_view", "mname", key, 1);
			}else if(kind.equals("2")){
				count = adao.getOrderCount("order_view", "mname", key, 2);
			}else if(kind.equals("3")){
				count = adao.getOrderCount("non_order_view", "nmname", key, 1);
			}else {
				count = adao.getOrderCount("non_order_view", "nmname", key, 2);
			}
			
			
//			count = adao.getAdminCount("order_view", "mname", key);
			
			paging.setTotalCount(count);
			
			ArrayList<OrderVO> orderList = new ArrayList<OrderVO>();
			if(kind.equals("1") || kind.equals("2")) {
				orderList = adao.listOrder(paging, key);
			}else {
				orderList = adao.listNOrder(paging, key);
			}

			
			request.setAttribute("orderList", orderList);
			request.setAttribute("paging", paging);
			request.setAttribute("key", key);
		}
		request.getRequestDispatcher(url).forward(request, response);
	}

}
