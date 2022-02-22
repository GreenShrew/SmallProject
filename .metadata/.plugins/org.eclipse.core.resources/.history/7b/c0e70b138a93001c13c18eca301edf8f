package com.groupc.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.groupc.dao.ProductDao;
import com.groupc.dto.ProductVO;

public class MenuAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "";
		String kind = request.getParameter("kind");

		ProductDao pdao = ProductDao.getInstance();
		
		if(kind.equals("1")) {
			ArrayList<ProductVO> bestviewList = pdao.getBestViewList();
			request.setAttribute("bestviewList", bestviewList);
			ArrayList<ProductVO> bestviewoneList = pdao.getBestViewOneList();
			request.setAttribute("bestviewoneList", bestviewoneList);
			url = "product/bestProduct.jsp";
		}else if(kind.equals("2")) {
			ArrayList<ProductVO> newviewList = pdao.getNewViewList();
			request.setAttribute("newviewList", newviewList);
			ArrayList<ProductVO> newviewoneList = pdao.getNewViewOneList();
			request.setAttribute("newviewoneList", newviewoneList);
			url = "product/newProduct.jsp";
		}else if(kind.equals("3")) {
			ArrayList<ProductVO> localviewList = pdao.getLocalList();
			request.setAttribute("localviewList", localviewList);
			url = "product/localProduct.jsp";
		}else if(kind.equals("4")) {
			ArrayList<ProductVO> globalviewList = pdao.getGlobalList();
			request.setAttribute("globalviewList", globalviewList);
			url = "product/globalProduct.jsp";
		}else if(kind.equals("5")) {
			url = "product/event.jsp";
		}
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}
