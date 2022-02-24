package com.groupc.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.dao.ReviewDao;
import com.groupc.dto.MemberVO;
import com.groupc.dto.ReviewVO;

public class ReviewViewAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "mypage/reviewView.jsp";
		int rseq = Integer.parseInt( request.getParameter("rseq") );
		
		HttpSession session = request.getSession();
	    MemberVO mvo = (MemberVO) session.getAttribute("loginUser");
	    if (mvo == null) {
	        url = "bs.do?cmd=loginForm";
	    } else {	
	    	ReviewDao rdao = ReviewDao.getInstance();
	    	ReviewVO rvo = rdao.getReview( rseq );
	    	request.setAttribute("reviewVO", rvo);
	    }
		request.getRequestDispatcher(url).forward(request, response);


	}

}
