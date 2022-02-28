package com.groupc.dto;

import java.sql.Timestamp;

public class OrderVO {
	private Integer odseq;
	private Integer oseq;
	private Timestamp indate;
	private String id;
	private String mname;
	private String zip_num;
	private String address;
	private String phone;
	private Integer bseq;
	private String bname;
	private Integer price;
	private Integer quantity;
	private String result;
	public Integer getOdseq() {
		return odseq;
	}
	public void setOdseq(Integer odseq) {
		this.odseq = odseq;
	}
	public Integer getOseq() {
		return oseq;
	}
	public void setOseq(Integer oseq) {
		this.oseq = oseq;
	}
	public Timestamp getIndate() {
		return indate;
	}
	public void setIndate(Timestamp indate) {
		this.indate = indate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getZip_num() {
		return zip_num;
	}
	public void setZip_num(String zip_num) {
		this.zip_num = zip_num;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getBseq() {
		return bseq;
	}
	public void setBseq(Integer bseq) {
		this.bseq = bseq;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	
}
