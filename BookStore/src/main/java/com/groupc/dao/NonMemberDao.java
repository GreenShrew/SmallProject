package com.groupc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.groupc.dto.NOrderVO;
import com.groupc.dto.NonMemberVO;
import com.groupc.util.Dbm;

public class NonMemberDao {
	private NonMemberDao() {}
	private static NonMemberDao itc = new NonMemberDao();
	public static NonMemberDao getInstance() {return itc;}
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	
	public NonMemberVO getNonMember(String phone, String od_pass) {
		NonMemberVO nmvo = null;
		
		String sql = "SELECT * FROM nonmember WHERE phone=? and od_pass=?";
		con = Dbm.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, phone);
			pstmt.setString(2, od_pass);
			rs = pstmt.executeQuery();
			if( rs.next() ) {
				nmvo = new NonMemberVO();
				nmvo.setPhone( rs.getString("phone") );
				nmvo.setName(rs.getString("name"));
				nmvo.setOd_pass(rs.getString("od_pass"));
		        nmvo.setEmail(rs.getString("email"));
		        nmvo.setZip_num(rs.getString("zip_num"));
		        nmvo.setAddress(rs.getString("address"));
			}
		} catch (SQLException e) { e.printStackTrace();
		} finally { Dbm.close(con, pstmt, rs);
		}
		return nmvo;
	}
	
	
	public ArrayList<NOrderVO> findOd_pass(String nmName, String nmPhone) {
		ArrayList<NOrderVO> nmOrderList = new ArrayList<NOrderVO>();
		
		String sql = "SELECT * FROM non_order_view WHERE nmname LIKE '%'||?||'%' AND phone LIKE '%'||?||'%'";
		con = Dbm.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, nmName);
			pstmt.setString(2, nmPhone);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				NOrderVO novo = new NOrderVO();
				novo.setOd_pass(rs.getString("od_pass"));
				novo.setNmname(rs.getString("nmname"));
				novo.setBname(rs.getString("bname"));
				novo.setPhone(rs.getString("phone"));
				novo.setQuantity(rs.getInt("quantity"));
				novo.setIndate(rs.getTimestamp("indate"));
				nmOrderList.add(novo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Dbm.close(con, pstmt, rs);
		}
		
		return nmOrderList;
	}
	
	
}
