CREATE TABLE nonmember(
	phone VARCHAR2(20) NOT NULL,
	od_pass VARCHAR2(20) NOT NULL PRIMARY KEY,	-- 비회원 주문번호 시퀀스
	name VARCHAR2(20),
	email VARCHAR2(20),
	zip_num VARCHAR2(10),	-- 비회원 우편번호
	address VARCHAR2(100),
	indate DATE DEFAULT sysdate
);

CREATE SEQUENCE od_pass_seq INCREMENT BY 1 START WITH 100000 NOCACHE;

/*
CREATE TABLE nm_orders(
	oseq NUMBER(10) PRIMARY KEY,	---- 시퀀스
	od_pass VARCHAR2(20) REFERENCES nonmember(od_pass), 	-- 시퀀스
	indate DATE DEFAULT sysdate
);

CREATE SEQUENCE nm_orders_seq INCREMENT BY 1 START WITH 1 NOCACHE;	-- oseq 시퀀스
*/

CREATE TABLE nm_order_detail(
	odseq NUMBER(10) PRIMARY KEY,		-- 주문 상세번호, 시퀀스
	od_pass NUMBER(10) REFERENCES nm_orders(od_pass),	-- 주문번호
	bseq NUMBER(5) REFERENCES bookproduct(bseq),	-- 상품번호
	result CHAR(1) DEFAULT '1',	-- 주문 처리 상황 1:미처리 2:처리 
	quantity NUMBER(5) DEFAULT 1		-- 주문 수량
);



CREATE OR REPLACE VIEW non_order_view
AS
SELECT d.odseq, o.oseq, o.indate, nm.od_pass,
			nm.name AS nmname, nm.zip_num, nm.address, nm.phone, 
			d.bseq, b.bname AS bname, b.price, d.quantity, d.result
FROM nm_orders o, nm_order_detail d, nonmember nm, bookproduct b
WHERE o.oseq = d.oseq AND o.od_pass = nm.od_pass AND d.bseq = b.bseq;
select * from non_order_view;