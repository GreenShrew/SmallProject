package com.groupc.controller.admin_action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.controller.action.Action;
import com.groupc.dao.NoticeDao;
import com.groupc.dto.AdminVO;
import com.groupc.dto.NoticeVO;

public class AdminNoticeDetailAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "admin/notice/noticeDetail.jsp";
		HttpSession session = request.getSession();
		AdminVO avo = (AdminVO)session.getAttribute("loginAdmin");
		if(avo==null) {
			url="bs.do?cmd=admin";
		}else {
			String nseq = request.getParameter("nseq");
			NoticeDao ndao = NoticeDao.getInstance();
			NoticeVO nvo = ndao.getNotice(Integer.parseInt(nseq));
			request.setAttribute("noticeVO", nvo);
		}
		request.getRequestDispatcher(url).forward(request, response);


	}

}
