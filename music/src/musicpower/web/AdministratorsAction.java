package musicpower.web;

import musicpower.biz.AdministratorsBiz;
import musicpower.entity.Administerators;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class AdministratorsAction extends ActionSupport implements ModelDriven<Administerators>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Administerators administerators=new Administerators();
	private AdministratorsBiz administratorsBiz;
	private String  error=null;
	private String correct=null;
	
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getCorrect() {
		return correct;
	}

	public void setCorrect(String correct) {
		this.correct = correct;
	}

	@Override
	public Administerators getModel() {
		// TODO Auto-generated method stub
		return administerators;
	}

	public void setAdministerators(Administerators administerators) {
		this.administerators = administerators;
	}
	
	public Administerators getAdministerators() {
		return administerators;
	}

	public void setAdministratorsBiz(AdministratorsBiz administratorsBiz) {
		this.administratorsBiz = administratorsBiz;
	}
	public String loginUser() throws Exception{
		Administerators login2=administratorsBiz.loginUser(administerators);
		if(login2==null){
			System.err.println("lalala");
			this.addActionError("登录失败：用户名或密码错误");
			return "register.jsp";
		}else{
			ActionContext.getContext().getSession().put("administerators", administerators);
			//error=null;
			return "index.jsp";
		}
		
	}

}
