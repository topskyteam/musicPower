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
	public User selectUser(User user);
	
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
	
	/**
	 * 查询用户名是否存在
	 */
	public boolean getUserByname(String name);
	
	/**
	 * 查询手机号是否存在
	 */
	public boolean getUserByPhone(String phone);
}
