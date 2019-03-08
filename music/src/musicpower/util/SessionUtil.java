package musicpower.util;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

/**
 * 封装private Map<String, Object> session;
 */

public class SessionUtil {

	

	private Map<String, Object> session;
	
	/**
	 * 封装session.put()方法
	 * @param key
	 * @param object
	 */
	public void put(String key, Object object) {
		session = ActionContext.getContext().getSession();
		session.put(key, object);
	}
}
