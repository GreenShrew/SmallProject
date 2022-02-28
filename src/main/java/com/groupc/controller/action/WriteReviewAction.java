package com.groupc.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.dao.ReviewDao;
import com.groupc.dto.MemberVO;
import com.groupc.dto.ReviewVO;

public class WriteReviewAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = "bs.do?cmd=productDetail";
		
		HttpSession session = request.getSession();
		MemberVO mvo = (MemberVO)session.getAttribute("loginUser");
		if(mvo == null) {
			url = "bs.do?cmd=loginForm";
		}else {
			ReviewDao rdao = ReviewDao.getInstance();
			ReviewVO rvo = new ReviewVO();
			
			rvo.setId(request.getParameter("id"));
			rvo.setBseq(Integer.parseInt(request.getParameter("bseq")));
			rvo.setRcontent(request.getParameter("review_content"));
			rvo.setScore(request.getParameter("radio_review"));
			
			rdao.insertReview(rvo);
			
			url = "bs.do?cmd=productDetail&bseq=" + request.getParameter("bseq");
		}
		
		response.sendRedirect(url);
		
	}

}
