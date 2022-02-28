package com.groupc.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.dao.NoticeDao;
import com.groupc.dto.MemberVO;
import com.groupc.dto.NoticeVO;

public class NoticeViewAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "qna/noticeView.jsp";
		int nseq = Integer.parseInt( request.getParameter("nseq") );
		
		HttpSession session = request.getSession();
	    MemberVO mvo = (MemberVO) session.getAttribute("loginUser");
	    if (mvo == null) {
	        url = "bs.do?cmd=loginForm";
	    } else {	
	    	NoticeDao ndao = NoticeDao.getInstance();
	    	NoticeVO nvo = ndao.getNotice( nseq );
	    	request.setAttribute("noticeVO", nvo);
	    }
		request.getRequestDispatcher(url).forward(request, response);

	}

}
