package musicpower.dao.impl;

import java.util.List;

import musicpower.dao.AdministratorsDao;
import musicpower.entity.Administerators;
import musicpower.entity.User;


import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class AdministratorsDaoImpl implements AdministratorsDao{
	
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public Administerators loginUser(Administerators administerators) {
		// TODO Auto-generated method stub
		List<Administerators> us=hibernateTemplate.find("from Administerators where TAdministratorsUsername=? and TAdministratorsPassword=?",administerators.getTAdministratorsUsername(),administerators.getTAdministratorsPassword());
		System.err.println("llkjlkr");
		if(us.size()>0){
			return us.get(0);
		}
		return null;
	}

	@Override
	public boolean updateUser(Administerators administerators) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(Administerators administerators) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
