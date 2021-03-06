SELECT table_name FROM all_tables;


SELECT * FROM information_schema.tables;

SELECT * FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_TYPE='BASE TABLE';
SELECT * FROM sysobjects WHERE xtype='U';

Showing all table: show tables;

SELECT owner, table_name FROM all_tables;

SELECT owner, table_name FROM dba_tables;

SELECT * FROM bookproduct WHERE genre = 'edu' ORDER BY bseq DESC;



SELECT * FROM order_view;


SELECT * FROM member;
SELECT * FROM Address;






SELECT * FROM localviewList ;
SELECT * FROM localviewList;

select * from (
select rownum as rn, p.* from
((select * from product  where name like '%'||?||'%'  order by pseq desc) p)
) where rn>=?
) where rn<=?

SELECT * FROM bookproduct WHERE kind='g';
SELECT * FROM bookproduct WHERE kind LIKE '%%';


CREATE OR REPLACE VIEW bestList
AS
SELECT * FROM
	(SELECT * FROM bookproduct WHERE bestyn='y' ORDER BY indate DESC)
WHERE rownum <= 21;


-- bestoneList
SELECT * FROM bestlist WHERE rownum = 1;
-- bestList
SELECT * FROM bestlist WHERE rownum > 1;

CREATE OR REPLACE VIEW bestviewList
AS
SELECT * FROM
	(SELECT rownum AS rn, best.* FROM
		((SELECT * FROM bookproduct WHERE bestyn='y' ORDER BY indate DESC) best)
	WHERE rownum <= 21);
	
SELECT * FROM bestviewList;

SELECT * FROM bestviewList WHERE rn > 10;
SELECT * FROM bestviewList WHERE rn > 1;
SELECT * FROM bestviewList WHERE rn = 1;


SELECT * FROM bestviewList;
SELECT * FROM review;

SELECT best.*, COUNT(r.rseq) AS rcnt, AVG(r.score) AS avg 
FROM (SELECT * FROM bestviewList WHERE rownum = 1) best, review r
WHERE best.bseq = r.bseq GROUP BY r.bseq;


-- μΆμ²λμ 
CREATE OR REPLACE VIEW recommand_pro_view
AS
SELECT * FROM
(SELECT rownum, bseq, bname, price, image, writer
FROM bookproduct
WHERE useyn='y'
ORDER BY DBMS_RANDOM.RANDOM)
WHERE rownum <= 8;

SELECT * FROM recommand_pro_view;





SELECT COUNT(*) AS cnt FROM bookproduct WHERE bestyn='y';
SELECT COUNT(*) AS cnt FROM review r, member m WHERE r.id = m.id;
SELECT * FROM review;
SELECT * FROM bookproduct;



DROP TABLE testqwer CASCADE constraints;
CREATE TABLE testqwer(
	bseq NUMBER(5) NOT NULL PRIMARY KEY,
	bname VARCHAR2(100) NOT NULL,	
	writer VARCHAR2(100), 
	publisher VARCHAR2(100), 
	byear VARCHAR2(40),
	price NUMBER(10),
	content VARCHAR2(4000),	
	kind CHAR(1),	
	genre VARCHAR2(60), 
	image VARCHAR2(50),	
	useyn CHAR(1) DEFAULT 'y',  
	bestyn CHAR(1) DEFAULT 'n',
	indate DATE DEFAULT sysdate 
);
SELECT * FROM testqwer;

