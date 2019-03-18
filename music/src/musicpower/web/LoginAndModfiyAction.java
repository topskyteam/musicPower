package musicpower.web;

import musicpower.biz.UserBiz;
import musicpower.entity.User;
import musicpower.util.SessionUtil;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAndModfiyAction extends ActionSupport implements ModelDriven<User> {

	private User user = new User();
	private UserBiz userBiz;
	private boolean result;
	
	public boolean getResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	@Override
	public User getModel() {
		return user;
	}

	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}
//	登录
	public String get() {
		java.util.List<User> list = userBiz.loginUser(user);
		SessionUtil.put("user", list.get(0));
		return "index";
	}
	
	public String getUsernameAndPassword() {
		java.util.List<User> list = userBiz.loginUser(user);
		if (list.size() == 0) {
			result = false;
		} else {
			result = true;
		}
		return SUCCESS;
	}
	
	public String getUserById() {
		java.util.List<User> list = userBiz.loginUser(user);
		SessionUtil.put("editUser", list.get(0));
		
		return "personal";
	}
	public String edit() {

		return "personal";
	}
}
