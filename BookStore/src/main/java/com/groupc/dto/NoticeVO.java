package com.groupc.dto;

import java.sql.Timestamp;

public class NoticeVO {
	private Integer nseq;
	private String id;
	private String subject;
	private String content;
	private Timestamp indate;
	private String useyn;
	
	public Integer getNseq() {
		return nseq;
	}
	public void setNseq(Integer nseq) {
		this.nseq = nseq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getIndate() {
		return indate;
	}
	public void setIndate(Timestamp indate) {
		this.indate = indate;
	}
	public String getUseyn() {
		return useyn;
	}
	public void setUseyn(String useyn) {
		this.useyn = useyn;
	}
	
}
