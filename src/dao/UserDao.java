package dao;
/**
 * 定义操作数据库的逻辑
 * @author yichi.sun
 *
 */
public interface UserDao {
	/**
	 * 查询所有
	 */
	void findAll();
	
	/**
	 * 登陆方法
	 * @param username
	 * @param password
	 */
	void login(String username, String password);
}
