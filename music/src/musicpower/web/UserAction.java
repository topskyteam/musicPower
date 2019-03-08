package musicpower.web;

import musicpower.biz.UserBiz;
import musicpower.entity.User;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User> {

	public User user = new User();
	public UserBiz userBiz;
	
	@Override
	public User getModel() {
		return user;
	}

	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}

}
