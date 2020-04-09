package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import dao.UserDao;
import util.JDBCUtil;

public class UserDaoImpl implements UserDao {

	@Override
	public void findAll() {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			// TODO Auto-generated method stub
			conn = JDBCUtil.getConn();
			st = conn.createStatement();
			String sql = "select * from t_user";
			rs = st.executeQuery(sql);

			while (rs.next()) {
				String userName = rs.getString("user_name");
				String password = rs.getString("password");
				System.out.println(userName + "," + password);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.release(conn, st, rs);
		}
	}

	@Override
	public void login(String username, String password) {
		Connection conn = null;
//		Statement st = null;
		PreparedStatement st=null;
		ResultSet rs = null;
		try {
			// TODO Auto-generated method stub
			conn = JDBCUtil.getConn();
//			st = conn.createStatement();
//			String sql = "select * from t_user where user_name='" + username + "' and password='" + password + "'";
//			rs = st.executeQuery(sql);
			String sql = "select * from t_user where user_name='" + username + "' and password='" + password + "'";
			st = conn.prepareStatement(sql);
			rs = st.executeQuery();
			
			

			if (rs.next()) {
				System.out.println("登陆成功");
			} else {
				System.out.println("登陆失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.release(conn, st, rs);
		}

	}

}
