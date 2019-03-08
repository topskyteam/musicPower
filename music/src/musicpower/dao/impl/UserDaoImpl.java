package musicpower.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import musicpower.dao.UserDao;
import musicpower.entity.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	@Override
	public void createUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User selectUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
