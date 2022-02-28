package com.groupc.controller.admin_action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.controller.action.Action;
import com.groupc.dao.AdminDao;
import com.groupc.dto.AdminVO;
import com.groupc.dto.MemberVO;

public class AdminMemberUpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "bs.do?cmd=adminMemberList";
		
		HttpSession session = request.getSession();
		AdminVO avo = (AdminVO)session.getAttribute("loginAdmin");
		
		if(avo == null) {
			url = "bs.do?cmd=admin";
		}else {
			MemberVO mvo = new MemberVO();
			mvo.setId(request.getParameter("id"));
			mvo.setName(request.getParameter("name"));
			mvo.setPwd(request.getParameter("pwd"));
			mvo.setEmail(request.getParameter("email"));
			mvo.setPhone(request.getParameter("phone"));
			mvo.setZip_num(request.getParameter("zip_num"));
			mvo.setAddress(request.getParameter("address"));
			mvo.setUseyn(request.getParameter("useyn_radio"));
			mvo.setGender(request.getParameter("gender_radio"));
			mvo.setPoint(Integer.parseInt(request.getParameter("point")));
			
			AdminDao adao = AdminDao.getInstance();
			adao.updateMember(mvo);
		}
		request.getRequestDispatcher(url).forward(request, response);
	}

}
