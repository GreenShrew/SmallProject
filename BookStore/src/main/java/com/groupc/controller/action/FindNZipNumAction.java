package com.groupc.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.groupc.dao.MemberDao;
import com.groupc.dto.AddressVO;

public class FindNZipNumAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "nonmember/findNZipNum.jsp";
		String dong = request.getParameter("dong");
		if(dong!=null) {
			MemberDao mdao = MemberDao.getInstance();
			ArrayList<AddressVO> list = mdao.selectAddress(dong);
			request.setAttribute("addressList",list);
		}
		request.getRequestDispatcher(url).forward(request, response);
	}

}
