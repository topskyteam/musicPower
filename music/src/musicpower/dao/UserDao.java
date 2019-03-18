package musicpower.dao;

import musicpower.entity.User;

public interface UserDao {

	/**
	 * 增加用户
	 * @param user
	 */
	public void createUser(User user);
	
	/**
	 * 登录用户
	 * @param user
	 * @return
	 */
	public java.util.List<User> selectUser(User user);
	
	/**
	 * 修改用户
	 * @param user
	 * @return
	 */
	public boolean updateUser(User user);
	
	/**
	 * 删除用户
	 * @param user
	 * @return
	 */
	public boolean deleteUser(User user);
}
