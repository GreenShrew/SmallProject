package com.groupc.util;

public class Paging {
	private int page = 1;
	private int totalCount;
	private int beginPage;
	private int endPage;
	private int totalPage;
	private int displayRow;
	private int displayPage = 3;
	boolean prev;
	boolean next;
	boolean end;
	private int startNum;
	private int endNum;
	
	
	private void paging() {
		displayRow = 10;
		
		endPage = ((int)Math.ceil(page/(double)displayPage)) * displayPage;
		beginPage = endPage - (displayPage - 1);
		totalPage = (int)Math.ceil(totalCount / (double)displayRow);
		if(totalPage < endPage) {
			endPage = totalPage;
			next = false;
		}else {
			next = true;
		}
		end = (endPage == totalPage)? false:true;
		prev = (beginPage == 1)? false:true;
		startNum = (page-1) * displayRow + 1;
		endNum = page * displayRow;
		/*
		System.out.println("displayRow" + displayRow);
		System.out.println("beginPage" + beginPage);
		System.out.println("endPage" + endPage);
		System.out.println("startNum" + startNum);
		System.out.println("endNum" + endNum);
		*/
	}


	public int getPage() {
		return page;
	}


	public void setPage(int page) {
		this.page = page;
	}


	public int getTotalCount() {
		return totalCount;
	}


	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		paging();
	}


	public int getBeginPage() {
		return beginPage;
	}


	public void setBeginPage(int beginPage) {
		this.beginPage = beginPage;
	}


	public int getEndPage() {
		return endPage;
	}


	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getTotalPage() {
		return totalPage;
	}


	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}


	public int getDisplayRow() {
		return displayRow;
	}


	public void setDisplayRow(int displayRow) {
		this.displayRow = displayRow;
	}


	public int getDisplayPage() {
		return displayPage;
	}


	public void setDisplayPage(int displayPage) {
		this.displayPage = displayPage;
	}


	public boolean isPrev() {
		return prev;
	}


	public void setPrev(boolean prev) {
		this.prev = prev;
	}


	public boolean isNext() {
		return next;
	}


	public void setNext(boolean next) {
		this.next = next;
	}


	public boolean isEnd() {
		return end;
	}


	public void setEnd(boolean end) {
		this.end = end;
	}

	public int getStartNum() {
		return startNum;
	}


	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}


	public int getEndNum() {
		return endNum;
	}


	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}
	
}
