/**
 * 
 */
package com.sims.models;

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
	private String profilePhoto;
	private String userType;
	private String emailVerified;
	private String emailVerifyCode;
	private String passwordResetCode;
	private String createdAt;
	private String updatedAt;
	
	public User(int id, String name, String email, String password, String nic, String profilePhoto, String userType,
			String emailVerified, String emailVerifyCode, String passwordResetCode, String createdAt,
			String updatedAt) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.nic = nic;
		this.profilePhoto = profilePhoto;
		this.userType = userType;
		this.emailVerified = emailVerified;
		this.emailVerifyCode = emailVerifyCode;
		this.passwordResetCode = passwordResetCode;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
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
		return profilePhoto;
	}

	public String getUserType() {
		return userType;
	}

	public String getEmailVerified() {
		return emailVerified;
	}

	public String getEmailVerifyCode() {
		return emailVerifyCode;
	}

	public String getPasswordResetCode() {
		return passwordResetCode;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}


}
