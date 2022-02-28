package com.groupc.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.dao.CartDao;
import com.groupc.dao.OrderDao;
import com.groupc.dto.CartVO;
import com.groupc.dto.MemberVO;

public class OrderInsertAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "";
		
		String[] cseqlist = request.getParameterValues("cseq");
		
		HttpSession session = request.getSession();
		MemberVO mvo = (MemberVO) session.getAttribute("loginUser");
		
//		System.out.println("cseqlist  " + cseqlist.length);
		if (mvo == null) {
		    url = "bs.do?cmd=loginForm";
		}else {
			CartDao cdao = CartDao.getInstance();
			OrderDao odao = OrderDao.getInstance();
			ArrayList<CartVO> list = new ArrayList<CartVO>();
			int Oseq = 0;
			for(String cseq : cseqlist) {
				list = cdao.selectCartByCseq(Integer.parseInt(cseq));
//				System.out.println("list.size  " + list.size());
				Oseq = odao.insertOrder(list, mvo.getId());
//				System.out.println("oseq  " + Oseq);
			}
			
			
			url = "bs.do?cmd=orderResult&oseq="+ Oseq;
		}
		response.sendRedirect(url);

	}

}
