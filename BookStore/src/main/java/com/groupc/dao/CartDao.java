package com.groupc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.groupc.dto.CartVO;
import com.groupc.util.Dbm;

public class CartDao {
	private CartDao() {}
	private static CartDao itc = new CartDao();
	public static CartDao getInstance() {return itc;}
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public ArrayList<CartVO> selectCart(String id) {
		ArrayList<CartVO> cartList = new ArrayList<CartVO>();
		String sql = "SELECT * FROM cart_view WHERE id=? AND result='1'";
		con = Dbm.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				CartVO cvo = new CartVO();
				cvo.setCseq(rs.getInt("cseq"));  		
				cvo.setId(rs.getString("id"));
				cvo.setMname(rs.getString("mname")); 
				cvo.setBseq(rs.getInt("bseq"));	
				cvo.setBname(rs.getString("bname"));  
				cvo.setImage(rs.getString("image"));
				cvo.setQuantity(rs.getInt("quantity"));
				cvo.setPrice(rs.getInt("price"));  
				cvo.setIndate(rs.getTimestamp("indate"));
				cartList.add(cvo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Dbm.close(con, pstmt, rs);
		}
		return cartList;
	}
	public void insertCart(CartVO cvo) {
		String sql = "insert into cart( cseq , id, bseq, quantity)"
				+ "values( cart_seq.nextVal, ? , ? , ?)";
		con = Dbm.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,  cvo.getId() );
			pstmt.setInt(2,  cvo.getBseq());
			pstmt.setInt( 3, cvo.getQuantity() );
			
			pstmt.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();
		} finally { Dbm.close(con, pstmt, rs); 
		}
	}

	public void deleteCart(int cseq) {
		String sql = "delete from cart where cseq=?";
		con = Dbm.getConnection();
		try {
		      pstmt = con.prepareStatement(sql); 
		      pstmt.setInt(1, cseq);
		      pstmt.executeUpdate();
		} catch (Exception e) { e.printStackTrace();
	    } finally { Dbm.close(con, pstmt, rs); }
	    } 
	    
	public void deleteCart(String id) {
		String sql = "delete from cart where id=?";
		con = Dbm.getConnection();
		try {
		      pstmt = con.prepareStatement(sql); 
		      pstmt.setString(1, id);
		      pstmt.executeUpdate();
		} catch (Exception e) { e.printStackTrace();
	    } finally { Dbm.close(con, pstmt, rs); 
	    }  
	}
		
	public void insertCartArr(String id, int bseq) {
		String sql = "insert into cart(cseq, id, bseq, quantity) values( cart_seq.nextVal, ? , ? , 1)";
		// ????????? quantity??? ?????? 1??? ?????? ??????????????????.
		con = Dbm.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setInt(2, bseq);
			
			pstmt.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();
		} finally { Dbm.close(con, pstmt, rs); 
		}
	}
	
	public ArrayList<CartVO> selectCartByCseq(int cseq) {
		ArrayList<CartVO> cvolist = new ArrayList<CartVO>();
		String sql = "SELECT * FROM cart_view WHERE cseq=?";
		con = Dbm.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, cseq);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				CartVO cvo = new CartVO();
				cvo.setCseq(rs.getInt("cseq"));  		
				cvo.setId(rs.getString("id"));
				cvo.setMname(rs.getString("mname")); 
				cvo.setBseq(rs.getInt("bseq"));	
				cvo.setBname(rs.getString("bname"));  
				cvo.setImage(rs.getString("image"));
				cvo.setQuantity(rs.getInt("quantity"));
				cvo.setPrice(rs.getInt("price"));  
				cvo.setIndate(rs.getTimestamp("indate"));
				cvo.setResult(rs.getString("result"));
				cvolist.add(cvo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Dbm.close(con, pstmt, rs);
		}
		
		return cvolist;
	}
}