INSERT INTO testqwer(bseq, bname, writer, publisher, byear, price, content, kind, genre, image, bestyn) 
 VALUES(1, 'λ¬λ¬κ΅¬νΈ κΏ λ°±νμ ', 'μ΄λ―Έμ', 'ν©ν λ¦¬λμΈ', '2020λ 07μ', '12420', 
'μ λ€μ΄μΌλ§ μμ₯ν  μ μλ λνΉν λ§μ. κ·Έκ³³μ λ€μ΄μ¨ μ λ  μλλ€μκ² κ°μ₯ μΈκΈ° μλ κ³³μ, μ¨κ° κΏμ νλ° λͺ¨μ νλ§€νλ βλ¬λ¬κ΅¬νΈμ κΏ λ°±νμ βμ΄λ€. κΈ΄ μ μ μλ μ¬λλ€μ λ¬Όλ‘ μ΄κ³ , μ§§μ λ?μ μ μλ μ¬λλ€κ³Ό λλ¬Όλ€λ‘ λ§€μΌλ§€μΌ λμ±ν©μ μ΄λ£¬λ€. λ²μμΉ μμ νν΅μ μ£ΌμΈμ₯ βλ¬λ¬κ΅¬νΈβ, κ·Έλ¦¬κ³  κ·Έμ μ΅μΈ‘κ·Ό...', 
'l', 'edu', '02.png.png', 'y');

INSERT INTO testqwer(bseq, bname, writer, publisher, byear, price, content, kind, genre, image, bestyn) 
 VALUES(2, 'λ¬λ¬κ΅¬νΈ κΏ λ°±νμ  2', 'μ΄λ―Έμ', 'ν©ν λ¦¬λμΈ', '2021λ 07μ', '12,420', 
'100λ§ λμλ₯Ό μ¬λ‘μ‘μ γλ¬λ¬κ΅¬νΈ κΏ λ°±νμ γ, κ·Έ λ λ²μ§Έ μ΄μΌκΈ°μ΄λλ§ νλκ° λ¬λ¬κ΅¬νΈ κΏ λ°±νμ μμ μΌν μ§λ 1λμ΄ λμλ€. μ¬κ³ κ° λΆμ‘±ν κΏμ κ΄λ¦¬νκ³ , κΏκ° μ°½κ³ μμ κ°μ μΌλ‘ κ°λ μ°¬ λ³μ μ?κΈ°κ³ , νλ°νΈμ μλ§μ λκΊΌν μ μΈμ κ΄λ¦¬νλ μΌμ λ₯μν΄μ§ νλλ μμ κ°μ΄ λμΉλ€. κ²λ€κ° κΏ μ°μ μ’μ¬μλ‘ μΈ...', 
'l', 'edu', '03.png.png', 'y');

INSERT INTO testqwer(bseq, bname, writer, publisher, byear, price, content, kind, genre, image, bestyn) 
 VALUES(3, 'λ¬λ¬κ΅¬νΈ κΏ λ°±νμ ', 'μ΄λ―Έμ', 'ν©ν λ¦¬λμΈ', '2020λ 07μ', '12,420', 
'μ λ€μ΄μΌλ§ μμ₯ν  μ μλ λνΉν λ§μ. κ·Έκ³³μ λ€μ΄μ¨ μ λ  μλλ€μκ² κ°μ₯ μΈκΈ° μλ κ³³μ, μ¨κ° κΏμ νλ° λͺ¨μ νλ§€νλ βλ¬λ¬κ΅¬νΈμ κΏ λ°±νμ βμ΄λ€. κΈ΄ μ μ μλ μ¬λλ€μ λ¬Όλ‘ μ΄κ³ , μ§§μ λ?μ μ μλ μ¬λλ€κ³Ό λλ¬Όλ€λ‘ λ§€μΌλ§€μΌ λμ±ν©μ μ΄λ£¬λ€. λ²μμΉ μμ νν΅μ μ£ΌμΈμ₯ βλ¬λ¬κ΅¬νΈβ, κ·Έλ¦¬κ³  κ·Έμ μ΅μΈ‘κ·Ό...', 
'l', 'edu', '02.png', 'y');
INSERT INTO testqwer(bseq, bname, writer, publisher, byear, price, content, kind, genre, image, bestyn) 
 VALUES(4, 'λ¬λ¬κ΅¬νΈ κΏ λ°±νμ  2', 'μ΄λ―Έμ', 'ν©ν λ¦¬λμΈ', '2021λ 07μ', '12,420', 
'100λ§ λμλ₯Ό μ¬λ‘μ‘μ γλ¬λ¬κ΅¬νΈ κΏ λ°±νμ γ, κ·Έ λ λ²μ§Έ μ΄μΌκΈ°μ΄λλ§ νλκ° λ¬λ¬κ΅¬νΈ κΏ λ°±νμ μμ μΌν μ§λ 1λμ΄ λμλ€. μ¬κ³ κ° λΆμ‘±ν κΏμ κ΄λ¦¬νκ³ , κΏκ° μ°½κ³ μμ κ°μ μΌλ‘ κ°λ μ°¬ λ³μ μ?κΈ°κ³ , νλ°νΈμ μλ§μ λκΊΌν μ μΈμ κ΄λ¦¬νλ μΌμ λ₯μν΄μ§ νλλ μμ κ°μ΄ λμΉλ€. κ²λ€κ° κΏ μ°μ μ’μ¬μλ‘ μΈ...', 
'l', 'edu', '03.png', 'y');
SELECT * FROM testqwer;


