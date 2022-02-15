package com.groupc.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.dao.QnaDao;
import com.groupc.dto.MemberVO;
import com.groupc.dto.QnaVO;

public class QnaWriteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String url = "bs.do?cmd=qnaList";
		
		HttpSession session = request.getSession();
		MemberVO mvo = (MemberVO) session.getAttribute("loginUser");
		
		if(mvo==null) {
			url = "bs.do?cmd=loginForm";
		}else {
			QnaVO qvo = new QnaVO();
			qvo.setSubject(request.getParameter("subject"));
			qvo.setContent(request.getParameter("content"));
			qvo.setId(mvo.getId());
			
			QnaDao qdao = QnaDao.getInstance();
			qdao.insertQna(qvo);
		}
		response.sendRedirect(url);

	}

}
