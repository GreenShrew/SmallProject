package com.groupc.controller;

import com.groupc.controller.action.Action;
import com.groupc.controller.action.IndexAction;

public class ActionFactory {
	private ActionFactory () {}
	private static ActionFactory itc = new ActionFactory();
	public static ActionFactory getInstance() {return itc;}
	
	public Action getAction(String cmd) {
		Action ac = null;
		
		if(cmd.equals("index")) {ac = new IndexAction();
		}
		return ac;
	}
	
	

}
