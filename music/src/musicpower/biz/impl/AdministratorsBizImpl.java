package musicpower.biz.impl;

import musicpower.biz.AdministratorsBiz;
import musicpower.dao.AdministratorsDao;
import musicpower.entity.Administerators;


public class AdministratorsBizImpl implements AdministratorsBiz{
	
	private AdministratorsDao administratorsDao;
	
	public void setAdministratorsDao(AdministratorsDao administratorsDao) {
		this.administratorsDao = administratorsDao;
	}

	@Override
	public Administerators loginUser(Administerators administerators) {
		// TODO Auto-generated method stub
		return administratorsDao.loginUser(administerators);
	}

	@Override
	public boolean modfiyUser(Administerators administerators) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeUser(Administerators administerators) {
		// TODO Auto-generated method stub
		return false;
	}

}
