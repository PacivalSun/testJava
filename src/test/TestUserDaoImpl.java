package test;

import org.junit.Test;

import dao.UserDao;
import dao.impl.UserDaoImpl;
/**
 * 写完DAO后需要另外调用它
 * @author yichi.sun
 *
 */
public class TestUserDaoImpl {
	
	@Test
	public void testFindAll() {
		UserDao dao = new UserDaoImpl();
		dao.findAll();
	}
	
	@Test
	public void testLogin() {
		UserDao dao = new UserDaoImpl();
		dao.login("zhangsan", "2 'or' 1=1");//沒有用啊
		dao.login("zhangsan", "2");
	}
}
