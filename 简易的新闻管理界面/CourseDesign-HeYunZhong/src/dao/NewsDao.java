package dao;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;



import bean.News;
import utils.JDBCUtils;

public class NewsDao {
	/**
	 * 查询表
	 * @return
	 */
	public ArrayList<News> findAll(){
		PreparedStatement preStmt = null;
		Connection conn = null;
		ResultSet rs = null;
		ArrayList<News> list = new ArrayList();
		try {
			conn = JDBCUtils.getConnection();
			String sql = "SELECT * FROM news";
			preStmt = conn.prepareStatement(sql);
			rs = preStmt.executeQuery();
			while (rs.next()) {
				News news = new News();
				news.setId(rs.getInt("id"));
				news.setTitle(rs.getString("title"));
				news.setSource(rs.getString("source"));
				news.setContent(rs.getString("content"));
				news.setDate(rs.getDate("date"));
				list.add(news);
			}
			return list;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtils.release(rs,preStmt,conn);		
		}
		return null;
	}
	
	/**
	 * 查询记录
	 * @param id 条件
	 * @return
	 */
	public News find(int id) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// 获取数据的连接
			conn = JDBCUtils.getConnection();
			// 获取statement对象
			stmt = conn.createStatement();
			// 发送SQL语句
			String sql = "SELECT * FROM news where id = " + id;
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				News news = new News();
				news.setId(rs.getInt("id"));
				news.setTitle(rs.getString("title"));
				news.setSource(rs.getString("source"));
				news.setContent(rs.getString("content"));
				news.setDate(rs.getDate("date"));
				return news;
			}
			return null;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			utils.JDBCUtils.release(rs, stmt, conn);
		}
		return null;

	
	}
	
	/**
	 * 查询记录
	 * @param title查询条件
	 * @return
	 */
	public ArrayList<News> findByTitle(String title){
		PreparedStatement preStmt = null;
		ResultSet rs = null;
		Connection conn = null;
		ArrayList<News> list = new ArrayList<>();
		try {
			
			conn = JDBCUtils.getConnection();
			
			String sql = "select * from news";
			if (!title.equals("")) {
				sql = "select * from news where title like '%" + title +"%'";
			}			
			
			
			preStmt = conn.prepareStatement(sql);
			rs = preStmt.executeQuery();
			
			
			while (rs.next()) {
				News news = new News();
				news.setId(rs.getInt("id"));
				news.setTitle(rs.getString("title"));
				news.setSource(rs.getString("source"));
				news.setContent(rs.getString("content"));
				news.setDate(rs.getDate("date"));		
				list.add(news);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.release(rs,preStmt,conn);			
		}
		return null;
	}

	
	/**
	 * 插入记录
	 * @param news
	 * @return 结果
	 */
	public boolean insert(News news) {
		Connection conn = null;
		PreparedStatement preStmt = null;
		try {
			
			conn = JDBCUtils.getConnection();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String date = sdf.format(news.getDate());
			
			
			String sql = "INSERT INTO news(id,title,source,content,date)" + "VALUES(?,?,?,?,?)";
			
			preStmt = conn.prepareStatement(sql);
			preStmt.setInt(1, news.getId());
			preStmt.setString(2, news.getTitle());
			preStmt.setString(3, news.getSource());
			preStmt.setString(4, news.getContent());
			preStmt.setString(5, date);
			int row = preStmt.executeUpdate();
			if (row > 0)
				return true;
			else
				return false;
		} catch (Exception e) {
			e.printStackTrace();
		} finally { 
			JDBCUtils.release(preStmt,conn);
			
		}
		return false;
	}
	
	/**
	 * 删除记录
	 * @param id 删除条件
	 * @return
	 */
	public boolean delete(int id) {
		PreparedStatement preStmt = null;
		Connection conn = null;
		try {
			
			conn = JDBCUtils.getConnection();
			String sql = "delete from news where id = ?";
			preStmt = conn.prepareStatement(sql);
			preStmt.setInt(1, id);
			int row = preStmt.executeUpdate();
			if (row > 0)
				return true;
			else
				return false;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.release(preStmt,conn);
		}
		return false;
	}
	
	/**
	 * 更新记录
	 * @param news更新条件
	 * @return
	 */
	public boolean update(News news) {
		Connection conn = null;
		PreparedStatement preStmt = null;
		try {
			
			conn = JDBCUtils.getConnection();
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String date = sdf.format(news.getDate());
			
			
			String sql = "UPDATE news SET title=?,source=?,content=?,date=? WHERE id = ?";
			
			preStmt = conn.prepareStatement(sql);
			
			
			preStmt.setInt(5, news.getId());
			preStmt.setString(1, news.getTitle());
			preStmt.setString(2, news.getSource());
			preStmt.setString(3, news.getContent());
			preStmt.setString(4, date);
			int row = preStmt.executeUpdate();
			if (row > 0)
				return true;
			else
				return false;
		} catch (Exception x) {
			x.printStackTrace();
		} finally { 
			JDBCUtils.release(preStmt,conn);
			
		}
		return false;
	}
	
	

	}
