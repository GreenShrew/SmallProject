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

public class ReviewListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String url = "";
			
			HttpSession session = request.getSession();
			MemberVO mvo = (MemberVO)session.getAttribute("loginUser");
			
			if(mvo == null) {
				url = "bs.do?cmd=loginForm";
			}else {
				ReviewDao rdao = ReviewDao.getInstance();
				ArrayList<ReviewVO> reviewList = rdao.listReview(mvo.getId());
				request.setAttribute("reviewList", reviewList);
				url = "mypage/reviewList.jsp";
			}
			request.getRequestDispatcher(url).forward(request, response);

	}

}
