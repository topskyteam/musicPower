package musicpower.entity;

import java.sql.Timestamp;


/**
 * User entity. @author MyEclipse Persistence Tools
 */

<<<<<<< HEAD
public class User implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer TUserId;
	private String nickname;
	private String username;
	private String password;
	private String sex;
	private String address;
	private String usyn;
	private String introduce;
	private Timestamp time;
	private String phonenumber;
	private String zong;  //随机数

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(Integer TUserId, String username, String password,
			String phonenumber) {
		this.username = username;
		this.password = password;
		this.phonenumber = phonenumber;
		this.TUserId=TUserId;
	}

	/** full constructor */
	public User(String nickname, String username, String password, String sex,
			String address, String usyn, String introduce, Timestamp time,
			String phonenumber) {
		this.nickname = nickname;
		this.username = username;
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

	public String getZong() {
		return zong;
	}

	public void setZong(String zong) {
		this.zong = zong;
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

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
=======
public class User  implements java.io.Serializable {


    // Fields    

     private Integer TUserId;
     private String nickname;
     private String username;
     private String password;
     private String sex;
     private String address;
     private String usyn;
     private String introduce;
     private Timestamp time;
     private String phonenumber;
>>>>>>> ef39843ae378e163c111536fbfadf73d14c21deb


    // Constructors

    /** default constructor */
    public User() {
    }

<<<<<<< HEAD
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

	public String getPhonenumber() {
		return this.phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
=======
	/** minimal constructor */
    public User(String nickname, String username, String password, String phonenumber) {
        this.nickname = nickname;
        this.username = username;
        this.password = password;
        this.phonenumber = phonenumber;
    }
    
    /** full constructor */
    public User(String nickname, String username, String password, String sex, String address, String usyn, String introduce, Timestamp time, String phonenumber) {
        this.nickname = nickname;
        this.username = username;
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

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
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

    public String getPhonenumber() {
        return this.phonenumber;
    }
    
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
>>>>>>> ef39843ae378e163c111536fbfadf73d14c21deb

	@Override
	public String toString() {
		return "User [TUserId=" + TUserId + ", nickname=" + nickname
<<<<<<< HEAD
				+ ", usename=" + username + ", password=" + password + ", sex="
				+ sex + ", address=" + address + ", usyn=" + usyn
=======
				+ ", username=" + username + ", password=" + password
				+ ", sex=" + sex + ", address=" + address + ", usyn=" + usyn
>>>>>>> ef39843ae378e163c111536fbfadf73d14c21deb
				+ ", introduce=" + introduce + ", time=" + time
				+ ", phonenumber=" + phonenumber + "]";
	}
   
}