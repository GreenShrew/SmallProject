package com.groupc.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.dao.ProductDao;
import com.groupc.dto.MemberVO;
import com.groupc.dto.NonMemberVO;
import com.groupc.dto.ProductVO;

public class NmemberBuyFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberVO mvo = (MemberVO) session.getAttribute("loginUser");
		
		int bseq = Integer.parseInt(request.getParameter("bseq"));
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		
		String url="";
		if(mvo!=null) {
			url = "bs.do?cmd=index";
		}else {
			ProductDao pdao = ProductDao.getInstance();
			ProductVO pvo = pdao.getProduct(bseq);
			request.setAttribute("productVO", pvo);
			request.setAttribute("quantity", quantity);
			url = "nonmember/NmemberBuyForm.jsp";
		}
		request.getRequestDispatcher(url).forward(request, response);
	}

}
