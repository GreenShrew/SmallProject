package com.groupc.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.dao.CartDao;
import com.groupc.dto.CartVO;
import com.groupc.dto.MemberVO;

public class CartInsertMultiAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberVO mvo = (MemberVO)session.getAttribute("loginUser");

		String [] checkboxArr = request.getParameterValues("checkbox");
		
		
		String url = "bs.do?cmd=cartList";
		String msg = "";
		
		if(mvo==null) {
			url = "bs.do?cmd=loginForm";
			msg = "로그인 후 이용해주세요.";
			request.setAttribute("msg", msg);
		}else {
			CartDao cdao = CartDao.getInstance();
			for(String bseq : checkboxArr) {
				cdao.insertCartArr(mvo.getId(), Integer.parseInt(bseq));
			}
		}
		// 뒤로가기 누르면 또 추가될까봐
		response.sendRedirect(url);
	}

}
