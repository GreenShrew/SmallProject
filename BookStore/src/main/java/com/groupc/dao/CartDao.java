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
			rs = pstmt.executeQuery();
			while(rs.next()) {
				CartVO cvo = new CartVO();
				cvo.setCseq(rs.getInt("cseq"));
				cvo.setId(rs.getString("id"));
				cvo.setMname(rs.getString("mname"));
				cvo.setBseq(rs.getInt("bseq"));
				cvo.setBname(rs.getString("bname"));
				cvo.setPrice(rs.getInt("price"));
				cvo.setQuantity(rs.getInt("quantity"));
				cvo.setResult(rs.getString("result"));
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
}
