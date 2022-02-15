package com.groupc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.groupc.dto.AdminVO;
import com.groupc.util.Dbm;

public class AdminDao {
	private AdminDao() {}
	private static AdminDao itc = new AdminDao();
	public static AdminDao getInstance() {return itc;}
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public AdminVO getWorker(String adminId) {
		AdminVO avo = null;
		String sql = "SELECT * FROM worker WHERE id=?";
		con = Dbm.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, adminId);
			rs = pstmt.executeQuery();
			if( rs.next() ) {
				avo = new AdminVO();
				avo.setId( rs.getString("id") );
				avo.setPwd(rs.getString("pwd"));
				avo.setName(rs.getString("name"));
				avo.setPhone(rs.getString("phone"));
			}
		} catch (SQLException e) { e.printStackTrace();
		} finally { Dbm.close(con, pstmt, rs);
		}
		return avo;
	}

	public ArrayList<Integer> getCnt() {
		ArrayList<Integer> cnt = new ArrayList<Integer>();
		String sql = "";
		con = Dbm.getConnection();
		try {
			// membercnt
			sql = "SELECT COUNT(*) AS membercnt FROM member WHERE useyn='y'";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				int i = rs.getInt("membercnt");
				cnt.add(0, i);
			}
			pstmt.close();
			
			// bookcnt
			sql = "SELECT COUNT(*) AS bookcnt FROM bookproduct WHERE useyn='y'";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				int i = rs.getInt("bookcnt");
				cnt.add(1, i);
			}
			pstmt.close();
			
			// ordercnt
			sql = "SELECT COUNT(*) AS ordercnt FROM orders";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				int i = rs.getInt("ordercnt");
				cnt.add(2, i);
			}
			pstmt.close();

			// qnacnt
			sql = "SELECT COUNT(*) AS qnacnt FROM qna";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				int i = rs.getInt("qnacnt");
				cnt.add(3, i);
			}
			
		} catch (SQLException e) { e.printStackTrace();
		} finally { Dbm.close(con, pstmt, rs);
		}
		
		return cnt;
	}
	
	
}
