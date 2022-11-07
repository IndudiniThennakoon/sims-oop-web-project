/**
 * 
 */
package com.sims.models;

import java.sql.Connection;
import java.sql.ResultSet;

import com.sims.configs.ConnectionProvider;
import com.sims.utils.QueryBuilder;

/**
 * This is the User Model class
 * 
 * @author maneesh
 */

public class User {

	private int id;
	private String name;
	private String email;
	private String password;
	private String nic;
	private String profile_photo;
	private String user_type;
	private String email_verified;
	private String email_Verify_code;
	private String password_reset_code;
	private String created_at;
	private String updated_at;
	
	public User() {}
	
	public User(int id) {
	     super(); 
	      
	     Connection con = null;
	     
	     try {
	         con = ConnectionProvider.getConnection();
	         ResultSet rSet = QueryBuilder.readData(con, "SELECT * FROM users WHERE id='"+id+"'");
	         
	         if (rSet != null) {  
	            if (rSet.next()) {
	                this.id = rSet.getInt(1);
	                this.name = rSet.getString(2);
	                this.email = rSet.getString(3);
	                this.password = "";
	                this.nic = rSet.getString(5);
	                this.profile_photo = rSet.getString(6);
	                this.user_type = rSet.getString(7);
	                this.email_verified = rSet.getString(8);
	                this.email_Verify_code = rSet.getString(9);
	                this.password_reset_code = rSet.getString(10); 
	                this.created_at = rSet.getString(11); 
	                this.updated_at = rSet.getString(12); 
	            } 
	         }
	          
	     } catch (Exception e) {
	         e.printStackTrace();
	     } 
	      
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getNic() {
		return nic;
	}

	public String getProfilePhoto() {
		return profile_photo;
	}

	public String getUserType() {
		return user_type;
	}

	public String getEmailVerified() {
		return email_verified;
	}

	public String getEmailVerifyCode() {
		return email_Verify_code;
	}

	public String getPasswordResetCode() {
		return password_reset_code;
	}

	public String getCreatedAt() {
		return created_at;
	}

	public String getUpdatedAt() {
		return updated_at;
	}


}
