package com.groupc.controller.admin_action;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.controller.action.Action;
import com.groupc.dao.AdminDao;
import com.groupc.dto.AdminVO;
import com.groupc.dto.NoticeVO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class AdminNoticeWriteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "bs.do?cmd=adminNoticeList";
		
		HttpSession session = request.getSession();
		AdminVO avo = (AdminVO) session.getAttribute("loginAdmin");
		
		if(avo==null) {
			url = "bs.do?cmd=admin";
		}else {
			NoticeVO nvo = new NoticeVO();
			nvo.setSubject(request.getParameter("subject"));
			nvo.setContent(request.getParameter("content"));
			nvo.setId(avo.getId());
			
			AdminDao adao = AdminDao.getInstance();
			adao.insertNotice(nvo);
		}
		response.sendRedirect(url);

	}

}
