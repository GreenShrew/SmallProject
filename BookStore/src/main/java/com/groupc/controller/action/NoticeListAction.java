package com.groupc.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.dao.NoticeDao;
import com.groupc.dto.MemberVO;
import com.groupc.dto.NoticeVO;

public class NoticeListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String url = "qna/noticeList.jsp";
			
			HttpSession session = request.getSession();
			MemberVO mvo = (MemberVO)session.getAttribute("loginUser");
			String z = request.getParameter("z");
			
			if(mvo == null) {
				url = "bs.do?cmd=loginForm";
				request.setAttribute("z", z);
			}else {
				NoticeDao ndao = NoticeDao.getInstance();
				ArrayList<NoticeVO> noticeList = ndao.listNotice(mvo.getId());
				request.setAttribute("noticeList", noticeList);
				url = "qna/noticeList.jsp";
				System.out.println(noticeList.size());
			}
			request.getRequestDispatcher(url).forward(request, response);

	}

}
