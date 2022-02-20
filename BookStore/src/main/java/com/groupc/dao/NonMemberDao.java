package com.groupc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
	
	
}
