package com.groupc.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.groupc.dao.OrderDao;
import com.groupc.dto.MemberVO;
import com.groupc.dto.OrderVO;

public class OrderListAction implements Action {
	// 고객의 주문내역을 담은 orderTemp.jsp로 보낸다.
	// 단, 비회원의 경우 
	// #1. 비회원용 주문 id를 인증하지 않았다면  loginForm으로
	// #2. 비회원용 주문 id를 인증했다면 orderTemp.jsp로
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "mypage/orderList.jsp";
		HttpSession session = request.getSession();
		MemberVO mvo = (MemberVO) session.getAttribute("loginUser");
	    
		
		// 즉, 아래의 if 조건문에 'and 비회원용id==null' 을 넣는다.
		// else if를 추가하여 '비회원용 id != null' 조건을 달고 비회원용 테이블에서 정보를 긁어올 수 있도록 만든다.
		if(mvo==null) {
	    	url = "bs.do?cmd=loginForm";
	    }else {
	    	OrderDao odao = OrderDao.getInstance();
	    	ArrayList<OrderVO> finalList = new ArrayList<OrderVO>();  // 아래에서 언급한 별도의 리스트, mypage.jsp 에 전달될 리스트
	    	ArrayList<Integer> oseqList	= odao.selectOseqOrderAll( mvo.getId() );  // 주문번호들의 리스트, 중복을 없앤 검색
	    	for(Integer oseq : oseqList) { // 리스트에 담긴 주문 번호들을 하나씩 꺼내서 반복실행
	    		ArrayList<OrderVO> orderListByOseq = odao.listOrderByOseq( oseq );  // 주문 번호별 주문상품 리스트
	    		OrderVO ovo = orderListByOseq.get(0);
	    		ovo.setBname( ovo.getBname() + " 포함 " + orderListByOseq.size() + " 건");
	    		int totalPrice = 0;
	            for (OrderVO ovo1 : orderListByOseq)  
	            	totalPrice += ovo1.getPrice() * ovo1.getQuantity();
	            ovo.setPrice(totalPrice);
	            finalList.add(ovo);
	    	}
	    	request.setAttribute("orderList", finalList);
	    	request.setAttribute("title", "총 주문 내역");
	    }
	    request.getRequestDispatcher(url).forward(request, response);

	}

}
