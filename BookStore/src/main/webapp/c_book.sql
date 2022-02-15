drop table member cascade constraints;
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
select * from member;

drop table nonmember cascade constraints;
CREATE TABLE nonmember(
	phone VARCHAR2(20) PRIMARY KEY,
	name VARCHAR2(20),
	email VARCHAR2(20),
	od_pass VARCHAR2(20) NOT NULL,		-- 비회원 주문번호
	zip_num varchar2(10) NOT NULL,	-- 비회원 우편번호
	address VARCHAR2(100)
);

drop table bookproduct cascade constraints;
CREATE TABLE bookproduct(
	bseq number(5) NOT NULL PRIMARY KEY,	-- 책번호
	bname varchar2(100) NOT NULL,		-- 책이름
	byear number(10),	-- 출판년도
	kind char(1),	-- ?
	price number(7),		-- 가격
	publisher varchar2(30), -- 출판사
	genre varchar2(10), -- 장르
	content varchar2(1000),	-- 책 내용설명
	image varchar2(50),	-- 책 이미지
	useyn char(1) DEFAULT 'y',     -- 상품 판매 유효 여부
	bestyn char(1) DEFAULT 'n',   -- 베스트상품 진열 여부
	indate date DEFAULT sysdate    -- 등록일
);
drop sequence bookproduct_seq;
create sequence bookproduct_seq start with 1;
select * from bookproduct;


CREATE TABLE review (
	rseq NUMBER(5) NOT NULL PRIMARY KEY,
	bseq NUMBER(5) NOT NULL,
	id VARCHAR2(20) NOT NULL,
	content VARCHAR2(1000),
	score  CHAR(1) DEFAULT '3'
);
drop sequence review_seq;
create sequence review_seq start with 1;
select * from review;




-- 쇼핑몰 관리자 테이블
drop table worker cascade constraints;
CREATE TABLE worker (
	id varchar2(20) NOT NULL PRIMARY KEY,
	pwd varchar2(20) NOT NULL,
	name varchar2(20) NOT NULL,
	phone varchar2(20) NOT NULL
);


insert into worker values('admin', 'admin', '관리자', '010-7777-7777');

drop table cart cascade constraints;
create table cart (
  cseq number(10) primary key,  -- 장바구니 일련번호
  id varchar2(16) references member(id),   -- 주문자 아이디(FK :　member.id) 
  bseq number(5) references bookproduct(bseq),  -- 주문 상품번호(FK :bookproduct.bseq) 
  quantity number(5) default 1,        -- 주문 수량
  result char(1) default '1',      -- 1:미처리(카트에 담김 상태, 주문전)   2:처리(주문완료)
  indate date default SYSDATE   -- 장바구니에 담은 날짜
);
drop sequence cart_seq;
create sequence cart_seq start with 1;
select * from cart;

drop table orders cascade constraints;
CREATE TABLE orders(
	oseq number(10) primary key,
	id VARCHAR2(20) REFERENCES member(id),
	indate DATE DEFAULT sysdate,
	phone varchar2(20) REFERENCES nonmember(phone)
);
drop sequence orders_seq;
create sequence orders_seq start with 1;
select * from orders;


drop table order_detail cascade constraints;
CREATE TABLE order_detail(
	odseq number(10) primary key,		-- 주문 상세번호
	oseq NUMBER(10) REFERENCES orders(oseq),	-- 주문번호
	bseq number(5) references bookproduct(bseq),	-- 상품번호
	result char(1) default '1',	-- 주문 처리 상황 1:미처리 2:처리 
	quantity number(5) default 5		-- 주문 수량
);
drop sequence order_detail_seq;
create sequence order_detail_seq start with 1;
select * from order_detail;


drop table qna cascade constraints;
CREATE TABLE qna(
	qseq number(10) primary key,
	subject VARCHAR2(50),
	content VARCHAR2(1000),
	reply VARCHAR2(1000),
	id VARCHAR2(20) REFERENCES member(id),
	rep CHAR(1) DEFAULT '1', -- 답변 여부
	indate DATE DEFAULT sysdate
);
drop sequence qna_seq;
create sequence qna_seq start with 1;
select * from qna;



create table address(
	zip_num varchar2(7) not null,
	sido varchar2(30) not null,
	gugun varchar2(30) not null,
	dong varchar(100) not null,
	zip_code varchar2(30),
	bunji varchar2(30)
);


select * from address;
select * from member;