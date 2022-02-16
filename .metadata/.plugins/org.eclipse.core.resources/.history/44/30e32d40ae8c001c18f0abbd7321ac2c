package com.groupc.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.groupc.dao.ProductDao;
import com.groupc.dto.ProductVO;

public class IndexAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductDao pdao = ProductDao.getInstance();
		
		ArrayList<ProductVO> bestList = pdao.getBestList();
		ArrayList<ProductVO> newList = pdao.getNewList();
		
		request.setAttribute("bestList", bestList);
		request.setAttribute("newList", newList);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
