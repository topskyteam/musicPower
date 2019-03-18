package musicpower.entity;

import java.sql.Timestamp;


/**
 * Administerators entity. @author MyEclipse Persistence Tools
 */

public class Administerators  implements java.io.Serializable {


    // Fields    

     private Integer TAdministratorsId;
     private String TAdministratorsUsername;
     private String TAdministratorsPassword;
     private Timestamp time;


    // Constructors

    /** default constructor */
    public Administerators() {
    }

	/** minimal constructor */
    public Administerators(String TAdministratorsUsername, String TAdministratorsPassword) {
        this.TAdministratorsUsername = TAdministratorsUsername;
        this.TAdministratorsPassword = TAdministratorsPassword;
    }
    
    /** full constructor */
    public Administerators(String TAdministratorsUsername, String TAdministratorsPassword, Timestamp time) {
        this.TAdministratorsUsername = TAdministratorsUsername;
        this.TAdministratorsPassword = TAdministratorsPassword;
        this.time = time;
    }

   
    // Property accessors

    public Integer getTAdministratorsId() {
        return this.TAdministratorsId;
    }
    
    public void setTAdministratorsId(Integer TAdministratorsId) {
        this.TAdministratorsId = TAdministratorsId;
    }

    public String getTAdministratorsUsername() {
        return this.TAdministratorsUsername;
    }
    
    public void setTAdministratorsUsername(String TAdministratorsUsername) {
        this.TAdministratorsUsername = TAdministratorsUsername;
    }

    public String getTAdministratorsPassword() {
        return this.TAdministratorsPassword;
    }
    
    public void setTAdministratorsPassword(String TAdministratorsPassword) {
        this.TAdministratorsPassword = TAdministratorsPassword;
    }

    public Timestamp getTime() {
        return this.time;
    }
    
    public void setTime(Timestamp time) {
        this.time = time;
    }
   








}