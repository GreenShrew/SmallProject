package com.groupc.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.groupc.dao.ProductDao;
import com.groupc.dto.ProductVO;

public class ProSideAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "product/viewProduct.jsp";
		String genre = request.getParameter("genre");
		
		ProductDao pdao = ProductDao.getInstance();
		
		// edu for hob lit
		if(genre.equals("all")) {
			ArrayList<ProductVO> pro_allviewList = pdao.getViewList(genre);
			request.setAttribute("productViewList", pro_allviewList);
		}else if(genre.equals("lit")) {
			ArrayList<ProductVO> pro_eduviewList = pdao.getViewList(genre);
			request.setAttribute("productViewList", pro_eduviewList);
		}else if(genre.equals("for")) {
			ArrayList<ProductVO> pro_forviewList = pdao.getViewList(genre);
			request.setAttribute("productViewList", pro_forviewList);
		}else if(genre.equals("hob")) {
			ArrayList<ProductVO> pro_hobviewList = pdao.getViewList(genre);
			request.setAttribute("productViewList", pro_hobviewList);
		}else if(genre.equals("lit")) {
			ArrayList<ProductVO> pro_litviewList = pdao.getViewList(genre);
			request.setAttribute("productViewList", pro_litviewList);
		}else if(genre.equals("edu")) {
			ArrayList<ProductVO> pro_edu_forviewList = pdao.getViewList(genre);
			request.setAttribute("productViewList", pro_edu_forviewList);
		}else if(genre.equals("hob")) {
			ArrayList<ProductVO> pro_hob_litviewList = pdao.getViewList(genre);
			request.setAttribute("productViewList", pro_hob_litviewList);
		}else if(genre.equals("for")) {
			ArrayList<ProductVO> pro_for_litviewList = pdao.getViewList(genre);
			request.setAttribute("productViewList", pro_for_litviewList);
		}else if(genre.equals("edu")) {
			ArrayList<ProductVO> pro_edu_litviewList = pdao.getViewList(genre);
			request.setAttribute("productViewList", pro_edu_litviewList);
		}else if(genre.equals("hob")) {
			ArrayList<ProductVO> pro_hob_forviewList = pdao.getViewList(genre);
			request.setAttribute("productViewList", pro_hob_forviewList);
		}
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}
