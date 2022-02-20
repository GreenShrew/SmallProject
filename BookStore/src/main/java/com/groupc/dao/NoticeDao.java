package com.groupc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.groupc.dto.NoticeVO;
import com.groupc.util.Dbm;

public class NoticeDao {
	private NoticeDao() {}
	private static NoticeDao itc = new NoticeDao();
	public static NoticeDao getInstance() {return itc;}
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	
	public ArrayList<NoticeVO> listNotice(String id){
		ArrayList<NoticeVO> noticeList = new ArrayList<NoticeVO>();
		String sql = "select * from notice order by nseq desc";
		con = Dbm.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				NoticeVO nvo = new NoticeVO();
				nvo.setNseq(rs.getInt("nseq"));
				nvo.setId(rs.getString("id"));
				nvo.setSubject(rs.getString("subject"));
				nvo.setContent(rs.getString("content"));
				nvo.setIndate(rs.getTimestamp("indate"));
				nvo.setUseyn(rs.getString("useyn"));
				noticeList.add(nvo);

			}
		} catch (SQLException e) {e.printStackTrace();
		} finally {Dbm.close(con, pstmt, rs); }
		return noticeList;
	}

	public NoticeVO getNotice(int nseq) {
		NoticeVO nvo = new NoticeVO();
		String sql = "select * from notice where nseq=?";
		con=Dbm.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, nseq);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				nvo.setNseq(nseq);
				nvo.setId(rs.getString("id"));
				nvo.setSubject(rs.getString("subject"));
				nvo.setContent(rs.getString("content"));
				nvo.setIndate(rs.getTimestamp("indate"));
				nvo.setUseyn(rs.getString("useyn"));
			}
		} catch (SQLException e) {e.printStackTrace();
		} finally {Dbm.close(con, pstmt, rs); }
		
		return nvo;
	}
	


	public void insertNotice(NoticeVO nvo) {
		String sql = "insert into notice(nseq, id, subject, cotent) values(notice_seq.nextVal, ?, ?, ?)";
		con = Dbm.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, nvo.getId());
			pstmt.setString(2, nvo.getSubject());
			pstmt.setString(3, nvo.getContent());
			pstmt.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();
		} finally { Dbm.close(con, pstmt, rs);}
	}

}
