package com.groupc.controller;

import com.groupc.controller.action.Action;
import com.groupc.controller.action.CartListAction;
import com.groupc.controller.action.ContractAction;
import com.groupc.controller.action.IdCheckFormAction;
import com.groupc.controller.action.IndexAction;
import com.groupc.controller.action.LoginFormAction;
import com.groupc.controller.action.OrderListAction;
import com.groupc.controller.action.QnaListAction;
import com.groupc.controller.action.joinFormAction;

public class ActionFactory {
	private ActionFactory () {}
	private static ActionFactory itc = new ActionFactory();
	public static ActionFactory getInstance() {return itc;}
	
	public Action getAction(String cmd) {
		Action ac = null;
		
		if(cmd.equals("index")) {ac = new IndexAction();}
		
		//join
		else if(cmd.equals("joinForm")) {ac = new joinFormAction();}
		
		// qna
		else if(cmd.equals("qnaList")) {ac = new QnaListAction();}
		
		// order
		else if(cmd.equals("orderList")) {ac = new OrderListAction();}

		// cart
		else if(cmd.equals("cartList")) {ac = new CartListAction();}
		
		// loginForm
		else if(cmd.equals("loginForm")) {ac = new LoginFormAction();}
		
		// contract
		else if(cmd.equals("contract")) {ac = new ContractAction();}
		
		// idCheckForm
		else if(cmd.equals("idCheckForm")) ac = new IdCheckFormAction();
		
		return ac;
	}
	
	

}
