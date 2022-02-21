package com.groupc.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.groupc.dao.OrderDao;
import com.groupc.dto.NOrderVO;

public class NOrderResultAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "nonmember/nOrderResult.jsp";
		
		String od_pass = String.valueOf(request.getAttribute("od_pass"));
		
		OrderDao odao = OrderDao.getInstance();
		NOrderVO novo = new NOrderVO();
		novo = odao.nOrderByOd_Pass(od_pass);
		request.setAttribute("NOrderVO", novo);
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}
