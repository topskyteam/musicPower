package musicpower.dao;

import musicpower.entity.Administerators;

public interface AdministratorsDao {
	
	/**
	 * 登录用户
	 * @param user
	 * @return
	 */
	public Administerators loginUser(Administerators administerators);
	
	/**
	 * 修改用户
	 * @param user
	 * @return
	 */
	public boolean updateUser(Administerators administerators);
	
	/**
	 * 删除用户
	 * @param user
	 * @return
	 */
	public boolean deleteUser(Administerators administerators);
}

