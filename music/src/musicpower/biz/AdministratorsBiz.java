package musicpower.biz;

import musicpower.entity.Administerators;

public interface AdministratorsBiz {
	
	/**
	 * 登录
	 * @param user
	 * @return
	 */
	public Administerators loginUser(Administerators administerators);
	
	/**
	 * 修改
	 * @param user
	 * @return
	 */
	public boolean modfiyUser(Administerators administerators);
	
	/**
	 * 删除
	 * @param user
	 * @return
	 */
	public boolean removeUser(Administerators administerators);
}
