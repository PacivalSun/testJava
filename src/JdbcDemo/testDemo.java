package JdbcDemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

import util.JDBCUtil;

public class testDemo {
	
	@Test
	public void testQuery() {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			// 1 注册驱动
			// DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			// Driver中有静态代码块，不需要重复注册，用以下代码即可
			conn = JDBCUtil.getConn();

			// 3 创建statement，跟数据库打交道，一定要有这个对象
			st = conn.createStatement();

			// 4 执行查询
			String sql = "select * from t_stu";
			rs = st.executeQuery(sql);

			// 5 每一条记录遍历查询
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				System.out.println("id=" + id + ",name=" + name + ",age=" + age + ".");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtil.release(conn, st, rs);

		}
	}
	
	@Test
	public void testInsert() {
		Connection conn = null;
		Statement st = null;

		try {
			conn = JDBCUtil.getConn();
			st = conn.createStatement();
			
			String sql = "insert into t_stu values (null,'Obama',60)";
			int rs = st.executeUpdate(sql);

			if (rs > 0) {
				System.out.println("插入成功!");
			} else {
				System.out.println("插入失败!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
//			JDBCUtil.release(conn, st, null);可以给三个参数的release方法补一个null参数进去
			JDBCUtil.release(conn, st);// 也可以在Util中写一个两个参数的方法重载

		}
	}
	
	@Test
	public void testDelete() {
		Connection conn = null;
		Statement st = null;

		try {
			conn = JDBCUtil.getConn();
			st = conn.createStatement();
			
			String sql = "delete from t_stu where name='Obama'";
			int rs = st.executeUpdate(sql);

			if (rs > 0) {
				System.out.println("删除成功!");
			} else {
				System.out.println("删除失败!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
//			JDBCUtil.release(conn, st, null);可以给三个参数的release方法补一个null参数进去
			JDBCUtil.release(conn, st);// 也可以在Util中写一个两个参数的方法重载

		}
	}
	
	@Test
	public void testUpdate() {
		Connection conn = null;
		Statement st = null;

		try {
			conn = JDBCUtil.getConn();
			st = conn.createStatement();
			
			String sql = "update t_stu set age=100 where name='lisi'";
			int rs = st.executeUpdate(sql);

			if (rs > 0) {
				System.out.println("更新成功!");
			} else {
				System.out.println("更新失败!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
//			JDBCUtil.release(conn, st, null);可以给三个参数的release方法补一个null参数进去
			JDBCUtil.release(conn, st);// 也可以在Util中写一个两个参数的方法重载

		}
	}

}
