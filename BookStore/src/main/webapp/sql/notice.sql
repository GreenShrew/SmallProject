--notice
DROP TABLE notice CASCADE CONSTRAINTS;
create table notice(
	nseq number(10) primary key,
	id VARCHAR2(20) REFERENCES worker(id),
	subject varchar2(50),
	content varchar2(1000),
	indate date default sysdate, 
	useyn CHAR(1) DEFAULT 'y'
);

DROP SEQUENCE notice_seq;
CREATE SEQUENCE notice_seq INCREMENT BY 1 START WITH 1 NOCACHE;
SELECT notice_seq.currVal, notice_seq.nextVal FROM dual;
select * from notice;

insert into notice(nseq, id, subject, content) 
values(notice_seq.nextVal, 'scott', '택배사 파업으로 인한 배송 지연 안내', '현재 택배 파업으로 인해 배송이 지연되고 있습니다.
당일배송 주문 또한 수령시간이 지연될 수 있으니 고객님들의 양해 부탁드립니다.');
insert into notice(nseq, id, subject, content) 
values(notice_seq.nextVal, 'scott', '개인정보처리 방침 안내', '1. 시행 일자 : 2020년 11월 16일 2. 주요 개정 내용
- 개정 조항: 3조 개인정보의 수집항목 및 수집방법');
insert into notice(nseq, id, subject, content) 
values(notice_seq.nextVal, 'admin', '우체국택배 배송지연안내', '- 사유 : 우체국택배 물량 과다로 인한 제한 조치
- 예상 지연 일수 : 약 7~8일');