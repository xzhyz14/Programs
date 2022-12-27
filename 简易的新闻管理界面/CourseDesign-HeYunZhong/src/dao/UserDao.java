package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.User;
import utils.JDBCUtils;

public class UserDao {
	public  ArrayList<User> findAllUser(){
		PreparedStatement preStmt = null;
		ResultSet rs = null;
		Connection conn = null;
		ArrayList<User> list = new ArrayList<User>();
		try {
			
			conn = JDBCUtils.getConnection();
			
			String sql = "select * from users";
			
			preStmt = conn.prepareStatement(sql);
			rs = preStmt.executeQuery();
			
			
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				user.setEmail(rs.getString("email"));
				user.setBirthday(rs.getDate("birthday"));		
				list.add(user);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.release(rs,preStmt,conn);			
		}
		return null;
	}
}
