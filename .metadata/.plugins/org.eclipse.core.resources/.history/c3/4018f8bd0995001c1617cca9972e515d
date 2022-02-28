package com.groupc.controller.admin_action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.controller.action.Action;
import com.groupc.dao.AdminDao;
import com.groupc.dto.AdminVO;

public class AdminLoginAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adminId = request.getParameter("adminId");
		String adminPwd = request.getParameter("adminPwd");
		
		String url = "bs.do?cmd=admin";
		
		AdminDao adao = AdminDao.getInstance();
		AdminVO avo = adao.getWorker(adminId);
		ArrayList<Integer> cnt = adao.getCnt();
		
		if(avo == null) {
			request.setAttribute("message", "존재하지 않는 아이디");
		}else if(avo.getPwd() == null) {
			request.setAttribute("message", "관리자에게 문의하세요");
		}else if(!avo.getPwd().equals(adminPwd)) {
			request.setAttribute("message", "비밀번호가 다릅니다");
		}else if(avo.getPwd().equals(adminPwd)) {
			HttpSession session = request.getSession();
			session.setAttribute("loginAdmin", avo);
			session.setAttribute("cnt", cnt);
			url = "admin/adminMain.jsp";
		}else {
			request.setAttribute("message", "로그인 실패 관리자에게 문의");
		}
		request.getRequestDispatcher(url).forward(request, response);
	}

}
