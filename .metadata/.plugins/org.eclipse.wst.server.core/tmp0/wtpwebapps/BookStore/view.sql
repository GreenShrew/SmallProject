CREATE OR REPLACE VIEW order_view
AS
SELECT d.odseq, o.oseq, o.indate, o.id, 
			m.name AS mname, m.zip_num, m.address, m.phone, 
			d.bseq, b.name AS bname, b.price, d.quantity, d.result
FROM orders o, order_detail d, member m, bookproduct b
WHERE o.oseq = d.oseq AND o.id = m.id AND d.pseq = b.pseq;

CREATE OR REPLACE VIEW non_order_view
AS
SELECT d.odseq, o.oseq, o.indate, o.id, 
			nm.name AS nmname, nm.zip_num, nm.address, nm.phone, 
			d.bseq, b.name AS bname, b.price, d.quantity, d.result
FROM orders o, order_detail d, nonmember nm, bookproduct b
WHERE o.oseq = d.oseq AND o.id = nm.id AND d.pseq = b.pseq;


CREATE OR REPLACE VIEW cart_view 
AS
SELECT c.cseq, c.id, m.name AS mname, c.pseq, b.bname AS bname, c.quantity, p.price, c.result, c.indate
FROM cart c, bookproduct b, member m
WHERE c.pseq = p.pseq AND c.id = m.id;

CREATE OR REPLACE VIEW new_pro_view
AS
SELECT * FROM 
(SELECT rownum, bseq, bname, price, image
FROM bookproduct
WHERE useyn='y'
ORDER BY indate DESC)
WHERE rownum <= 8;

CREATE OR REPLACE VIEW best_pro_view
AS
SELECT * FROM
(SELECT rownum, bseq, bname, price, image
FROM bookproduct
WHERE bestyn='y'
ORDER BY indate DESC)
WHERE rownum <= 8;
