//package dao;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//
//import bean.Author;
//import bean.News;
//import utils.JDBCUtils;
//
//public class AuthorDao {
//	/**
//	 * 查询表
//	 * @return
//	 */
//	public ArrayList<Author> findAll(){
//		PreparedStatement preStmt = null;
//		Connection conn = null;
//		ResultSet rs = null;
//		ArrayList<Author> list = new ArrayList();
//		try {
//			conn = JDBCUtils.getConnection();
//			String sql = "SELECT * from author";
//			preStmt = conn.prepareStatement(sql);
//			rs = preStmt.executeQuery();
//			while (rs.next()) {
//				Author author = new Author();
//				author.setId(rs.getInt("id"));
//				author.setNewsTitle(rs.getString("newsTitle"));
//				author.setUsersName(rs.getString("usersName"));
//				list.add(author);
//			}
//			return list;
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			JDBCUtils.release(rs,preStmt,conn);		
//		}
//		return null;
//	}
//	
//	/**
//	 * 删除表
//	 * @param id
//	 * @return
//	 */
//	public boolean delete(int id) {
//		PreparedStatement preStmt = null;
//		Connection conn = null;
//		try {
//			
//			conn = JDBCUtils.getConnection();
//			String sql = "delete from author where id = ?";
//			preStmt = conn.prepareStatement(sql);
//			preStmt.setInt(1, id);
//			int row = preStmt.executeUpdate();
//			if (row > 0)
//				return true;
//			else
//				return false;
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			JDBCUtils.release(preStmt,conn);
//		}
//		return false;
//	}
//
//	/**
//	 * 新增记录
//	 * @param author
//	 * @return 
//	 */
//	public boolean insert(Author author) {
//		Connection conn = null;
//		PreparedStatement preStmt = null;
//		try {
//			
//			conn = JDBCUtils.getConnection();
//			
//			
//			String sql = "INSERT into author (id,newsTitle,usersName) VALUES(?,?,?)";
//			
//			preStmt = conn.prepareStatement(sql);
//			preStmt.setInt(1, author.getId());
//			preStmt.setString(2, author.getNewsTitle());
//			preStmt.setString(3, author.getUsersName());
//			int row = preStmt.executeUpdate();
//			if (row > 0)
//				return true;
//			else
//				return false;
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally { 
//			JDBCUtils.release(preStmt,conn);
//			
//		}
//		return false;
//	}
//
//	public boolean update(Author author) {
//		Connection conn = null;
//		PreparedStatement preStmt = null;
//		try {
//			
//			conn = JDBCUtils.getConnection();
//			
//			
//			String sql = "UPDATE author SET newsTitle=?,usersName=? WHERE id = ?";
//			
//			preStmt = conn.prepareStatement(sql);
//			preStmt.setString(1, author.getNewsTitle());
//			preStmt.setString(2, author.getUsersName());
//			preStmt.setInt(3, author.getId());
//			int row = preStmt.executeUpdate();
//			if (row > 0)
//				return true;
//			else
//				return false;
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally { 
//			JDBCUtils.release(preStmt,conn);
//			
//		}
//		return false;
//	}
//}
