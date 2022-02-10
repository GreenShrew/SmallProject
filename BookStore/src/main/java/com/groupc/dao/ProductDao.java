package com.groupc.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.groupc.dto.ProductVO;
import com.groupc.util.Dbm;

public class ProductDao {
	

	private ProductDao() {}
	private static ProductDao itc = new ProductDao();
	public static ProductDao getInstance() {return itc;}
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public ArrayList<ProductVO> getBestList() {
		ArrayList<ProductVO> bestList = new ArrayList<ProductVO>();
		String sql = "SELECT * FROM best_pro_view";
		con = Dbm.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ProductVO pvo = new ProductVO();
				pvo.setBseq(rs.getInt("bseq"));
				pvo.setBname(rs.getString("bname"));
				pvo.setImage(rs.getString("image"));
				pvo.setPrice(rs.getInt("price"));
				bestList.add(pvo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Dbm.close(con, pstmt, rs);
		}
		return bestList;
	}

	public ArrayList<ProductVO> getNewList() {
		ArrayList<ProductVO> newList = new ArrayList<ProductVO>();
		String sql = "SELECT * FROM new_pro_view";
		con = Dbm.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ProductVO pvo = new ProductVO();
				pvo.setBseq(rs.getInt("bseq"));
				pvo.setBname(rs.getString("bname"));
				pvo.setImage(rs.getString("image"));
				pvo.setPrice(rs.getInt("price"));
				newList.add(pvo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Dbm.close(con, pstmt, rs);
		}
		return newList;
	}

	public ProductVO getProduct(int bseq) {
		ProductVO pvo = new ProductVO();
		String sql = "select * from bookproduct where bseq = ?";
		con = Dbm.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,  bseq);
			rs = pstmt.executeQuery();
			if( rs.next() ) {
				pvo.setBseq(bseq);
				pvo.setBname(rs.getString("bname"));
				pvo.setByear(rs.getInt("byear"));
				pvo.setKind(rs.getString("kind"));
				pvo.setPrice(rs.getInt("price"));
				pvo.setPublisher(rs.getString("publisher"));
				pvo.setGenre(rs.getString("genre"));
				pvo.setContent(rs.getString("content"));
				pvo.setImage(rs.getString("image"));
				pvo.setUseyn(rs.getString("useyn"));
				pvo.setBestyn(rs.getString("bestyn"));
				pvo.setIndate(rs.getTimestamp("indate"));
			}
		} catch (SQLException e) { e.printStackTrace();
		} finally { Dbm.close(con, pstmt, rs);
		}		
		return pvo;
	}
	

	

}
