package com.groupc.controller.admin_action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.controller.action.Action;
import com.groupc.dao.AdminDao;
import com.groupc.dto.AdminVO;
import com.groupc.dto.QnaVO;

public class AdminQnaRepSaveAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String url = "bs.do?cmd=adminQnaDetail";
		
		HttpSession session = request.getSession();
		AdminVO avo = (AdminVO) session.getAttribute("loginAdmin");
		
		if(avo==null) url = "bs.do?cmd=admin";
		else {
			AdminDao adao = AdminDao.getInstance();
			QnaVO qvo = new QnaVO();
			
			qvo.setQseq(Integer.parseInt(request.getParameter("qseq")));
			qvo.setReply(request.getParameter("reply"));
			
			adao.updateQna(qvo);
			
			url = url + "&qseq=" + qvo.getQseq();
		}
		request.getRequestDispatcher(url).forward(request, response);

	}

}
