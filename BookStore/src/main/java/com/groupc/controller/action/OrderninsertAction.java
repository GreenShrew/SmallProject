package com.groupc.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.dao.OrderDao;
import com.groupc.dao.ProductDao;
import com.groupc.dto.MemberVO;
import com.groupc.dto.NonMemberVO;
import com.groupc.dto.ProductVO;

public class OrderninsertAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "";
		
		HttpSession session = request.getSession();
		MemberVO mvo = (MemberVO)session.getAttribute("loginUser");

		NonMemberVO nmvo = new NonMemberVO();
		nmvo.setName(request.getParameter("name"));
		nmvo.setPhone(request.getParameter("phone"));
		nmvo.setZip_num(request.getParameter("zip_num"));
		nmvo.setAddress(request.getParameter("addr1")+" "+request.getParameter("addr2"));
		nmvo.setEmail(request.getParameter("email"));
		
		int bseq = Integer.parseInt(request.getParameter("bseq"));
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		
		if(mvo!=null) {
			url = "bs.do?cmd=index";
		}else {
			ProductDao pdao = ProductDao.getInstance();
			ProductVO pvo = pdao.getProduct(bseq);
			
			// 날짜 + 시퀀스 값을 주문번호로 만들 생각을 하자
			// 다만 지금은 시퀀스를 10000번부터 시작하게 만들었다.

			OrderDao odao = OrderDao.getInstance();
			int od_pass = odao.insertnOrder(pvo, nmvo, quantity);
			url = "bs.do?cmd=nOrderResult";
			request.setAttribute("od_pass", od_pass);
			request.setAttribute("bname", pvo.getBname());
		}
		// 주문이 완료되었다는 페이지로 넘어간다.
		// 넘어갈때 od_pass를 같이 보낸다.
		// 또한 책이름도 같이 보내서 해당 책의 구매가 완료되었다는 안내를 한다.
		request.getRequestDispatcher(url).forward(request, response);
	}

}
