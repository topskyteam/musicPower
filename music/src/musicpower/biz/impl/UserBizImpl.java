package musicpower.biz.impl;

import musicpower.biz.UserBiz;
import musicpower.dao.UserDao;
import musicpower.entity.User;

public class UserBizImpl implements UserBiz {

	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void registerUser(User user) {
		userDao.createUser(user);
	}

	@Override
	public java.util.List<User> loginUser(User user) {
		return userDao.selectUser(user);
	}

	@Override
	public boolean modfiyUser(User user) {
		return userDao.updateUser(user);
	}

	@Override
	public boolean removeUser(User user) {
		return userDao.deleteUser(user);
	}

}
