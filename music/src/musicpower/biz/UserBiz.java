package musicpower.biz;

import musicpower.entity.User;

public interface UserBiz {

	/**
	 * 注册
	 * @param user
	 */
	public void registerUser(User user);
	
	/**
	 * 登录
	 * @param user
	 * @return
	 */
	public java.util.List<User> loginUser(User user);
	
	/**
	 * 修改
	 * @param user
	 * @return
	 */
	public boolean modfiyUser(User user);
	
	/**
	 * 删除
	 * @param user
	 * @return
	 */
	public boolean removeUser(User user);
}
