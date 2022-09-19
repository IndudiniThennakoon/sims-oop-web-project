/**
 * 
 */
package com.sims.services.interfaces;

import java.util.List;

import com.sims.models.User;

/**
 * This is the Auth Service interface
 * 
 * @author maneesh
 */
public interface AuthServiceInterface {

	/**
	 * User login using email address
	 * @param email
	 * @param password
	 * @return List<User>
	 */
	public List<User> userLoginByEmail(String email, String password);
	
}
