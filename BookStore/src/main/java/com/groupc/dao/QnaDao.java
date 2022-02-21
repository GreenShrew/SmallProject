package com.groupc.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.groupc.dto.QnaVO;
import com.groupc.util.Dbm;

public class QnaDao {
	private QnaDao() {}
	private static QnaDao itc = new QnaDao();
	public static QnaDao getInstance() {return itc;}
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	
	public ArrayList<QnaVO> listQna(String id) {
		ArrayList<QnaVO> qnaList = new ArrayList<QnaVO>();
		String sql = "SELECT * FROM qna WHERE id=? ORDER BY qseq DESC";
		con = Dbm.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				QnaVO qvo = new QnaVO();
				qvo.setQseq(rs.getInt("qseq"));
				qvo.setSubject(rs.getString("subject"));
				qvo.setContent(rs.getString("content"));
				qvo.setReply(rs.getString("reply"));
				qvo.setId(rs.getString("id"));
				qvo.setRep(rs.getString("rep"));
				qvo.setIndate(rs.getTimestamp("indate"));
				qnaList.add(qvo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {Dbm.close(con, pstmt, rs);
		}
		return qnaList;
	}


	public QnaVO getQna(int qseq) {
		QnaVO qvo = new QnaVO();
		String sql = "select * from qna where qseq=?";
		con = Dbm.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,  qseq);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				qvo.setQseq(qseq);
				qvo.setSubject(rs.getString("subject"));
				qvo.setContent(rs.getString("content"));
				qvo.setId(rs.getString("id"));
				qvo.setIndate(rs.getTimestamp("indate"));
				qvo.setReply(rs.getString("reply"));
				qvo.setRep(rs.getString("rep"));
			}
		} catch (SQLException e) {e.printStackTrace();
		} finally { Dbm.close(con, pstmt, rs);}
		return qvo;
	}
	
	
	public void insertQna(QnaVO qvo) {
		String sql = "insert into qna (qseq, subject, content, id) values(qna_seq.nextval, ?, ?, ?)";
		con = Dbm.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, qvo.getSubject());
			pstmt.setString(2, qvo.getContent());
			pstmt.setString(3, qvo.getId());
			pstmt.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();
		} finally { Dbm.close(con, pstmt, rs);}
	}
	
}
