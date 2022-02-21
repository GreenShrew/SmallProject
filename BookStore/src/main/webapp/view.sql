CREATE OR REPLACE VIEW order_view
AS
SELECT d.odseq, o.oseq, o.indate, o.id, 
			m.name AS mname, m.zip_num, m.address, m.phone, 
			d.bseq, b.bname AS bname, b.price, d.quantity, d.result
FROM orders o, order_detail d, member m, bookproduct b
WHERE o.oseq = d.oseq AND o.id = m.id AND d.bseq = b.bseq;
select * from ORDER_VIEW;

drop view non_order_view;
CREATE OR REPLACE VIEW non_order_view
AS
SELECT d.odseq, o.oseq, o.indate, nm.od_pass,
			nm.name AS nmname, nm.zip_num, nm.address, nm.phone, 
			d.bseq, b.bname AS bname, b.price, d.quantity, d.result
FROM nm_orders o, nm_order_detail d, nonmember nm, bookproduct b
WHERE o.oseq = d.oseq AND o.od_pass = nm.od_pass AND d.bseq = b.bseq;
select * from non_order_view;


CREATE OR REPLACE VIEW cart_view 
AS
SELECT c.cseq, c.id, m.name AS mname, c.bseq, b.bname AS bname, c.quantity, b.price, c.result, c.indate
FROM cart c, bookproduct b, member m
WHERE c.bseq = b.bseq AND c.id = m.id;

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

select * from best_pro_view;
