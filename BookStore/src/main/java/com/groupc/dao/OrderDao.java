package com.groupc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.groupc.dto.CartVO;
import com.groupc.dto.NOrderVO;
import com.groupc.dto.NonMemberVO;
import com.groupc.dto.OrderVO;
import com.groupc.dto.ProductVO;
import com.groupc.util.Dbm;

public class OrderDao {

	private OrderDao() {}
	private static OrderDao itc = new OrderDao();
	public static OrderDao getInstance() { return itc; }
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public int insertOrder(ArrayList<CartVO> list, String id) {
		int oseq = 0;
		con = Dbm.getConnection();
		// 1. 주문 번호(시퀀스 자동입력)와 구매자 아이디로 orders 테이블에 레코드 추가
		String sql = "insert into orders(oseq, id) values( orders_seq.nextVal , ?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			
			// 2. Orders 테이블에 시퀀스로 입력된 가장 마지막(방금추가한) 주문 번호 조회
			pstmt.close();
			sql = "select max(oseq) as max_oseq from orders";
			pstmt = con.prepareStatement(sql); 
			rs = pstmt.executeQuery();
			if(rs.next()) oseq = rs.getInt("max_oseq");
			
			// 3. list 의 카트목록들을 Orders 에서 얻은 max_oseq 와 함꼐 order_detail 에 추가
			pstmt.close();
			for( CartVO cvo : list) {
				// 카트 목록을 하나씩 꺼내서  oseq 와 함께 order_detail 테이블에 추가하고
				sql = "insert into order_detail(odseq, oseq, bseq, quantity) "
						+ "values(order_detail_seq.nextVal, ?, ?, ?)";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, oseq);
				pstmt.setInt(2, cvo.getBseq() );
				pstmt.setInt(3, cvo.getQuantity() );
				pstmt.executeUpdate();
				
				// 4. order_detail 에 추가된 카트 내용은  cart 테이블에서 처리되었으므로 삭제 또는 result  를 2로 변경 또는 삭제
				pstmt.close();
				// sql = "delete from cart where cseq = ?"; 
				sql = "Update cart set result='2' where cseq=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, cvo.getCseq());
				pstmt.executeUpdate();
				
			}
		} catch (SQLException e) { e.printStackTrace();
		} finally { Dbm.close(con, pstmt, rs);
		}		
		// 5. 주문번호oseq 를 return
		return oseq;
	}

	public ArrayList<OrderVO> listOrderByOseq(int oseq) {
		ArrayList<OrderVO> list = new ArrayList<OrderVO>();
		String sql = "select * from order_view where oseq=?";
		
		con = Dbm.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, oseq);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				    OrderVO ovo = new OrderVO();
					ovo.setOdseq(rs.getInt("odseq"));
					ovo.setOseq(rs.getInt("oseq"));
					ovo.setId(rs.getString("id"));
					ovo.setIndate(rs.getTimestamp("indate"));
					ovo.setMname(rs.getString("mname"));
					ovo.setZip_num(rs.getString("zip_num"));
					ovo.setAddress(rs.getString("address"));
					ovo.setPhone(rs.getString("phone"));
					ovo.setBname(rs.getString("bname"));
					ovo.setPrice(rs.getInt("price"));
					ovo.setBseq(rs.getInt("bseq"));
					ovo.setQuantity(rs.getInt("quantity"));
					ovo.setResult(rs.getString("result"));
					list.add(ovo);
			}
		} catch (SQLException e) { e.printStackTrace();
		} finally { Dbm.close(con, pstmt, rs);
		}
		return list;
	}

	public ArrayList<Integer> selectOseqOrderIng(String id) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		String sql = "select distinct oseq from order_view where id=? and result='1'  order by oseq desc";
		con = Dbm.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,  id);
			rs = pstmt.executeQuery();
			while( rs.next() ) {
				list.add( rs.getInt(1) );
			}
		} catch (SQLException e) {e.printStackTrace();
		} finally { Dbm.close(con, pstmt, rs);
		}
		return list;
	}

	public ArrayList<Integer> selectOseqOrderAll(String id) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		String sql = "select distinct oseq, result from order_view where id=?  order by result, oseq desc";
		con = Dbm.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,  id);
			rs = pstmt.executeQuery();
			while( rs.next() ) {
				list.add( rs.getInt(1) );
			}
		} catch (SQLException e) {e.printStackTrace();
		} finally { Dbm.close(con, pstmt, rs);
		}
		return list;
	}

	public int insertOrderOne(ProductVO pvo, String id, int quantity) {
		int oseq = 0;
		con = Dbm.getConnection();
		String sql = "insert into orders(oseq, id) values(orders_seq.nextVal, ?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			pstmt.close();

			sql = "select max(oseq) as max_oseq from orders";
			pstmt = con.prepareStatement(sql); 
			rs = pstmt.executeQuery();
			if(rs.next()) oseq = rs.getInt("max_oseq");
			pstmt.close();

			sql = "insert into order_detail(odseq, oseq, bseq, quantity) "
						+ "values(order_detail_seq.nextVal, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, oseq);
			pstmt.setInt(2, pvo.getBseq());
			pstmt.setInt(3, quantity );
			pstmt.executeUpdate();
		} catch (SQLException e) { e.printStackTrace();
		} finally { Dbm.close(con, pstmt, rs);
		}		
		// 5. 주문번호oseq 를 return
		return oseq;
	}

	public void deleteOrders(Integer oseq) {
		String sql = "delete from orders where oseq=?";
		con = Dbm.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,  oseq);
			pstmt.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();
		} finally { Dbm.close(con, pstmt, rs);
		}
		
	}

	public void deleteOrder_detail(Integer oseq) {
		String sql = "delete from order_detail where oseq=?";
		con = Dbm.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,  oseq);
			pstmt.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();
		} finally { Dbm.close(con, pstmt, rs);
		}
		
	}
	
	public ArrayList<OrderVO> getOrderlist(String id) {
		ArrayList<OrderVO> list = new ArrayList<OrderVO>();
		String sql = "select * from order_view where id=?";
		
		con = Dbm.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				    OrderVO ovo = new OrderVO();
					ovo.setOdseq(rs.getInt("odseq"));
					ovo.setOseq(rs.getInt("oseq"));
					ovo.setId(rs.getString("id"));
					ovo.setIndate(rs.getTimestamp("indate"));
					ovo.setMname(rs.getString("mname"));
					ovo.setZip_num(rs.getString("zip_num"));
					ovo.setAddress(rs.getString("address"));
					ovo.setPhone(rs.getString("phone"));
					ovo.setBname(rs.getString("bname"));
					ovo.setPrice(rs.getInt("price"));
					ovo.setBseq(rs.getInt("bseq"));
					ovo.setQuantity(rs.getInt("quantity"));
					ovo.setResult(rs.getString("result"));
					list.add(ovo);
			}
		} catch (SQLException e) { e.printStackTrace();
		} finally { Dbm.close(con, pstmt, rs);
		}
		return list;
	}

	public int insertnOrder(ProductVO pvo, NonMemberVO nmvo, int quantity) {
		int od_pass = 0;
		
		con = Dbm.getConnection();
		
		// nonmember 테이블에 먼저 데이터를 넣고 nm_orders 테이블에 데이터를 넣는다.
		String sql = "insert into nonmember(phone, od_pass, name, email, zip_num, address) "
				+ " values(?, od_pass_seq.nextVal, ?, ?, ?, ?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, nmvo.getPhone());
			pstmt.setString(2, nmvo.getName());
			pstmt.setString(3, nmvo.getEmail());
			pstmt.setString(4, nmvo.getZip_num());
			pstmt.setString(5, nmvo.getAddress());
			pstmt.executeUpdate();
			pstmt.close();
			
			sql = "insert into nm_orders(oseq, od_pass) values(nm_orders_seq.nextVal, od_pass_seq.currVal)";
			pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();
			pstmt.close();

			sql = "select max(od_pass) as max_od_pass from nm_orders";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				od_pass = rs.getInt("max_od_pass");
			}
			pstmt.close();
			
			sql = "insert into nm_order_detail(odseq, oseq, od_pass, bseq, quantity) values(order_detail_seq.nextVal, nm_orders_seq.currVal, od_pass_seq.currVal, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, pvo.getBseq());
			pstmt.setInt(2, quantity);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Dbm.close(con, pstmt, rs);
		}
		
		return od_pass;
	}

	public NOrderVO nOrderByOd_Pass(String od_pass) {
		NOrderVO novo = null;
		String sql = "select * from non_order_view where od_pass=?";
		
		con = Dbm.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, od_pass);
			rs = pstmt.executeQuery();
			if(rs.next()) {
			    novo = new NOrderVO();
				novo.setOdseq(rs.getInt("odseq"));
				novo.setOseq(rs.getInt("oseq"));
				novo.setOd_pass(rs.getString("od_pass"));
				novo.setIndate(rs.getTimestamp("indate"));
				novo.setNmname(rs.getString("nmname"));
				novo.setZip_num(rs.getString("zip_num"));
				novo.setAddress(rs.getString("address"));
				novo.setPhone(rs.getString("phone"));
				novo.setBseq(rs.getInt("bseq"));
				novo.setBname(rs.getString("bname"));
				novo.setPrice(rs.getInt("price"));
				novo.setQuantity(rs.getInt("quantity"));
				novo.setResult(rs.getString("result"));
				novo.setEmail(rs.getString("email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Dbm.close(con, pstmt, rs);
		}
		return novo;
	}
}












