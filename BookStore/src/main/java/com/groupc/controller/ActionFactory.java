package com.groupc.controller;

import com.groupc.controller.action.Action;
import com.groupc.controller.action.CartDeleteAction;
import com.groupc.controller.action.CartInsertAction;
import com.groupc.controller.action.CartInsertMultiAction;
import com.groupc.controller.action.CartListAction;
import com.groupc.controller.action.ContractAction;
import com.groupc.controller.action.EditFormAction;
import com.groupc.controller.action.FindIdAction;
import com.groupc.controller.action.FindNZipNumAction;
import com.groupc.controller.action.FindPwdAction;
import com.groupc.controller.action.FindZipNumAction;
import com.groupc.controller.action.IdCheckFormAction;
import com.groupc.controller.action.IdResultAction;
import com.groupc.controller.action.IndexAction;
import com.groupc.controller.action.JoinAction;
import com.groupc.controller.action.LoginAction;
import com.groupc.controller.action.LoginFormAction;
import com.groupc.controller.action.LogoutAction;
import com.groupc.controller.action.MemberUpdateAction;
import com.groupc.controller.action.MenuAction;
import com.groupc.controller.action.MypageAction;
import com.groupc.controller.action.NOrderListAction;
import com.groupc.controller.action.NOrderResultAction;
import com.groupc.controller.action.NmemberBuyFormAction;
import com.groupc.controller.action.NoticeListAction;
import com.groupc.controller.action.NoticeViewAction;
import com.groupc.controller.action.OrderAllAction;
import com.groupc.controller.action.OrderDetailAction;
import com.groupc.controller.action.OrderInsertAction;
import com.groupc.controller.action.OrderListAction;
import com.groupc.controller.action.OrderOneAction;
import com.groupc.controller.action.OrderninsertAction;
import com.groupc.controller.action.ProSideAction;
import com.groupc.controller.action.ProductDetailAction;
import com.groupc.controller.action.PwdResultAction;
import com.groupc.controller.action.QnaListAction;
import com.groupc.controller.action.QnaViewAction;
import com.groupc.controller.action.QnaWriteAction;
import com.groupc.controller.action.QnaWriteFormAction;
import com.groupc.controller.action.WriteReviewAction;
import com.groupc.controller.action.joinFormAction;
import com.groupc.controller.action.nonmemberLoginAction;
import com.groupc.controller.admin_action.AdminAction;
import com.groupc.controller.admin_action.AdminLoginAction;
import com.groupc.controller.admin_action.AdminLogoutAction;

public class ActionFactory {
	private ActionFactory () {}
	private static ActionFactory itc = new ActionFactory();
	public static ActionFactory getInstance() {return itc;}
	
	public Action getAction(String cmd) {
		Action ac = null;
		
		if(cmd.equals("index")) {ac = new IndexAction();}
		
		/**/
		// login
		else if( cmd.equals("loginForm")) { ac = new LoginFormAction();}
		else if( cmd.equals("login")) { ac = new LoginAction();}
		else if( cmd.equals("logout") ) ac = new LogoutAction();

		// nonmember
		else if( cmd.equals("nonmemberlogin")) { ac = new nonmemberLoginAction();}
		
		// mypage
		else if( cmd.equals("mypage")) { ac = new MypageAction();}
		
		// join
		else if(cmd.equals("joinForm")) {ac = new joinFormAction();}
		else if(cmd.equals("join")) {ac = new JoinAction();}
		
		// productDetail
		else if(cmd.equals("productDetail")) ac = new ProductDetailAction();
		
		// qna
		else if(cmd.equals("qnaList")) {ac = new QnaListAction();}
		else if(cmd.equals("qnaView") ) ac = new QnaViewAction();
		else if(cmd.equals("qnaWrite") ) ac = new QnaWriteAction();
		else if(cmd.equals("qnaWriteForm") ) ac = new QnaWriteFormAction();
		else if(cmd.equals("noticeList")) ac = new NoticeListAction();
		else if(cmd.equals("noticeView")) ac = new NoticeViewAction();
		
		// order
		else if(cmd.equals("orderList")) {ac = new OrderListAction();}
		else if(cmd.equals("orderInsert") ) ac = new OrderInsertAction();
		else if(cmd.equals("orderAll")) ac = new OrderAllAction();
		else if(cmd.equals("orderDetail")) ac = new OrderDetailAction();
		else if(cmd.equals("orderOne")) ac = new OrderOneAction();
		
		
		// cart
		else if(cmd.equals("cartList")) {ac = new CartListAction();}
		else if(cmd.equals("cartInsert")) ac = new CartInsertAction();
		else if(cmd.equals("cartDelete") ) ac = new CartDeleteAction();
		else if(cmd.equals("cartInsertMulti") ) ac = new CartInsertMultiAction();
		
		// contract
		else if(cmd.equals("contract")) {ac = new ContractAction();}
		
		// idCheckForm
		else if(cmd.equals("idCheckForm")) ac = new IdCheckFormAction();
		
		// findZipNum
		else if(cmd.equals("findZipNum")) ac = new FindZipNumAction();
		
		// findId, findPwd
		else if(cmd.equals("findId")) ac = new FindIdAction();
		else if(cmd.equals("findPwd")) ac = new FindPwdAction();
		
		// idResult
		else if(cmd.equals("idResult")) ac = new IdResultAction();
		
		// pwdResult
		else if(cmd.equals("pwdResult")) ac = new PwdResultAction();
		
		// menu&kind
		else if(cmd.equals("menu"))ac = new MenuAction(); // top_menu action
		else if(cmd.equals("proSide"))ac = new ProSideAction(); // prodcut side_menu action
//		else if(cmd.equals("searching"))ac = new SearchingAction(); // index.jsp searching -> view product
		else if(cmd.equals("writeReview")) ac = new WriteReviewAction();
		
		// admin
		else if(cmd.equals("admin"))ac = new AdminAction();
		else if(cmd.equals("adminLogin"))ac = new AdminLoginAction();
		else if(cmd.equals("adminLogout"))ac = new AdminLogoutAction();
		
		// edit
		else if(cmd.equals("editForm"))ac = new EditFormAction();
		else if( cmd.equals("memberUpdate") ) ac = new MemberUpdateAction();
		
		// nmember
		// nmemberBuyForm(비회원 상품구매 정보입력 페이지)
		else if(cmd.equals("nmemberBuyForm"))ac = new NmemberBuyFormAction();
		// orderninsert(비회원 상품구매 기능)
		else if(cmd.equals("orderninsert"))ac = new OrderninsertAction();
		// nOrderResult(비회원 상품구매 결과 페이지)
		else if(cmd.equals("nOrderResult"))ac = new NOrderResultAction();
		// findNZipNum(비회원 주문시 주소찾기)
		else if(cmd.equals("findNZipNum"))ac = new FindNZipNumAction();
		// nOrderList(비회원 주문목록)
		else if(cmd.equals("nOrderList"))ac = new NOrderListAction();
		
		
		
		return ac;
	}
	
	

}