INSERT INTO testqwer(bseq, bname, writer, publisher, byear, price, content, kind, genre, image, bestyn) 
 VALUES(6, 'λ¬λ¬κ΅¬νΈ κΏ λ°±νμ ', 'μ΄λ―Έμ', 'ν©ν λ¦¬λμΈ', '2020λ 07μ', '12420', 
'μ λ€μ΄μΌλ§ μμ₯ν  μ μλ λνΉν λ§μ. κ·Έκ³³μ λ€μ΄μ¨ μ λ  μλλ€μκ² κ°μ₯ μΈκΈ° μλ κ³³μ, μ¨κ° κΏμ νλ° λͺ¨μ νλ§€νλ βλ¬λ¬κ΅¬νΈμ κΏ λ°±νμ βμ΄λ€. κΈ΄ μ μ μλ μ¬λλ€μ λ¬Όλ‘ μ΄κ³ , μ§§μ λ?μ μ μλ μ¬λλ€κ³Ό λλ¬Όλ€λ‘ λ§€μΌλ§€μΌ λμ±ν©μ μ΄λ£¬λ€. λ²μμΉ μμ νν΅μ μ£ΌμΈμ₯ βλ¬λ¬κ΅¬νΈβ, κ·Έλ¦¬κ³  κ·Έμ μ΅μΈ‘κ·Ό...', 
'l', 'edu', '02.png', 'y');
INSERT INTO testqwer(bseq, bname, writer, publisher, byear, price, content, kind, genre, image, bestyn) 
 VALUES(5, 'λ¬λ¬κ΅¬νΈ κΏ λ°±νμ  2', 'μ΄λ―Έμ', 'ν©ν λ¦¬λμΈ', '2021λ 07μ', '12420', 
'100λ§ λμλ₯Ό μ¬λ‘μ‘μ γλ¬λ¬κ΅¬νΈ κΏ λ°±νμ γ, κ·Έ λ λ²μ§Έ μ΄μΌκΈ°μ΄λλ§ νλκ° λ¬λ¬κ΅¬νΈ κΏ λ°±νμ μμ μΌν μ§λ 1λμ΄ λμλ€. μ¬κ³ κ° λΆμ‘±ν κΏμ κ΄λ¦¬νκ³ , κΏκ° μ°½κ³ μμ κ°μ μΌλ‘ κ°λ μ°¬ λ³μ μ?κΈ°κ³ , νλ°νΈμ μλ§μ λκΊΌν μ μΈμ κ΄λ¦¬νλ μΌμ λ₯μν΄μ§ νλλ μμ κ°μ΄ λμΉλ€. κ²λ€κ° κΏ μ°μ μ’μ¬μλ‘ μΈ...', 
'l', 'edu', '03.png', 'y');


SELECT * FROM review;


SELECT AVG(score) AS avg FROM review WHERE bseq = 936;


CREATE OR REPLACE VIEW testList
AS
SELECT rc.*, ra.*, b.* FROM 
	(SELECT COUNT(rseq) AS cnt FROM review r, bookproduct b WHERE r.bseq = b.bseq) rc,
	(SELECT AVG(score) AS avg FROM review r, bookproduct b WHERE r.bseq = b.bseq) ra,
	(SELECT * FROM bookproduct) b;


SELECT * FROM testList;







