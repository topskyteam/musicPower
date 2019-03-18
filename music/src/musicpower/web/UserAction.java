package musicpower.web;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import musicpower.biz.UserBiz;
import musicpower.entity.User;
import musicpower.util.HttpUtils;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User> {
	
	public User user = new User();
	public UserBiz userBiz;
	private String result;
	String zong;

	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}


	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}

	@Override
	public User getModel() {
		return user;
	}
	
	
	//接收短信
	public String sms()throws UnsupportedEncodingException{
		HttpServletRequest request=ServletActionContext.getRequest();
		String niubi= new String(request.getParameter("huo").getBytes("iso-8859-1"), "utf-8");
		System.out.println(niubi);
//		String host = "https://exempt.market.alicloudapi.com";
//	    String path = "/exemptCode";
//	    String method = "GET";
//	    String appcode = "42cd6d983fbc420b94abca3be74048b9";
//	    Map<String, String> headers = new HashMap<String, String>();
//	    //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
//	    headers.put("Authorization", "APPCODE " + appcode);
		Random r=new Random();
		int one=r.nextInt(10);
		String onei=Integer.toString(one);//int类型强转为string类型
				
		int two=r.nextInt(10);
		String twoi=Integer.toString(two);
		
		int three=r.nextInt(10);
		String threei=Integer.toString(three);
		
		int four=r.nextInt(10);
		String fouri=Integer.toString(four);
		
		
	    zong=onei+twoi+threei+fouri;
	    
	    user.setZong("获取的验证码"+zong);
		System.out.println("1----"+zong);

//		
//	    Map<String, String> querys = new HashMap<String, String>();
//	    querys.put("content", "【音乐的力量】万籁寂静，远行者欢迎您，您的验证码为：{"+zong+"}，请在5分钟内使用,请勿泄露！");
//	    querys.put("phone", niubi);
//	    querys.put("sign", "1");
//	    querys.put("skin", "1");           
//	
//	    try {
//
//	    	HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
	    	//System.out.println(response.toString());如不输出json, 请打开这行代码，打印调试头部状态码。
                //状态码: 200 正常；400 URL无效；401 appCode错误； 403 次数用完； 500 API网管错误
	    	//获取response的body
//	    	System.out.println(EntityUtils.toString(response.getEntity()));
//	    } catch (Exception e) {
//	    	e.printStackTrace();
//	    }
		return SUCCESS;
	}
	
	
	//查看用户名是存在
	public String verify() throws UnsupportedEncodingException{	
		HttpServletRequest request=ServletActionContext.getRequest();
		String name=new String(request.getParameter("name").getBytes("iso-8859-1"), "utf-8");	
		
		if(userBiz.getUserByname(name)==true){
			
			result="Y";
			
		}else{
			
			result="N";
		}
		System.out.println(name);
		
		return SUCCESS;
	}
	
	//用户注册
	public String register() throws UnsupportedEncodingException{
//		HttpServletRequest request=ServletActionContext.getRequest();
//		String yzm=new String(request.getParameter("yzm").getBytes("iso-8859-1"), "utf-8");	
		System.out.println("进入用户注册方法"+user);
		
		
			
//			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
	
			userBiz.registerUser(user);
		
		return SUCCESS;
	}
	
	//校验手机号码是否存在
	public String veriphone() throws UnsupportedEncodingException{
		HttpServletRequest request=ServletActionContext.getRequest();
		String phone=new String(request.getParameter("phone").getBytes("iso-8859-1"), "utf-8");	
		if(userBiz.getUserByphone(phone)==true){
			result="Y";
		}else{
			result="N";
		}
		return SUCCESS;
	}
	
	//校验验证码是否对
	public String veryzm() throws UnsupportedEncodingException{
		HttpServletRequest request=ServletActionContext.getRequest();
		String rec= new String(request.getParameter("rc").getBytes("iso-8859-1"), "utf-8");	
		System.out.println("进入验证 码校验"+rec+"----"+zong);
		if(!rec.equals(zong)){
			result="cuo";
		}else{
			result="dui";
		}
		return  SUCCESS;
	}

}
