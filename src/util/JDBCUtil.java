package util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtil {

	static String driverClass = null;
	static String url = null;
	static String name = null;
	static String password = null;

	static {

		try {
			// 创建一个书信配置对象
			Properties properties = new Properties();
			// 使用类加载器去读取src底下的资源文件
			InputStream is = JDBCUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
			// 直接新建，读取的是工程根目录下的资源文件
//			InputStream is = new FileInputStream("jdbc.properties");
			// 导入输入流
			properties.load(is);

			// 读取属性
			driverClass = properties.getProperty("driverClass");
			url = properties.getProperty("url");
			name = properties.getProperty("name");
			password = properties.getProperty("password");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 获取连接对象
	 * 
	 * @return
	 */
	public static Connection getConn() {

		Connection conn = null;

		try {
			Class.forName(driverClass);
			conn = DriverManager.getConnection(url, name, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	/**
	 * 释放资源
	 * 
	 * @param conn
	 * @param st
	 * @param rs
	 */
	public static void release(Connection conn, Statement st, ResultSet rs) {
		closeRs(rs);
		closeSt(st);
		closeConn(conn);
	}

	private static void closeRs(ResultSet rs) {
		// TODO Auto-generated method stub
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rs = null;
		}
	}

	private static void closeSt(Statement st) {
		// TODO Auto-generated method stub
		try {
			if (st != null) {
				st.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			st = null;
		}
	}

	private static void closeConn(Connection conn) {
		// TODO Auto-generated method stub
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn = null;
		}
	}

}
