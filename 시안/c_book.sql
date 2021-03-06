CREATE TABLE member (
	id varchar2(20) NOT NULL PRIMARY KEY ,
	pwd varchar2(20) NOT NULL,
	name varchar2(20) NOT NULL,
	email varchar2(40) NOT NULL,
	zip_num varchar2(10) NOT NULL,
	address varchar2(100) NOT NULL,
	phone varchar2(20) NOT NULL,
	useyn char(1) DEFAULT 'y',    -- 휴면 계정 여부
	indate date DEFAULT sysdate,
	gender CHAR(1),
	point NUMBER(10)
);

CREATE TABLE nonmember(
	phone VARCHAR2(20) PRIMARY KEY,
	name VARCHAR2(20),
	email VARCHAR2(20),
	od_pass VARCHAR2(20),
	address VARCHAR2(100)
);


CREATE TABLE bookproduct(
	bseq number(5) NOT NULL PRIMARY KEY,
	bname varchar2(100) NOT NULL,
	kind char(1) NOT NULL,
	price number(7),
	publisher varchar2(10), -- 출판사
	genre NUMBER(10), - 출판년도
	content varchar2(1000),
	image varchar2(50),
	useyn char(1) DEFAULT 'y',     -- 상품 판매 유효 여부
	bestyn char(1) DEFAULT 'n',   -- 베스트상품 진열 여부
	indate date DEFAULT sysdate    -- 등록일
	
);

CREATE TABLE review (
	rseq NUMBER(5) NOT NULL PRIMARY KEY,
	bseq NUMBER(5) NOT NULL,
	id VARCHAR2(20) NOT NULL,
	content VARCHAR2(1000),
	score  CHAR(1) DEFAULT '3'
);




-- 쇼핑몰 관리자 테이블

CREATE TABLE worker (
	id varchar2(20) NOT NULL PRIMARY KEY,
	pwd varchar2(20) NOT NULL,
	name varchar2(20) NOT NULL,
	phone varchar2(20) NOT NULL
);

create table cart (
  cseq number(10) primary key,  -- 장바구니 일련번호
  id varchar2(16) references member(id),   -- 주문자 아이디(FK :　member.id) 
  bseq number(5) references bookproduct(pseq),  -- 주문 상품번호(FK :product.pseq) 
  quantity number(5) default 1,        -- 주문 수량
  result char(1) default '1',      -- 1:미처리(카트에 담김 상태, 주문전)   2:처리(주문완료)
  indate date default SYSDATE   -- 장바구니에 담은 날짜
  
);

CREATE TABLE orders(
	oseq number(10) primary key,
	id VARCHAR2(20) REFERENCES member(id),
	indate DATE DEFAULT sysdate
);

CREATE TABLE order_detail(
	odseq number(10) primary key,
	oseq NUMBER(10) REFERENCES orders(oseq);
	bseq number(5) references bookproduct(pseq)
	result
	quantity
);

CREATE TABLE qna(
	qseq number(10) primary key,
	subject VARCHAR2(50),
	content VARCHAR2(1000),
	reply VARCHAR2(1000),
	id VARCHAR2(20) REFERENCES member(id),
	rep CHAR(1) DEFAULT '1', -- 답변 여부
	indate DATE DEFAULT sysdate
);

