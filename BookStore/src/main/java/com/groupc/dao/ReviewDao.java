package com.groupc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.groupc.dto.ReviewVO;
import com.groupc.util.Dbm;

public class ReviewDao {
	private ReviewDao() {}
	private static ReviewDao itc = new ReviewDao();
	public static ReviewDao getInstance() {return itc;}
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	
	public ArrayList<ReviewVO> getSearchViewList(String str) {
		ArrayList<ReviewVO> searchViewList = new ArrayList<ReviewVO>();
		String sql = "SELECT * FROM review_pro_view WHERE rcontent LIKE '%'||?||'%' ORDER BY rseq DESC";
		con = Dbm.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, str);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ReviewVO rvo = new ReviewVO();
				rvo.setRseq(rs.getInt("rseq"));
				rvo.setBseq(rs.getInt("bseq"));
				rvo.setId(rs.getString("id"));
				rvo.setRcontent(rs.getString("rcontent"));
				rvo.setScore(rs.getString("score"));
				rvo.setRindate(rs.getTimestamp("rindate"));
				rvo.setBname(rs.getString("bname"));
				rvo.setWriter(rs.getString("writer"));
				rvo.setByear(rs.getString("byear"));
				rvo.setKind(rs.getString("kind"));
				rvo.setPublisher(rs.getString("publisher"));
				rvo.setGenre(rs.getString("genre"));
				rvo.setImage(rs.getString("image"));
				rvo.setUseyn(rs.getString("useyn"));
				rvo.setPrice(rs.getInt("price"));
				
				searchViewList.add(rvo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Dbm.close(con, pstmt, rs);
		}
		return searchViewList;
	}


	public ReviewVO getReview(int rseq) {
		ReviewVO rvo = new ReviewVO();
		String sql = "SELECT * FROM review WHERE rseq=?";
		con = Dbm.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, rseq);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				rvo.setRseq(rseq);
				rvo.setBseq(rs.getInt("bseq"));
				rvo.setId(rs.getString("id"));
				rvo.setRcontent(rs.getString("content"));
				rvo.setScore(rs.getString("score"));
				rvo.setRindate(rs.getTimestamp("indate"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Dbm.close(con, pstmt, rs);
		}
		return rvo;
	}


	public int getScoreAVG(int bseq) {
		double avg = 0;
		String sql = "SELECT AVG(score) AS avg FROM review WHERE bseq = ?";
		con = Dbm.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bseq);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				avg = rs.getDouble("avg");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Dbm.close(con, pstmt, rs);
		}
		return (int) avg;
	}


	public int getReviewCnt(int bseq) {
		int cnt = 0;
		String sql = "SELECT COUNT(*) AS cnt FROM review WHERE bseq = ?";
		con = Dbm.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bseq);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				cnt = rs.getInt("cnt");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Dbm.close(con, pstmt, rs);
		}
		return (int) cnt;
	}


	public void insertReview(ReviewVO rvo) {
		String sql = "INSERT INTO review (rseq, bseq, id, content, score)"
				+ " VALUES(review_seq.nextVal, ?, ?, ?, ?)";
		con = Dbm.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, rvo.getBseq());
			pstmt.setString(2, rvo.getId());
			pstmt.setString(3, rvo.getRcontent());
			pstmt.setString(4, rvo.getScore());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Dbm.close(con, pstmt, rs);
		}
	}


	public ArrayList<ReviewVO> listReview(String id) {
		ArrayList<ReviewVO> reviewList = new ArrayList<ReviewVO>();
		String sql = "select * from review where id=? order by rseq desc";
		con = Dbm.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ReviewVO rvo = new ReviewVO();
				rvo.setRseq(rs.getInt("rseq"));
				rvo.setBseq(rs.getInt("bseq"));
				rvo.setId(rs.getString("id"));
				rvo.setRcontent(rs.getString("content"));
				rvo.setScore(rs.getString("score"));
				rvo.setRindate(rs.getTimestamp("indate"));
				reviewList.add(rvo);
			}
		} catch (SQLException e) {e.printStackTrace();
		} finally {Dbm.close(con, pstmt, rs);
		}
		return reviewList;
	}
	
	
	public ArrayList<ReviewVO> getReviewbyBseq(int bseq) {
		ArrayList<ReviewVO> reviewList = new ArrayList<ReviewVO>();
		String sql = "SELECT * FROM review WHERE bseq=?";
		con = Dbm.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bseq);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ReviewVO rvo = new ReviewVO();
				rvo.setRseq(rs.getInt("rseq"));
				rvo.setBseq(rs.getInt("bseq"));
				rvo.setId(rs.getString("id"));
				rvo.setRcontent(rs.getString("content"));
				rvo.setScore(rs.getString("score"));
				rvo.setRindate(rs.getTimestamp("indate"));
				reviewList.add(rvo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Dbm.close(con, pstmt, rs);
		}
		
		return reviewList;
	}
	
}
