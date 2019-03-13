package musicpower.web;

import musicpower.biz.UserBiz;
import musicpower.entity.User;
import musicpower.util.SessionUtil;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<User> {

	private User user = new User();
	private UserBiz userBiz;
	
	@Override
	public User getModel() {
		return user;
	}

	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}

	public String get() {
		user = userBiz.loginUser(user);
		SessionUtil.put("user", user);
		System.out.println("out"+user);
		return "index";
	}
}
