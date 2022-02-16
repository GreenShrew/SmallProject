package com.groupc.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.groupc.dao.ProductDao;
import com.groupc.dto.ProductVO;

public class ProductDetailAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pseq = Integer.parseInt(request.getParameter("pseq"));
		ProductDao mdao = ProductDao.getInstance();
		ProductVO pvo = mdao.getProduct(pseq);
		
		request.setAttribute("productVO", pvo);
		String url = "product/productDetail.jsp";
		
		request.getRequestDispatcher(url).forward(request, response);
		
	}

}
