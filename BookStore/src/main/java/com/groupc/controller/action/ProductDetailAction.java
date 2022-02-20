package com.groupc.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.dao.ProductDao;
import com.groupc.dao.ReviewDao;
import com.groupc.dto.MemberVO;
import com.groupc.dto.ProductVO;
import com.groupc.dto.ReviewVO;

public class ProductDetailAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bseq = Integer.parseInt(request.getParameter("bseq"));
		ProductDao pdao = ProductDao.getInstance();
		ProductVO pvo = pdao.getProduct(bseq);
		
		ReviewDao rdao = ReviewDao.getInstance();
		ArrayList<ReviewVO> reviewList = rdao.getReview(bseq);
		
		HttpSession session = request.getSession();
		MemberVO mvo = (MemberVO) session.getAttribute("loginUser");
		
		request.setAttribute("productVO", pvo);
		request.setAttribute("reviewList", reviewList);
		session.setAttribute("loginUser", mvo);
		
		String url = "product/productDetail.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

}
