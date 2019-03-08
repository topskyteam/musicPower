package musicpower.entity;

import java.sql.Timestamp;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer TUserId;
	private String nickname;
	private String usename;
	private String password;
	private String sex;
	private String address;
	private String usyn;
	private String introduce;
	private Timestamp time;
	private Integer phonenumber;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String nickname, String usename, String password,
			Integer phonenumber) {
		this.nickname = nickname;
		this.usename = usename;
		this.password = password;
		this.phonenumber = phonenumber;
	}

	/** full constructor */
	public User(String nickname, String usename, String password, String sex,
			String address, String usyn, String introduce, Timestamp time,
			Integer phonenumber) {
		this.nickname = nickname;
		this.usename = usename;
		this.password = password;
		this.sex = sex;
		this.address = address;
		this.usyn = usyn;
		this.introduce = introduce;
		this.time = time;
		this.phonenumber = phonenumber;
	}

	// Property accessors

	public Integer getTUserId() {
		return this.TUserId;
	}

	public void setTUserId(Integer TUserId) {
		this.TUserId = TUserId;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getUsename() {
		return this.usename;
	}

	public void setUsename(String usename) {
		this.usename = usename;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUsyn() {
		return this.usyn;
	}

	public void setUsyn(String usyn) {
		this.usyn = usyn;
	}

	public String getIntroduce() {
		return this.introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public Integer getPhonenumber() {
		return this.phonenumber;
	}

	public void setPhonenumber(Integer phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return "User [TUserId=" + TUserId + ", nickname=" + nickname
				+ ", usename=" + usename + ", password=" + password + ", sex="
				+ sex + ", address=" + address + ", usyn=" + usyn
				+ ", introduce=" + introduce + ", time=" + time
				+ ", phonenumber=" + phonenumber + "]";
	}

	
}