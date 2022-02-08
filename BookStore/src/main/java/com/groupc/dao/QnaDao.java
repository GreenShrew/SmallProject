package com.groupc.dao;

public class QnaDao {
	private QnaDao() {}
	private static QnaDao itc = new QnaDao();
	public static QnaDao getInstance() {return itc;}
}
